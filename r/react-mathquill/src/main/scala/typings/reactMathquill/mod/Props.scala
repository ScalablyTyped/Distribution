package typings.reactMathquill.mod

import typings.edtrIoMathquill.mod.Config
import typings.edtrIoMathquill.mod.MQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.ComponentProps<'span'>, 'onChange'> ]: react.react.ComponentProps<'span'>[P]} */ @js.native
trait Props extends js.Object {
  var config: js.UndefOr[Config] = js.native
  var latex: js.UndefOr[String] = js.native
  var mathquillDidMount: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* mathField */ MQ, Unit]] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: Config): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setLatex(value: String): Self = this.set("latex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatex: Self = this.set("latex", js.undefined)
    @scala.inline
    def setMathquillDidMount(value: /* mathField */ MQ => Unit): Self = this.set("mathquillDidMount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMathquillDidMount: Self = this.set("mathquillDidMount", js.undefined)
    @scala.inline
    def setOnChange(value: /* mathField */ MQ => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}


package typings.reactSpring.webMod

import typings.reactSpring.renderpropsUniversalMod.SpringConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSpringBaseProps extends HooksBaseProps {
  var config: js.UndefOr[SpringConfig | (js.Function1[/* key */ String, SpringConfig])] = js.native
}

object UseSpringBaseProps {
  @scala.inline
  def apply(): UseSpringBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseSpringBaseProps]
  }
  @scala.inline
  implicit class UseSpringBasePropsOps[Self <: UseSpringBaseProps] (val x: Self) extends AnyVal {
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
    def setConfigFunction1(value: /* key */ String => SpringConfig): Self = this.set("config", js.Any.fromFunction1(value))
    @scala.inline
    def setConfig(value: SpringConfig | (js.Function1[/* key */ String, SpringConfig])): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
  
}


package typings.reactAlbus.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WizardProps extends js.Object {
  var basename: js.UndefOr[String] = js.native
  var history: js.UndefOr[History[LocationState]] = js.native
  var onNext: js.UndefOr[js.Function1[/* wizard */ WizardContext, Unit]] = js.native
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, ReactNode]] = js.native
}

object WizardProps {
  @scala.inline
  def apply(): WizardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardProps]
  }
  @scala.inline
  implicit class WizardPropsOps[Self <: WizardProps] (val x: Self) extends AnyVal {
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    @scala.inline
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setOnNext(value: /* wizard */ WizardContext => Unit): Self = this.set("onNext", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNext: Self = this.set("onNext", js.undefined)
    @scala.inline
    def setRender(value: /* wizard */ WizardContext => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}


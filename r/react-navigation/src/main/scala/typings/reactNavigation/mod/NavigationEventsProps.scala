package typings.reactNavigation.mod

import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationEventsProps extends ViewProps {
  var onDidBlur: js.UndefOr[NavigationEventCallback] = js.native
  var onDidFocus: js.UndefOr[NavigationEventCallback] = js.native
  var onWillBlur: js.UndefOr[NavigationEventCallback] = js.native
  var onWillFocus: js.UndefOr[NavigationEventCallback] = js.native
}

object NavigationEventsProps {
  @scala.inline
  def apply(): NavigationEventsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationEventsProps]
  }
  @scala.inline
  implicit class NavigationEventsPropsOps[Self <: NavigationEventsProps] (val x: Self) extends AnyVal {
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
    def setOnDidBlur(value: /* payload */ NavigationEventPayload => Unit): Self = this.set("onDidBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidBlur: Self = this.set("onDidBlur", js.undefined)
    @scala.inline
    def setOnDidFocus(value: /* payload */ NavigationEventPayload => Unit): Self = this.set("onDidFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidFocus: Self = this.set("onDidFocus", js.undefined)
    @scala.inline
    def setOnWillBlur(value: /* payload */ NavigationEventPayload => Unit): Self = this.set("onWillBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillBlur: Self = this.set("onWillBlur", js.undefined)
    @scala.inline
    def setOnWillFocus(value: /* payload */ NavigationEventPayload => Unit): Self = this.set("onWillFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillFocus: Self = this.set("onWillFocus", js.undefined)
  }
  
}


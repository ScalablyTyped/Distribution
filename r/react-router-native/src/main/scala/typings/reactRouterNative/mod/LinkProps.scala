package typings.reactRouterNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps
  extends /* propName */ StringDictionary[js.Any] {
  var component: js.UndefOr[ComponentType[_]] = js.native
  var replace: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var to: LocationDescriptor[LocationState] = js.native
}

object LinkProps {
  @scala.inline
  def apply(to: LocationDescriptor[LocationState]): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
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
    def setTo(value: LocationDescriptor[LocationState]): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: ComponentType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}


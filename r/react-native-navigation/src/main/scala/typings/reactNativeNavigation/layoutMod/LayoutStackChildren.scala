package typings.reactNativeNavigation.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutStackChildren extends js.Object {
  /**
    * Set component
    */
  var component: js.UndefOr[LayoutComponent[js.Object]] = js.native
  /**
    * Set the external component
    */
  var externalComponent: js.UndefOr[ExternalComponent] = js.native
}

object LayoutStackChildren {
  @scala.inline
  def apply(): LayoutStackChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutStackChildren]
  }
  @scala.inline
  implicit class LayoutStackChildrenOps[Self <: LayoutStackChildren] (val x: Self) extends AnyVal {
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
    def setComponent(value: LayoutComponent[js.Object]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setExternalComponent(value: ExternalComponent): Self = this.set("externalComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalComponent: Self = this.set("externalComponent", js.undefined)
  }
  
}


package typings.reactNativeWindows.flyoutPropsMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFlyoutProps extends ViewProps {
  
  var horizontalOffset: js.UndefOr[Double] = js.native
  
  var isLightDismissEnabled: js.UndefOr[Boolean] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the area outside the flyout is darkened
    */
  var isOverlayEnabled: js.UndefOr[Boolean] = js.native
  
  var onDismiss: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var target: js.UndefOr[ReactNode] = js.native
  
  var verticalOffset: js.UndefOr[Double] = js.native
}
object IFlyoutProps {
  
  @scala.inline
  def apply(): IFlyoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlyoutProps]
  }
  
  @scala.inline
  implicit class IFlyoutPropsOps[Self <: IFlyoutProps] (val x: Self) extends AnyVal {
    
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
    def setHorizontalOffset(value: Double): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOffset: Self = this.set("horizontalOffset", js.undefined)
    
    @scala.inline
    def setIsLightDismissEnabled(value: Boolean): Self = this.set("isLightDismissEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLightDismissEnabled: Self = this.set("isLightDismissEnabled", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setIsOverlayEnabled(value: Boolean): Self = this.set("isOverlayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOverlayEnabled: Self = this.set("isOverlayEnabled", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* isOpen */ Boolean => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setTarget(value: ReactNode): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setVerticalOffset(value: Double): Self = this.set("verticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOffset: Self = this.set("verticalOffset", js.undefined)
  }
}

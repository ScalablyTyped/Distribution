package typings.reactNativeWindows.popupPropsMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPopupProps extends ViewProps {
  
  /**
    * Sets whether the Popup will automatically receive focus when opened.
    * Defaults to true. Always true when isLightDismissEnabled === true.
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var horizontalOffset: js.UndefOr[Double] = js.native
  
  /**
    * Configures the Popup with a transparent backdrop.
    */
  var isLightDismissEnabled: js.UndefOr[Boolean] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Sets a React element to use as an anchor point. When set, the popup will be positioned relative to it.
    */
  var target: js.UndefOr[ReactNode] = js.native
  
  var verticalOffset: js.UndefOr[Double] = js.native
}
object IPopupProps {
  
  @scala.inline
  def apply(): IPopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupProps]
  }
  
  @scala.inline
  implicit class IPopupPropsOps[Self <: IPopupProps] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
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
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
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

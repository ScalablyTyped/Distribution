package typings.reactNativeShare.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareSheetProps extends StObject {
  
  var children: ReactNode = js.native
  
  def onCancel(): Unit = js.native
  
  var overlayStyle: js.UndefOr[StyleProp[ViewProps]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewProps]] = js.native
  
  var visible: Boolean = js.native
}
object ShareSheetProps {
  
  @scala.inline
  def apply(onCancel: () => Unit, visible: Boolean): ShareSheetProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareSheetProps]
  }
  
  @scala.inline
  implicit class ShareSheetPropsMutableBuilder[Self <: ShareSheetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverlayStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
    
    @scala.inline
    def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}

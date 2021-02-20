package typings.reactNativeModals.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalTitleProps extends StObject {
  
  var align: js.UndefOr[AlignTypes] = js.native
  
  var hasTitleBar: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var title: String = js.native
}
object ModalTitleProps {
  
  @scala.inline
  def apply(title: String): ModalTitleProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalTitleProps]
  }
  
  @scala.inline
  implicit class ModalTitlePropsMutableBuilder[Self <: ModalTitleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignTypes): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setHasTitleBar(value: Boolean): Self = StObject.set(x, "hasTitleBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTitleBarUndefined: Self = StObject.set(x, "hasTitleBar", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

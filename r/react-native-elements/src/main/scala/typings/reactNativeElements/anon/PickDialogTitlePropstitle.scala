package typings.reactNativeElements.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativeElements.textMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-elements.react-native-elements/dist/dialog/DialogTitle.DialogTitleProps, 'title' | 'titleStyle' | 'titleProps'> */
trait PickDialogTitlePropstitle extends StObject {
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleProps: js.UndefOr[TextProps] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object PickDialogTitlePropstitle {
  
  inline def apply(): PickDialogTitlePropstitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDialogTitlePropstitle]
  }
  
  extension [Self <: PickDialogTitlePropstitle](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleProps(value: TextProps): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

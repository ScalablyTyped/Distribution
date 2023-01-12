package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativeElements.anon.PickTextPropsstyleStylePr
import typings.reactNativeElements.anon.TextPropsstyleStylePropTeAccessibilityActions
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextTextMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/text/Text", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTextPropsstyleStylePr] | ForwardRefExoticComponent[TextPropsstyleStylePropTeAccessibilityActions] = js.native
  
  @JSImport("react-native-elements/dist/text/Text", "TextElement")
  @js.native
  val TextElement: RneFunctionComponent[TextProps] = js.native
  
  trait TextProps
    extends StObject
       with typings.reactNative.mod.TextProps {
    
    var h1: js.UndefOr[Boolean] = js.undefined
    
    var h1Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var h2: js.UndefOr[Boolean] = js.undefined
    
    var h2Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var h3: js.UndefOr[Boolean] = js.undefined
    
    var h3Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var h4: js.UndefOr[Boolean] = js.undefined
    
    var h4Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object TextProps {
    
    inline def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
      
      inline def setH1(value: Boolean): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h1Style", value.asInstanceOf[js.Any])
      
      inline def setH1StyleNull: Self = StObject.set(x, "h1Style", null)
      
      inline def setH1StyleUndefined: Self = StObject.set(x, "h1Style", js.undefined)
      
      inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      inline def setH2(value: Boolean): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH2Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h2Style", value.asInstanceOf[js.Any])
      
      inline def setH2StyleNull: Self = StObject.set(x, "h2Style", null)
      
      inline def setH2StyleUndefined: Self = StObject.set(x, "h2Style", js.undefined)
      
      inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      inline def setH3(value: Boolean): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH3Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h3Style", value.asInstanceOf[js.Any])
      
      inline def setH3StyleNull: Self = StObject.set(x, "h3Style", null)
      
      inline def setH3StyleUndefined: Self = StObject.set(x, "h3Style", js.undefined)
      
      inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      inline def setH4(value: Boolean): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH4Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h4Style", value.asInstanceOf[js.Any])
      
      inline def setH4StyleNull: Self = StObject.set(x, "h4Style", null)
      
      inline def setH4StyleUndefined: Self = StObject.set(x, "h4Style", js.undefined)
      
      inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickTextPropsstyleStylePr] | ForwardRefExoticComponent[TextPropsstyleStylePropTeAccessibilityActions]
  
  /* This means you don't have to write `default`, but can instead just say `distTextTextMod.foo` */
  override def _to: FunctionComponent[PickTextPropsstyleStylePr] | ForwardRefExoticComponent[TextPropsstyleStylePropTeAccessibilityActions] = default
}

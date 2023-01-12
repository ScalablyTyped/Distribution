package typings.reactNativeRatings

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsStarMod extends Shortcut {
  
  @JSImport("react-native-ratings/dist/components/Star", JSImport.Default)
  @js.native
  val default: FunctionComponent[StarProps] = js.native
  
  trait StarProps extends StObject {
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var selectedColor: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var starImage: js.UndefOr[String] = js.undefined
    
    var starSelectedInPosition: js.UndefOr[js.Function1[/* number */ Any, Unit]] = js.undefined
    
    var starStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var unSelectedColor: js.UndefOr[String] = js.undefined
  }
  object StarProps {
    
    inline def apply(): StarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StarProps] (val x: Self) extends AnyVal {
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStarImage(value: String): Self = StObject.set(x, "starImage", value.asInstanceOf[js.Any])
      
      inline def setStarImageUndefined: Self = StObject.set(x, "starImage", js.undefined)
      
      inline def setStarSelectedInPosition(value: /* number */ Any => Unit): Self = StObject.set(x, "starSelectedInPosition", js.Any.fromFunction1(value))
      
      inline def setStarSelectedInPositionUndefined: Self = StObject.set(x, "starSelectedInPosition", js.undefined)
      
      inline def setStarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "starStyle", value.asInstanceOf[js.Any])
      
      inline def setStarStyleNull: Self = StObject.set(x, "starStyle", null)
      
      inline def setStarStyleUndefined: Self = StObject.set(x, "starStyle", js.undefined)
      
      inline def setUnSelectedColor(value: String): Self = StObject.set(x, "unSelectedColor", value.asInstanceOf[js.Any])
      
      inline def setUnSelectedColorUndefined: Self = StObject.set(x, "unSelectedColor", js.undefined)
    }
  }
  
  type _To = FunctionComponent[StarProps]
  
  /* This means you don't have to write `default`, but can instead just say `distComponentsStarMod.foo` */
  override def _to: FunctionComponent[StarProps] = default
}

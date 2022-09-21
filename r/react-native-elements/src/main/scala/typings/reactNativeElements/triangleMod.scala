package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triangleMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/tooltip/Triangle", JSImport.Default)
  @js.native
  val default: FunctionComponent[TriangleProps] = js.native
  
  trait TriangleProps extends StObject {
    
    var isDown: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object TriangleProps {
    
    inline def apply(): TriangleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriangleProps]
    }
    
    extension [Self <: TriangleProps](x: Self) {
      
      inline def setIsDown(value: Boolean): Self = StObject.set(x, "isDown", value.asInstanceOf[js.Any])
      
      inline def setIsDownUndefined: Self = StObject.set(x, "isDown", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FunctionComponent[TriangleProps]
  
  /* This means you don't have to write `default`, but can instead just say `triangleMod.foo` */
  override def _to: FunctionComponent[TriangleProps] = default
}

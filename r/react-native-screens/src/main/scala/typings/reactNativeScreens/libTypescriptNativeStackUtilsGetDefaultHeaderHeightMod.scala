package typings.reactNativeScreens

import typings.reactNativeScreens.libTypescriptTypesMod.StackPresentationTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNativeStackUtilsGetDefaultHeaderHeightMod {
  
  @JSImport("react-native-screens/lib/typescript/native-stack/utils/getDefaultHeaderHeight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(layout: Layout, topInset: Double, stackPresentation: StackPresentationTypes): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(layout.asInstanceOf[js.Any], topInset.asInstanceOf[js.Any], stackPresentation.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Layout extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Layout {
    
    inline def apply(height: Double, width: Double): Layout = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    extension [Self <: Layout](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

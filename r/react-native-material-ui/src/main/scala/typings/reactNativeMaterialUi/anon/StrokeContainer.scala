package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrokeContainer extends StObject {
  
  var container: js.UndefOr[ViewStyle] = js.undefined
  
  var content: js.UndefOr[ViewStyle] = js.undefined
  
  var strokeContainer: js.UndefOr[ViewStyle] = js.undefined
}
object StrokeContainer {
  
  inline def apply(): StrokeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeContainer]
  }
  
  extension [Self <: StrokeContainer](x: Self) {
    
    inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setStrokeContainer(value: ViewStyle): Self = StObject.set(x, "strokeContainer", value.asInstanceOf[js.Any])
    
    inline def setStrokeContainerNull: Self = StObject.set(x, "strokeContainer", null)
    
    inline def setStrokeContainerUndefined: Self = StObject.set(x, "strokeContainer", js.undefined)
  }
}

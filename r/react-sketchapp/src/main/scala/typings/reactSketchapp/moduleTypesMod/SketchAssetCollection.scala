package typings.reactSketchapp.moduleTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchAssetCollection extends StObject {
  
  def colors(): js.Array[MSColor]
  
  def gradients(): js.Array[MSGradient]
}
object SketchAssetCollection {
  
  inline def apply(colors: () => js.Array[MSColor], gradients: () => js.Array[MSGradient]): SketchAssetCollection = {
    val __obj = js.Dynamic.literal(colors = js.Any.fromFunction0(colors), gradients = js.Any.fromFunction0(gradients))
    __obj.asInstanceOf[SketchAssetCollection]
  }
  
  extension [Self <: SketchAssetCollection](x: Self) {
    
    inline def setColors(value: () => js.Array[MSColor]): Self = StObject.set(x, "colors", js.Any.fromFunction0(value))
    
    inline def setGradients(value: () => js.Array[MSGradient]): Self = StObject.set(x, "gradients", js.Any.fromFunction0(value))
  }
}

package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchAssetCollection extends StObject {
  
  def colors(): js.Array[MSColor] = js.native
  
  def gradients(): js.Array[MSGradient] = js.native
}
object SketchAssetCollection {
  
  @scala.inline
  def apply(colors: () => js.Array[MSColor], gradients: () => js.Array[MSGradient]): SketchAssetCollection = {
    val __obj = js.Dynamic.literal(colors = js.Any.fromFunction0(colors), gradients = js.Any.fromFunction0(gradients))
    __obj.asInstanceOf[SketchAssetCollection]
  }
  
  @scala.inline
  implicit class SketchAssetCollectionMutableBuilder[Self <: SketchAssetCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: () => js.Array[MSColor]): Self = StObject.set(x, "colors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGradients(value: () => js.Array[MSGradient]): Self = StObject.set(x, "gradients", js.Any.fromFunction0(value))
  }
}

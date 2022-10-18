package typings.reactSketchapp.libModuleTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchPage extends StObject {
  
  def children(): js.Array[SketchLayer]
  
  def layers(): js.Array[SketchLayer]
  
  def name(): NSString
  
  def setName(name: String): Unit
}
object SketchPage {
  
  inline def apply(
    children: () => js.Array[SketchLayer],
    layers: () => js.Array[SketchLayer],
    name: () => NSString,
    setName: String => Unit
  ): SketchPage = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction0(children), layers = js.Any.fromFunction0(layers), name = js.Any.fromFunction0(name), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SketchPage]
  }
  
  extension [Self <: SketchPage](x: Self) {
    
    inline def setChildren(value: () => js.Array[SketchLayer]): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
    
    inline def setLayers(value: () => js.Array[SketchLayer]): Self = StObject.set(x, "layers", js.Any.fromFunction0(value))
    
    inline def setName(value: () => NSString): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}

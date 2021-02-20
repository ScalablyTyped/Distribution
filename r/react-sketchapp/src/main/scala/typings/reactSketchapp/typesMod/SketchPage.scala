package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchPage extends StObject {
  
  def layers(): js.Array[SketchLayer] = js.native
  
  def name(): NSString = js.native
  
  def setName(name: String): Unit = js.native
}
object SketchPage {
  
  @scala.inline
  def apply(layers: () => js.Array[SketchLayer], name: () => NSString, setName: String => Unit): SketchPage = {
    val __obj = js.Dynamic.literal(layers = js.Any.fromFunction0(layers), name = js.Any.fromFunction0(name), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SketchPage]
  }
  
  @scala.inline
  implicit class SketchPageMutableBuilder[Self <: SketchPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: () => js.Array[SketchLayer]): Self = StObject.set(x, "layers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: () => NSString): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}

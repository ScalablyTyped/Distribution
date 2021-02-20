package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjFacetValue extends StObject {
  
  def count(): Double = js.native
  
  def includedObjs(): js.Array[Obj] = js.native
  
  def name(): String = js.native
}
object ObjFacetValue {
  
  @scala.inline
  def apply(count: () => Double, includedObjs: () => js.Array[Obj], name: () => String): ObjFacetValue = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), includedObjs = js.Any.fromFunction0(includedObjs), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[ObjFacetValue]
  }
  
  @scala.inline
  implicit class ObjFacetValueMutableBuilder[Self <: ObjFacetValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncludedObjs(value: () => js.Array[Obj]): Self = StObject.set(x, "includedObjs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
  }
}

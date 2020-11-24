package typings.scrivito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjFacetValue extends js.Object {
  
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
  implicit class ObjFacetValueOps[Self <: ObjFacetValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncludedObjs(value: () => js.Array[Obj]): Self = this.set("includedObjs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: () => String): Self = this.set("name", js.Any.fromFunction0(value))
  }
}

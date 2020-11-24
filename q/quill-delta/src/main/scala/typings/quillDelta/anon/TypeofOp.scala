package typings.quillDelta.anon

import typings.quillDelta.iteratorMod.default
import typings.quillDelta.opMod.Op
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOp extends js.Object {
  
  def iterator(ops: js.Array[Op]): default = js.native
  
  def length(op: Op): Double = js.native
}
object TypeofOp {
  
  @scala.inline
  def apply(iterator: js.Array[Op] => default, length: Op => Double): TypeofOp = {
    val __obj = js.Dynamic.literal(iterator = js.Any.fromFunction1(iterator), length = js.Any.fromFunction1(length))
    __obj.asInstanceOf[TypeofOp]
  }
  
  @scala.inline
  implicit class TypeofOpOps[Self <: TypeofOp] (val x: Self) extends AnyVal {
    
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
    def setIterator(value: js.Array[Op] => default): Self = this.set("iterator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Op => Double): Self = this.set("length", js.Any.fromFunction1(value))
  }
}

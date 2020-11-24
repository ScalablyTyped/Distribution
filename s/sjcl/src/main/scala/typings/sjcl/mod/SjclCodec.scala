package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait SjclCodec[T] extends js.Object {
  
  def fromBits(bits: BitArray_): T = js.native
  
  def toBits(value: T): BitArray_ = js.native
}
object SjclCodec {
  
  @scala.inline
  def apply[T](fromBits: BitArray_ => T, toBits: T => BitArray_): SjclCodec[T] = {
    val __obj = js.Dynamic.literal(fromBits = js.Any.fromFunction1(fromBits), toBits = js.Any.fromFunction1(toBits))
    __obj.asInstanceOf[SjclCodec[T]]
  }
  
  @scala.inline
  implicit class SjclCodecOps[Self <: SjclCodec[_], T] (val x: Self with SjclCodec[T]) extends AnyVal {
    
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
    def setFromBits(value: BitArray_ => T): Self = this.set("fromBits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBits(value: T => BitArray_): Self = this.set("toBits", js.Any.fromFunction1(value))
  }
}

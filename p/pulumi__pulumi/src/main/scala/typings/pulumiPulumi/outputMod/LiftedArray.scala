package typings.pulumiPulumi.outputMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiftedArray[T] extends /* n */ NumberDictionary[Output_[T]] {
  
  /**
    * Gets the length of the array. This is a number one higher than the highest element defined
    * in an array.
    */
  val length: Output_[Double] = js.native
}
object LiftedArray {
  
  @scala.inline
  def apply[T](length: Output_[Double]): LiftedArray[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftedArray[T]]
  }
  
  @scala.inline
  implicit class LiftedArrayOps[Self <: LiftedArray[_], T] (val x: Self with LiftedArray[T]) extends AnyVal {
    
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
    def setLength(value: Output_[Double]): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}

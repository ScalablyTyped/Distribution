package typings.pulumiPulumi.outputMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiftedArray[T] extends /* n */ NumberDictionary[Output_[T]] {
  /**
    * Gets the length of the array. This is a number one higher than the highest element defined
    * in an array.
    */
  val length: Output_[Double]
}

object LiftedArray {
  @scala.inline
  def apply[T](length: Output_[Double], NumberDictionary: /* n */ NumberDictionary[Output_[T]] = null): LiftedArray[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[LiftedArray[T]]
  }
}


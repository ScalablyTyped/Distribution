package typings.atPulumiPulumi.outputMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiftedArray[T] extends /* n */ NumberDictionary[Output[T]] {
  /**
    * Gets the length of the array. This is a number one higher than the highest element defined
    * in an array.
    */
  val length: Output[Double]
}

object LiftedArray {
  @scala.inline
  def apply[T](length: Output[Double], NumberDictionary: /* n */ NumberDictionary[Output[T]] = null): LiftedArray[T] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[LiftedArray[T]]
  }
}


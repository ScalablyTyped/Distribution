package typings
package atPulumiPulumiLib.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiftedArray[T]
  extends /* n */ org.scalablytyped.runtime.NumberDictionary[Output[T]] {
  /**
    * Gets the length of the array. This is a number one higher than the highest element defined
    * in an array.
    */
  val length: Output[scala.Double]
}

object LiftedArray {
  @scala.inline
  def apply[T](
    length: Output[scala.Double],
    NumberDictionary: /* n */ org.scalablytyped.runtime.NumberDictionary[Output[T]] = null
  ): LiftedArray[T] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[LiftedArray[T]]
  }
}


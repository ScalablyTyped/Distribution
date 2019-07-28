package typings.splitDotJs.splitDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  // collapse changes the size of element at index to 0.
  // Every element except the last is collapsed towards the front (left or top).
  // The last is collapsed towards the back.
  // Not supported in IE8.
  def collapse(index: Double): Unit
  // Destroy the instance. It removes the gutter elements, and the size CSS styles Split.js set.
  def destroy(): Unit
  // getSizes returns an array of percents, suitable for using with setSizes or creation.
  // Not supported in IE8.
  def getSizes(): js.Array[Double]
  // setSizes behaves the same as the sizes configuration option, passing an array of percents or CSS values.
  // It updates the sizes of the elements in the split.
  def setSizes(sizes: js.Array[Double]): Unit
}

object Instance {
  @scala.inline
  def apply(
    collapse: Double => Unit,
    destroy: () => Unit,
    getSizes: () => js.Array[Double],
    setSizes: js.Array[Double] => Unit
  ): Instance = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction1(collapse), destroy = js.Any.fromFunction0(destroy), getSizes = js.Any.fromFunction0(getSizes), setSizes = js.Any.fromFunction1(setSizes))
  
    __obj.asInstanceOf[Instance]
  }
}


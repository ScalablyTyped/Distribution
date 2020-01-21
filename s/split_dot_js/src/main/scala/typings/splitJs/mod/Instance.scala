package typings.splitJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  // collapse changes the size of element at index to 0.
  // Every element except the last is collapsed towards the front (left or top).
  // The last is collapsed towards the back.
  // Not supported in IE8.
  def collapse(index: Double): Unit = js.native
  // Destroy the instance. It removes the gutter elements, and the size CSS styles Split.js set.
  def destroy(): Unit = js.native
  def destroy(preserveStyles: Boolean): Unit = js.native
  def destroy(preserveStyles: Boolean, preserveGutters: Boolean): Unit = js.native
  // getSizes returns an array of percents, suitable for using with setSizes or creation.
  // Not supported in IE8.
  def getSizes(): js.Array[Double] = js.native
  // setSizes behaves the same as the sizes configuration option, passing an array of percents or CSS values.
  // It updates the sizes of the elements in the split.
  def setSizes(sizes: js.Array[Double]): Unit = js.native
}


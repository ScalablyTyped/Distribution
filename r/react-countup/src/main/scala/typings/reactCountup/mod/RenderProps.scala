package typings.reactCountup.mod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps extends js.Object {
  /**
    * Ref to hook the countUp instance to
    */
  var countUpRef: RefObject[_] = js.native
  /**
    * Pauses or resumes the transition
    */
  def pauseResume(): Unit = js.native
  /**
    * Resets to initial value
    */
  def reset(): Unit = js.native
  /**
    * Starts or restarts the transition
    */
  def start(): Unit = js.native
  /**
    * Updates transition to the new end value (if given)
    */
  def update(): Unit = js.native
  def update(newEnd: Double): Unit = js.native
}


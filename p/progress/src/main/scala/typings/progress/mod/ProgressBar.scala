package typings.progress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flexible ascii progress bar.
  */
@js.native
trait ProgressBar extends js.Object {
  /**
    * Completed status of progress (Boolean)
    */
  var complete: Boolean = js.native
  /**
    * Current tick number.
    */
  var curr: Double = js.native
  /**
    * Total number of ticks to complete.
    */
  var total: Double = js.native
  /**
    * "interrupt" the progress bar and write a message above it.
    */
  def interrupt(message: String): Unit = js.native
  /**
    * Method to render the progress bar with optional `tokens` to place in the
    * progress bar's `fmt` field.
    */
  def render(): Unit = js.native
  def render(tokens: js.Any): Unit = js.native
  /**
    * Terminates a progress bar.
    */
  def terminate(): Unit = js.native
  /**
    * "tick" the progress bar with optional `len` and optional `tokens`.
    */
  def tick(): Unit = js.native
  def tick(count: js.UndefOr[scala.Nothing], tokens: js.Any): Unit = js.native
  def tick(count: Double): Unit = js.native
  def tick(count: Double, tokens: js.Any): Unit = js.native
  def tick(tokens: js.Any): Unit = js.native
  /**
    * "update" the progress bar to represent an exact percentage.
    * The ratio (between 0 and 1) specified will be multiplied by `total` and
    * floored, representing the closest available "tick." For example, if a
    * progress bar has a length of 3 and `update(0.5)` is called, the progress
    * will be set to 1.
    *
    * A ratio of 0.5 will attempt to set the progress to halfway.
    *
    * @param ratio The ratio (between 0 and 1 inclusive) to set the
    *   overall completion to.
    */
  def update(ratio: Double): Unit = js.native
  def update(ratio: Double, tokens: js.Any): Unit = js.native
}


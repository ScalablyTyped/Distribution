package typings
package progressLib.progressMod

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
  var complete: scala.Boolean = js.native
  /**
       * "interrupt" the progress bar and write a message above it.
       */
  def interrupt(message: java.lang.String): scala.Unit = js.native
  /**
       * Method to render the progress bar with optional `tokens` to place in the
       * progress bar's `fmt` field.
       */
  def render(): scala.Unit = js.native
  /**
       * Method to render the progress bar with optional `tokens` to place in the
       * progress bar's `fmt` field.
       */
  def render(tokens: js.Any): scala.Unit = js.native
  /**
       * Terminates a progress bar.
       */ 
  def terminate(): scala.Unit = js.native
  /**
       * "tick" the progress bar with optional `len` and optional `tokens`.
       */
  def tick(): scala.Unit = js.native
  def tick(count: scala.Double): scala.Unit = js.native
  def tick(count: scala.Double, tokens: js.Any): scala.Unit = js.native
  /**
       * "tick" the progress bar with optional `len` and optional `tokens`.
       */
  def tick(tokens: js.Any): scala.Unit = js.native
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
  def update(ratio: scala.Double): scala.Unit = js.native
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
  def update(ratio: scala.Double, tokens: js.Any): scala.Unit = js.native
}


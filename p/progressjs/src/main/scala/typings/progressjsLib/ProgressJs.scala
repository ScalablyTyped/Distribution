package typings
package progressjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressJs extends js.Object {
  /**
     * Set an auto-increase timer for the progress-bar.
     *
     * @param size The size of increment when timer elapsed.
     * @param millisecond Timer in milliseconds.
     */
  def autoIncrease(size: scala.Double, millisecond: scala.Double): ProgressJs = js.native
  /**
     * End the progress-bar and remove the elements from page.
     */
  def end(): ProgressJs = js.native
  /**
     * Increase the progress-bar bar specified size. Default size is 1.
     *
     * @param size The size of increment.
     */
  def increase(): ProgressJs = js.native
  /**
     * Increase the progress-bar bar specified size. Default size is 1.
     *
     * @param size The size of increment.
     */
  def increase(size: scala.Double): ProgressJs = js.native
  /**
     * Set a callback function for before end of the progress-bar.
     *
     * @param providedCallback Callback function.
     */
  def onbeforeend(providedCallback: js.Function0[_]): ProgressJs = js.native
  /**
     * Set a callback function to call before start the progress-bar.
     *
     * @param providedCallback Callback function.
     */
  def onbeforestart(providedCallback: js.Function0[_]): ProgressJs = js.native
  /**
     * Set callback function to call for each change of progress-bar.
     *
     * @param providedCallback Callback function.
     */
  def onprogress(
    providedCallback: js.Function2[/* targetElement */ java.lang.String, /* percent */ scala.Double, _]
  ): ProgressJs = js.native
  /**
     * Set specific percentage to progress-bar.
     *
     * @param percent Set to specific percentage.
     */
  def set(percent: scala.Double): ProgressJs = js.native
  /**
     * Set a single option to progressJs object.
     *
     * @param option Option key name.
     * @param value Value of the option.
     */
  def setOption(option: java.lang.String, value: java.lang.String): ProgressJs = js.native
  def setOption(option: java.lang.String, value: scala.Boolean): ProgressJs = js.native
  /**
     * Set a group of options to the progressJs object.
     *
     * @param options Object that contains option keys with values.
     */
  def setOptions(options: ProgressJsOptions): ProgressJs = js.native
  /**
     * Start the progress-bar for defined element(s).
     */
  def start(): ProgressJs = js.native
}


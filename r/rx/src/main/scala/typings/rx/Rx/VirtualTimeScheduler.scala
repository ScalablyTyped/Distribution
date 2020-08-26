package typings.rx.Rx

import typings.rx.Rx.internals.ScheduledItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualTimeScheduler[TAbsolute, TRelative] extends IScheduler {
  var isEnabled: Boolean = js.native
  /**
    * Adds a relative time value to an absolute time value.
    * @param {Number} absolute Absolute virtual time value.
    * @param {Number} relative Relative virtual time value to add.
    * @return {Number} Resulting absolute virtual time sum value.
    */
  def add(from: TAbsolute, by: TRelative): TAbsolute = js.native
  /**
    * Advances the scheduler's clock by the specified relative time, running all work scheduled for that timespan.
    * @param {Number} time Relative time to advance the scheduler's clock by.
    */
  def advanceBy(time: TRelative): Unit = js.native
  /**
    * Advances the scheduler's clock to the specified time, running all work till that point.
    * @param {Number} time Absolute time to advance the scheduler's clock to.
    */
  def advanceTo(time: TAbsolute): Unit = js.native
  /**
    * Gets the next scheduled item to be executed.
    * @returns {ScheduledItem} The next scheduled item.
    */
  def getNext(): ScheduledItem[TAbsolute] = js.native
  /**
    * Advances the scheduler's clock by the specified relative time.
    * @param {Number} time Relative time to advance the scheduler's clock by.
    */
  def sleep(time: TRelative): Unit = js.native
  /**
    * Starts the virtual time scheduler.
    */
  def start(): IDisposable = js.native
  /**
    * Stops the virtual time scheduler.
    */
  def stop(): Unit = js.native
  /**
    * Converts an absolute time to a number
    * @param {Any} The absolute time.
    * @returns {Number} The absolute time in ms
    */
  def toAbsoluteTime(duetime: TAbsolute): Double = js.native
  /**
    * Converts the TimeSpan value to a relative virtual time value.
    * @param {Number} timeSpan TimeSpan value to convert.
    * @return {Number} Corresponding relative virtual time value.
    */
  def toRelativeTime(duetime: Double): TRelative = js.native
}


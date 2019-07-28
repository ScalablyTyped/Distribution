package typings.smoothie.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smoothie", "TimeSeries")
@js.native
/**
  * Initialises a new <code>TimeSeries</code> with optional data options.
  *
  * Options are of the form (defaults shown):
  *
  * <pre>
  * {
  *   resetBounds: true,        // enables/disables automatic scaling of the y-axis
  *   resetBoundsInterval: 3000 // the period between scaling calculations, in millis
  * }
  * </pre>
  *
  * Presentation options for TimeSeries are specified as an argument to <code>SmoothieChart.addTimeSeries</code>.
  */
class TimeSeries () extends js.Object {
  def this(options: ITimeSeriesOptions) = this()
  /**
    * Hide this <code>TimeSeries</code> object in the chart.
    */
  var disabled: Boolean = js.native
  /**
    * Adjust or inspect the upper y-axis for this <code>TimeSeries</code> object.
    */
  var maxValue: Double = js.native
  /**
    * Adjust or inspect the lower y-axis for this <code>TimeSeries</code> object.
    */
  var minValue: Double = js.native
  /**
    * Adds a new data point to the <code>TimeSeries</code>, preserving chronological order.
    *
    * @param timestamp the position, in time, of this data point
    * @param value the value of this data point
    * @param sumRepeatedTimeStampValues if <code>timestamp</code> has an exact match in the series, this flag controls
    * whether it is replaced, or the values summed (defaults to false.)
    */
  def append(timestamp: Double, value: Double): Unit = js.native
  def append(timestamp: Double, value: Double, sumRepeatedTimeStampValues: Boolean): Unit = js.native
  /**
    * Clears all data and state from this TimeSeries object.
    */
  def clear(): Unit = js.native
  def dropOldData(oldestValidTime: Double, maxDataSetLength: Double): Unit = js.native
  /**
    * Recalculate the min/max values for this <code>TimeSeries</code> object.
    *
    * This causes the graph to scale itself in the y-axis.
    */
  def resetBounds(): Unit = js.native
}


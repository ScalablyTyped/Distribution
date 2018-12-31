package typings
package smoothieLib.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smoothie", "SmoothieChart")
@js.native
class SmoothieChart () extends js.Object {
  def this(chartOptions: IChartOptions) = this()
  /**
    * Change or inspect presentation options.
    */
  var options: IChartOptions = js.native
  /**
    * Adds a <code>TimeSeries</code> to this chart, with optional presentation options.
    */
  def addTimeSeries(series: TimeSeries): scala.Unit = js.native
  def addTimeSeries(series: TimeSeries, seriesOptions: ITimeSeriesPresentationOptions): scala.Unit = js.native
  /**
    * Brings the specified <code>TimeSeries</code> to the top of the chart. It will be rendered last.
    */
  def bringToFront(timeSeries: TimeSeries): scala.Unit = js.native
  /**
    * Gets render options for the specified <code>TimeSeries</code>.
    *
    * As you may use a single <code>TimeSeries</code> in multiple charts with different formatting in each usage,
    * these settings are stored in the chart.
    */
  def getTimeSeriesOptions(timeSeries: TimeSeries): ITimeSeriesPresentationOptions = js.native
  /**
    * Removes the specified <code>TimeSeries</code> from the chart.
    */
  def removeTimeSeries(series: TimeSeries): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def render(canvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def render(canvas: stdLib.HTMLCanvasElement, time: scala.Double): scala.Unit = js.native
  /**
    * Starts the animation of this chart. Called by <code>streamTo</code>.
    */
  def start(): scala.Unit = js.native
  /**
    * Stops the animation of this chart.
    */
  def stop(): scala.Unit = js.native
  /**
    * Instructs the <code>SmoothieChart</code> to start rendering to the provided canvas, with specified delay.
    *
    * @param canvas the target canvas element
    * @param delayMillis an amount of time to wait before a data point is shown. This can prevent the end of the series
    * from appearing on screen, with new values flashing into view, at the expense of some latency.
    */
  def streamTo(canvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def streamTo(canvas: stdLib.HTMLCanvasElement, delayMillis: scala.Double): scala.Unit = js.native
  def updateValueRange(): scala.Unit = js.native
}

@JSImport("smoothie", "SmoothieChart")
@js.native
object SmoothieChart extends js.Object {
  def timeFormatter(date: stdLib.Date): java.lang.String = js.native
}


package typings.smoothie.smoothieMod

import typings.std.Date
import typings.std.HTMLCanvasElement
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
  def addTimeSeries(series: TimeSeries): Unit = js.native
  def addTimeSeries(series: TimeSeries, seriesOptions: ITimeSeriesPresentationOptions): Unit = js.native
  /**
    * Brings the specified <code>TimeSeries</code> to the top of the chart. It will be rendered last.
    */
  def bringToFront(timeSeries: TimeSeries): Unit = js.native
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
  def removeTimeSeries(series: TimeSeries): Unit = js.native
  def render(): Unit = js.native
  def render(canvas: HTMLCanvasElement): Unit = js.native
  def render(canvas: HTMLCanvasElement, time: Double): Unit = js.native
  /**
    * Starts the animation of this chart. Called by <code>streamTo</code>.
    */
  def start(): Unit = js.native
  /**
    * Stops the animation of this chart.
    */
  def stop(): Unit = js.native
  /**
    * Instructs the <code>SmoothieChart</code> to start rendering to the provided canvas, with specified delay.
    *
    * @param canvas the target canvas element
    * @param delayMillis an amount of time to wait before a data point is shown. This can prevent the end of the series
    * from appearing on screen, with new values flashing into view, at the expense of some latency.
    */
  def streamTo(canvas: HTMLCanvasElement): Unit = js.native
  def streamTo(canvas: HTMLCanvasElement, delayMillis: Double): Unit = js.native
  def updateValueRange(): Unit = js.native
}

/* static members */
@JSImport("smoothie", "SmoothieChart")
@js.native
object SmoothieChart extends js.Object {
  def timeFormatter(date: Date): String = js.native
}


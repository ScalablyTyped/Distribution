package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  /** Number of documents in the page. */
  var Documents: Double
  /** Number of frames in the page. */
  var Frames: Double
  /** Number of events in the page. */
  var JSEventListeners: Double
  /** Total JavaScript heap size. */
  var JSHeapTotalSize: Double
  /** Used JavaScript heap size. */
  var JSHeapUsedSize: Double
  /** Total number of full or partial page layout. */
  var LayoutCount: Double
  /** Combined durations of all page layouts. */
  var LayoutDuration: Double
  /** Number of DOM nodes in the page. */
  var Nodes: Double
  /** Total number of page style recalculations. */
  var RecalcStyleCount: Double
  /** Combined duration of all page style recalculations. */
  var RecalcStyleDuration: Double
  /** Combined duration of JavaScript execution. */
  var ScriptDuration: Double
  /** Combined duration of all tasks performed by the browser. */
  var TaskDuration: Double
  /** The timestamp when the metrics sample was taken. */
  var Timestamp: Double
}

object Metrics {
  @scala.inline
  def apply(
    Documents: Double,
    Frames: Double,
    JSEventListeners: Double,
    JSHeapTotalSize: Double,
    JSHeapUsedSize: Double,
    LayoutCount: Double,
    LayoutDuration: Double,
    Nodes: Double,
    RecalcStyleCount: Double,
    RecalcStyleDuration: Double,
    ScriptDuration: Double,
    TaskDuration: Double,
    Timestamp: Double
  ): Metrics = {
    val __obj = js.Dynamic.literal(Documents = Documents, Frames = Frames, JSEventListeners = JSEventListeners, JSHeapTotalSize = JSHeapTotalSize, JSHeapUsedSize = JSHeapUsedSize, LayoutCount = LayoutCount, LayoutDuration = LayoutDuration, Nodes = Nodes, RecalcStyleCount = RecalcStyleCount, RecalcStyleDuration = RecalcStyleDuration, ScriptDuration = ScriptDuration, TaskDuration = TaskDuration, Timestamp = Timestamp)
  
    __obj.asInstanceOf[Metrics]
  }
}


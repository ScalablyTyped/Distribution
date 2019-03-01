package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  /** Number of documents in the page. */
  var Documents: scala.Double
  /** Number of frames in the page. */
  var Frames: scala.Double
  /** Number of events in the page. */
  var JSEventListeners: scala.Double
  /** Total JavaScript heap size. */
  var JSHeapTotalSize: scala.Double
  /** Used JavaScript heap size. */
  var JSHeapUsedSize: scala.Double
  /** Total number of full or partial page layout. */
  var LayoutCount: scala.Double
  /** Combined durations of all page layouts. */
  var LayoutDuration: scala.Double
  /** Number of DOM nodes in the page. */
  var Nodes: scala.Double
  /** Total number of page style recalculations. */
  var RecalcStyleCount: scala.Double
  /** Combined duration of all page style recalculations. */
  var RecalcStyleDuration: scala.Double
  /** Combined duration of JavaScript execution. */
  var ScriptDuration: scala.Double
  /** Combined duration of all tasks performed by the browser. */
  var TaskDuration: scala.Double
  /** The timestamp when the metrics sample was taken. */
  var Timestamp: scala.Double
}

object Metrics {
  @scala.inline
  def apply(
    Documents: scala.Double,
    Frames: scala.Double,
    JSEventListeners: scala.Double,
    JSHeapTotalSize: scala.Double,
    JSHeapUsedSize: scala.Double,
    LayoutCount: scala.Double,
    LayoutDuration: scala.Double,
    Nodes: scala.Double,
    RecalcStyleCount: scala.Double,
    RecalcStyleDuration: scala.Double,
    ScriptDuration: scala.Double,
    TaskDuration: scala.Double,
    Timestamp: scala.Double
  ): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Documents")(Documents)
    __obj.updateDynamic("Frames")(Frames)
    __obj.updateDynamic("JSEventListeners")(JSEventListeners)
    __obj.updateDynamic("JSHeapTotalSize")(JSHeapTotalSize)
    __obj.updateDynamic("JSHeapUsedSize")(JSHeapUsedSize)
    __obj.updateDynamic("LayoutCount")(LayoutCount)
    __obj.updateDynamic("LayoutDuration")(LayoutDuration)
    __obj.updateDynamic("Nodes")(Nodes)
    __obj.updateDynamic("RecalcStyleCount")(RecalcStyleCount)
    __obj.updateDynamic("RecalcStyleDuration")(RecalcStyleDuration)
    __obj.updateDynamic("ScriptDuration")(ScriptDuration)
    __obj.updateDynamic("TaskDuration")(TaskDuration)
    __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[Metrics]
  }
}


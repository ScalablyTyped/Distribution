package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  /** Number of documents in the page. */
  var Documents: Double = js.native
  /** Number of frames in the page. */
  var Frames: Double = js.native
  /** Number of events in the page. */
  var JSEventListeners: Double = js.native
  /** Total JavaScript heap size. */
  var JSHeapTotalSize: Double = js.native
  /** Used JavaScript heap size. */
  var JSHeapUsedSize: Double = js.native
  /** Total number of full or partial page layout. */
  var LayoutCount: Double = js.native
  /** Combined durations of all page layouts. */
  var LayoutDuration: Double = js.native
  /** Number of DOM nodes in the page. */
  var Nodes: Double = js.native
  /** Total number of page style recalculations. */
  var RecalcStyleCount: Double = js.native
  /** Combined duration of all page style recalculations. */
  var RecalcStyleDuration: Double = js.native
  /** Combined duration of JavaScript execution. */
  var ScriptDuration: Double = js.native
  /** Combined duration of all tasks performed by the browser. */
  var TaskDuration: Double = js.native
  /** The timestamp when the metrics sample was taken. */
  var Timestamp: Double = js.native
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
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], Frames = Frames.asInstanceOf[js.Any], JSEventListeners = JSEventListeners.asInstanceOf[js.Any], JSHeapTotalSize = JSHeapTotalSize.asInstanceOf[js.Any], JSHeapUsedSize = JSHeapUsedSize.asInstanceOf[js.Any], LayoutCount = LayoutCount.asInstanceOf[js.Any], LayoutDuration = LayoutDuration.asInstanceOf[js.Any], Nodes = Nodes.asInstanceOf[js.Any], RecalcStyleCount = RecalcStyleCount.asInstanceOf[js.Any], RecalcStyleDuration = RecalcStyleDuration.asInstanceOf[js.Any], ScriptDuration = ScriptDuration.asInstanceOf[js.Any], TaskDuration = TaskDuration.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocuments(value: Double): Self = this.set("Documents", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrames(value: Double): Self = this.set("Frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setJSEventListeners(value: Double): Self = this.set("JSEventListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setJSHeapTotalSize(value: Double): Self = this.set("JSHeapTotalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setJSHeapUsedSize(value: Double): Self = this.set("JSHeapUsedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutCount(value: Double): Self = this.set("LayoutCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutDuration(value: Double): Self = this.set("LayoutDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodes(value: Double): Self = this.set("Nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecalcStyleCount(value: Double): Self = this.set("RecalcStyleCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecalcStyleDuration(value: Double): Self = this.set("RecalcStyleDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptDuration(value: Double): Self = this.set("ScriptDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskDuration(value: Double): Self = this.set("TaskDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
  }
  
}


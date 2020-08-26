package typings.reResizable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enable extends js.Object {
  var enable: Bottom = js.native
  var grid: js.Array[Double] = js.native
  var lockAspectRatio: Boolean = js.native
  var lockAspectRatioExtraHeight: Double = js.native
  var lockAspectRatioExtraWidth: Double = js.native
  var resizeRatio: Double = js.native
  var scale: Double = js.native
  var snapGap: Double = js.native
  def onResize(): Unit = js.native
  def onResizeStart(): Unit = js.native
  def onResizeStop(): Unit = js.native
}

object Enable {
  @scala.inline
  def apply(
    enable: Bottom,
    grid: js.Array[Double],
    lockAspectRatio: Boolean,
    lockAspectRatioExtraHeight: Double,
    lockAspectRatioExtraWidth: Double,
    onResize: () => Unit,
    onResizeStart: () => Unit,
    onResizeStop: () => Unit,
    resizeRatio: Double,
    scale: Double,
    snapGap: Double
  ): Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], lockAspectRatio = lockAspectRatio.asInstanceOf[js.Any], lockAspectRatioExtraHeight = lockAspectRatioExtraHeight.asInstanceOf[js.Any], lockAspectRatioExtraWidth = lockAspectRatioExtraWidth.asInstanceOf[js.Any], onResize = js.Any.fromFunction0(onResize), onResizeStart = js.Any.fromFunction0(onResizeStart), onResizeStop = js.Any.fromFunction0(onResizeStop), resizeRatio = resizeRatio.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], snapGap = snapGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
  @scala.inline
  implicit class EnableOps[Self <: Enable] (val x: Self) extends AnyVal {
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
    def setEnable(value: Bottom): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridVarargs(value: Double*): Self = this.set("grid", js.Array(value :_*))
    @scala.inline
    def setGrid(value: js.Array[Double]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockAspectRatio(value: Boolean): Self = this.set("lockAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockAspectRatioExtraHeight(value: Double): Self = this.set("lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockAspectRatioExtraWidth(value: Double): Self = this.set("lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnResize(value: () => Unit): Self = this.set("onResize", js.Any.fromFunction0(value))
    @scala.inline
    def setOnResizeStart(value: () => Unit): Self = this.set("onResizeStart", js.Any.fromFunction0(value))
    @scala.inline
    def setOnResizeStop(value: () => Unit): Self = this.set("onResizeStop", js.Any.fromFunction0(value))
    @scala.inline
    def setResizeRatio(value: Double): Self = this.set("resizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapGap(value: Double): Self = this.set("snapGap", value.asInstanceOf[js.Any])
  }
  
}


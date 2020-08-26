package typings.rmcAlign.alignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAlignProps extends js.Object {
  var childrenProps: js.UndefOr[js.Object] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var monitorBufferTime: js.UndefOr[Double] = js.native
  var monitorWindowResize: js.UndefOr[Boolean] = js.native
  var onAlign: js.UndefOr[js.Function2[/* source */ js.Any, /* align */ js.Any, Unit]] = js.native
  def target(): Unit = js.native
}

object IAlignProps {
  @scala.inline
  def apply(target: () => Unit): IAlignProps = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    __obj.asInstanceOf[IAlignProps]
  }
  @scala.inline
  implicit class IAlignPropsOps[Self <: IAlignProps] (val x: Self) extends AnyVal {
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
    def setTarget(value: () => Unit): Self = this.set("target", js.Any.fromFunction0(value))
    @scala.inline
    def setChildrenProps(value: js.Object): Self = this.set("childrenProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenProps: Self = this.set("childrenProps", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMonitorBufferTime(value: Double): Self = this.set("monitorBufferTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitorBufferTime: Self = this.set("monitorBufferTime", js.undefined)
    @scala.inline
    def setMonitorWindowResize(value: Boolean): Self = this.set("monitorWindowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitorWindowResize: Self = this.set("monitorWindowResize", js.undefined)
    @scala.inline
    def setOnAlign(value: (/* source */ js.Any, /* align */ js.Any) => Unit): Self = this.set("onAlign", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAlign: Self = this.set("onAlign", js.undefined)
  }
  
}


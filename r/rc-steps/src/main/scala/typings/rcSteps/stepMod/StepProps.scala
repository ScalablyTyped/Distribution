package typings.rcSteps.stepMod

import typings.rcSteps.anon.Description
import typings.rcSteps.anon.Index
import typings.rcSteps.interfaceMod.Icons
import typings.rcSteps.interfaceMod.Status
import typings.rcSteps.stepsMod.ProgressDotRender
import typings.rcSteps.stepsMod.StepIconRender
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var description: js.UndefOr[ReactNode] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[ReactNode] = js.native
  var iconPrefix: js.UndefOr[String] = js.native
  var icons: js.UndefOr[Icons] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onStepClick: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var progressDot: js.UndefOr[ProgressDotRender | Boolean] = js.native
  var status: js.UndefOr[Status] = js.native
  var stepIcon: js.UndefOr[StepIconRender] = js.native
  var stepIndex: js.UndefOr[Double] = js.native
  var stepNumber: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subTitle: js.UndefOr[ReactNode] = js.native
  var tailContent: js.UndefOr[ReactNode] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var wrapperStyle: js.UndefOr[CSSProperties] = js.native
}

object StepProps {
  @scala.inline
  def apply(): StepProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepProps]
  }
  @scala.inline
  implicit class StepPropsOps[Self <: StepProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDescription(value: ReactNode): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconPrefix(value: String): Self = this.set("iconPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPrefix: Self = this.set("iconPrefix", js.undefined)
    @scala.inline
    def setIcons(value: Icons): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnStepClick(value: /* index */ Double => Unit): Self = this.set("onStepClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStepClick: Self = this.set("onStepClick", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setProgressDotFunction2(value: (/* iconDot */ js.Any, /* info */ Index) => ReactNode): Self = this.set("progressDot", js.Any.fromFunction2(value))
    @scala.inline
    def setProgressDot(value: ProgressDotRender | Boolean): Self = this.set("progressDot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressDot: Self = this.set("progressDot", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStepIcon(value: /* info */ Description => ReactNode): Self = this.set("stepIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStepIcon: Self = this.set("stepIcon", js.undefined)
    @scala.inline
    def setStepIndex(value: Double): Self = this.set("stepIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepIndex: Self = this.set("stepIndex", js.undefined)
    @scala.inline
    def setStepNumber(value: Double): Self = this.set("stepNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepNumber: Self = this.set("stepNumber", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubTitle(value: ReactNode): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    @scala.inline
    def setTailContent(value: ReactNode): Self = this.set("tailContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTailContent: Self = this.set("tailContent", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWrapperStyle(value: CSSProperties): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
  
}


package typings.reactNativeModalPopover.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowSize extends js.Object {
  var arrowSize: Requireable[InferProps[X]] = js.native
  var arrowStyle: Requireable[_] = js.native
  var backgroundStyle: Requireable[_] = js.native
  var contentStyle: Requireable[_] = js.native
  var displayArea: Requireable[InferProps[Height]] = js.native
  var duration: Requireable[Double] = js.native
  var easing: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var fromRect: Requireable[InferProps[Height]] = js.native
  var onClose: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onDismiss: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var placement: Requireable[String] = js.native
  var popoverStyle: Requireable[_] = js.native
  var visible: Requireable[Boolean] = js.native
}

object ArrowSize {
  @scala.inline
  def apply(
    arrowSize: Requireable[InferProps[X]],
    arrowStyle: Requireable[_],
    backgroundStyle: Requireable[_],
    contentStyle: Requireable[_],
    displayArea: Requireable[InferProps[Height]],
    duration: Requireable[Double],
    easing: Requireable[js.Function1[/* repeated */ _, _]],
    fromRect: Requireable[InferProps[Height]],
    onClose: Requireable[js.Function1[/* repeated */ _, _]],
    onDismiss: Requireable[js.Function1[/* repeated */ _, _]],
    placement: Requireable[String],
    popoverStyle: Requireable[_],
    visible: Requireable[Boolean]
  ): ArrowSize = {
    val __obj = js.Dynamic.literal(arrowSize = arrowSize.asInstanceOf[js.Any], arrowStyle = arrowStyle.asInstanceOf[js.Any], backgroundStyle = backgroundStyle.asInstanceOf[js.Any], contentStyle = contentStyle.asInstanceOf[js.Any], displayArea = displayArea.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], fromRect = fromRect.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDismiss = onDismiss.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverStyle = popoverStyle.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowSize]
  }
  @scala.inline
  implicit class ArrowSizeOps[Self <: ArrowSize] (val x: Self) extends AnyVal {
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
    def setArrowSize(value: Requireable[InferProps[X]]): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrowStyle(value: Requireable[_]): Self = this.set("arrowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundStyle(value: Requireable[_]): Self = this.set("backgroundStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentStyle(value: Requireable[_]): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayArea(value: Requireable[InferProps[Height]]): Self = this.set("displayArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Requireable[Double]): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasing(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromRect(value: Requireable[InferProps[Height]]): Self = this.set("fromRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClose(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDismiss(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacement(value: Requireable[String]): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopoverStyle(value: Requireable[_]): Self = this.set("popoverStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Requireable[Boolean]): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}


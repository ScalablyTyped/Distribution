package typings.reactNativeModalPopover.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowSize extends js.Object {
  var arrowSize: Requireable[InferProps[X]]
  var arrowStyle: Requireable[_]
  var backgroundStyle: Requireable[_]
  var contentStyle: Requireable[_]
  var displayArea: Requireable[InferProps[Height]]
  var duration: Requireable[Double]
  var easing: Requireable[js.Function1[/* repeated */ _, _]]
  var fromRect: Requireable[InferProps[Height]]
  var onClose: Requireable[js.Function1[/* repeated */ _, _]]
  var onDismiss: Requireable[js.Function1[/* repeated */ _, _]]
  var placement: Requireable[String]
  var popoverStyle: Requireable[_]
  var visible: Requireable[Boolean]
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
}


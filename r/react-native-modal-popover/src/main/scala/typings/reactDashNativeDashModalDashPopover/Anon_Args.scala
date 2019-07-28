package typings.reactDashNativeDashModalDashPopover

import typings.propDashTypes.propDashTypesMod.InferProps
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var arrowSize: Requireable[InferProps[Anon_X]]
  var arrowStyle: Requireable[_]
  var backgroundStyle: Requireable[_]
  var contentStyle: Requireable[_]
  var displayArea: Requireable[InferProps[Anon_Height]]
  var duration: Requireable[Double]
  var easing: Requireable[js.Function1[/* repeated */ _, _]]
  var fromRect: Requireable[InferProps[Anon_Height]]
  var onClose: Requireable[js.Function1[/* repeated */ _, _]]
  var onDismiss: Requireable[js.Function1[/* repeated */ _, _]]
  var placement: Requireable[String]
  var popoverStyle: Requireable[_]
  var visible: Requireable[Boolean]
}

object Anon_Args {
  @scala.inline
  def apply(
    arrowSize: Requireable[InferProps[Anon_X]],
    arrowStyle: Requireable[_],
    backgroundStyle: Requireable[_],
    contentStyle: Requireable[_],
    displayArea: Requireable[InferProps[Anon_Height]],
    duration: Requireable[Double],
    easing: Requireable[js.Function1[/* repeated */ _, _]],
    fromRect: Requireable[InferProps[Anon_Height]],
    onClose: Requireable[js.Function1[/* repeated */ _, _]],
    onDismiss: Requireable[js.Function1[/* repeated */ _, _]],
    placement: Requireable[String],
    popoverStyle: Requireable[_],
    visible: Requireable[Boolean]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(arrowSize = arrowSize, arrowStyle = arrowStyle, backgroundStyle = backgroundStyle, contentStyle = contentStyle, displayArea = displayArea, duration = duration, easing = easing, fromRect = fromRect, onClose = onClose, onDismiss = onDismiss, placement = placement, popoverStyle = popoverStyle, visible = visible)
  
    __obj.asInstanceOf[Anon_Args]
  }
}


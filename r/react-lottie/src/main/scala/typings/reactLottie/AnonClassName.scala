package typings.reactLottie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var clearCanvas: js.UndefOr[Boolean] = js.undefined
  /**
    * The canvas context
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * Hides elements when opacity reaches 0. Only with SVG renderer.
    * @default true
    */
  var hideOnTransparent: js.UndefOr[Boolean] = js.undefined
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  /**
    * Loads DOM elements when needed. Might speed up initialization for large number of elements. Only with SVG renderer.
    */
  var progressiveLoad: js.UndefOr[Boolean] = js.undefined
  var scaleMode: js.UndefOr[js.Any] = js.undefined
}

object AnonClassName {
  @scala.inline
  def apply(
    className: String = null,
    clearCanvas: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    hideOnTransparent: js.UndefOr[Boolean] = js.undefined,
    preserveAspectRatio: String = null,
    progressiveLoad: js.UndefOr[Boolean] = js.undefined,
    scaleMode: js.Any = null
  ): AnonClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearCanvas)) __obj.updateDynamic("clearCanvas")(clearCanvas.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnTransparent)) __obj.updateDynamic("hideOnTransparent")(hideOnTransparent.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(progressiveLoad)) __obj.updateDynamic("progressiveLoad")(progressiveLoad.asInstanceOf[js.Any])
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}


package typings.reactDashLottie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
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

object Anon_ClassName {
  @scala.inline
  def apply(
    className: String = null,
    clearCanvas: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    hideOnTransparent: js.UndefOr[Boolean] = js.undefined,
    preserveAspectRatio: String = null,
    progressiveLoad: js.UndefOr[Boolean] = js.undefined,
    scaleMode: js.Any = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clearCanvas)) __obj.updateDynamic("clearCanvas")(clearCanvas)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(hideOnTransparent)) __obj.updateDynamic("hideOnTransparent")(hideOnTransparent)
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (!js.isUndefined(progressiveLoad)) __obj.updateDynamic("progressiveLoad")(progressiveLoad)
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode)
    __obj.asInstanceOf[Anon_ClassName]
  }
}


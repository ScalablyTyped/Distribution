package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLContextAttributes extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  var depth: js.UndefOr[scala.Boolean] = js.undefined
  var desynchronized: js.UndefOr[scala.Boolean] = js.undefined
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined
  var powerPreference: js.UndefOr[WebGLPowerPreference] = js.undefined
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var stencil: js.UndefOr[scala.Boolean] = js.undefined
}

object WebGLContextAttributes {
  @scala.inline
  def apply(
    alpha: js.UndefOr[scala.Boolean] = js.undefined,
    antialias: js.UndefOr[scala.Boolean] = js.undefined,
    depth: js.UndefOr[scala.Boolean] = js.undefined,
    desynchronized: js.UndefOr[scala.Boolean] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined,
    powerPreference: WebGLPowerPreference = null,
    premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    stencil: js.UndefOr[scala.Boolean] = js.undefined
  ): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(desynchronized)) __obj.updateDynamic("desynchronized")(desynchronized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat.get.asInstanceOf[js.Any])
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLContextAttributes]
  }
}


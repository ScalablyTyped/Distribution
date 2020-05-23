package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraState extends js.Object {
  var inTransition: js.UndefOr[Boolean] = js.undefined
  var isDragging: js.UndefOr[Boolean] = js.undefined
  var isHovering: js.UndefOr[Boolean] = js.undefined
  var isPanning: js.UndefOr[Boolean] = js.undefined
  var isRotating: js.UndefOr[Boolean] = js.undefined
  var isZooming: js.UndefOr[Boolean] = js.undefined
}

object ExtraState {
  @scala.inline
  def apply(
    inTransition: js.UndefOr[Boolean] = js.undefined,
    isDragging: js.UndefOr[Boolean] = js.undefined,
    isHovering: js.UndefOr[Boolean] = js.undefined,
    isPanning: js.UndefOr[Boolean] = js.undefined,
    isRotating: js.UndefOr[Boolean] = js.undefined,
    isZooming: js.UndefOr[Boolean] = js.undefined
  ): ExtraState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inTransition)) __obj.updateDynamic("inTransition")(inTransition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDragging)) __obj.updateDynamic("isDragging")(isDragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHovering)) __obj.updateDynamic("isHovering")(isHovering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPanning)) __obj.updateDynamic("isPanning")(isPanning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isRotating)) __obj.updateDynamic("isRotating")(isRotating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isZooming)) __obj.updateDynamic("isZooming")(isZooming.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraState]
  }
}


package typings.rcAlign.interfaceMod

import typings.rcAlign.AnonAdjustX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignType extends js.Object {
  /**
    * offset source node by offset[0] in x and offset[1] in y.
    * If offset contains percentage string value, it is relative to sourceNode region.
    */
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * If adjustX field is true, will adjust source node in x direction if source node is invisible.
    * If adjustY field is true, will adjust source node in y direction if source node is invisible.
    */
  var overflow: js.UndefOr[AnonAdjustX] = js.undefined
  /**
    * move point of source node to align with point of target node.
    * Such as ['tr','cc'], align top right point of source node with center point of target node.
    * Point can be 't'(top), 'b'(bottom), 'c'(center), 'l'(left), 'r'(right) */
  var points: js.UndefOr[js.Array[AlignPoint]] = js.undefined
  /**
    * offset target node by offset[0] in x and offset[1] in y.
    * If targetOffset contains percentage string value, it is relative to targetNode region.
    */
  var targetOffset: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Whether use css bottom instead of top to position
    */
  var useCssBottom: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether use css right instead of left to position
    */
  var useCssRight: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether use css transform instead of left/top/right/bottom to position if browser supports.
    * Defaults to false.
    */
  var useCssTransform: js.UndefOr[Boolean] = js.undefined
}

object AlignType {
  @scala.inline
  def apply(
    offset: js.Array[Double] = null,
    overflow: AnonAdjustX = null,
    points: js.Array[AlignPoint] = null,
    targetOffset: js.Array[Double] = null,
    useCssBottom: js.UndefOr[Boolean] = js.undefined,
    useCssRight: js.UndefOr[Boolean] = js.undefined,
    useCssTransform: js.UndefOr[Boolean] = js.undefined
  ): AlignType = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(useCssBottom)) __obj.updateDynamic("useCssBottom")(useCssBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(useCssRight)) __obj.updateDynamic("useCssRight")(useCssRight.asInstanceOf[js.Any])
    if (!js.isUndefined(useCssTransform)) __obj.updateDynamic("useCssTransform")(useCssTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignType]
  }
}


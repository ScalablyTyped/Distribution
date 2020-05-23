package typings.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDescriptorProtoExtensionRange extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object IDescriptorProtoExtensionRange {
  @scala.inline
  def apply(end: js.UndefOr[Double] = js.undefined, start: js.UndefOr[Double] = js.undefined): IDescriptorProtoExtensionRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDescriptorProtoExtensionRange]
  }
}


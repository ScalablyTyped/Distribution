package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWrapper extends js.Object {
  /** From object converter */
  var fromObject: js.UndefOr[protobufjsLib.WrapperFromObjectConverter] = js.undefined
  /** To object converter */
  var toObject: js.UndefOr[protobufjsLib.WrapperToObjectConverter] = js.undefined
}

object IWrapper {
  @scala.inline
  def apply(
    fromObject: protobufjsLib.WrapperFromObjectConverter = null,
    toObject: protobufjsLib.WrapperToObjectConverter = null
  ): IWrapper = {
    val __obj = js.Dynamic.literal()
    if (fromObject != null) __obj.updateDynamic("fromObject")(fromObject)
    if (toObject != null) __obj.updateDynamic("toObject")(toObject)
    __obj.asInstanceOf[IWrapper]
  }
}


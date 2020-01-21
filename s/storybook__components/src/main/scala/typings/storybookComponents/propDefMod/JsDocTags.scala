package typings.storybookComponents.propDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsDocTags extends js.Object {
  var params: js.UndefOr[js.Array[JsDocParam]] = js.undefined
  var returns: js.UndefOr[JsDocReturns] = js.undefined
}

object JsDocTags {
  @scala.inline
  def apply(params: js.Array[JsDocParam] = null, returns: JsDocReturns = null): JsDocTags = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (returns != null) __obj.updateDynamic("returns")(returns.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsDocTags]
  }
}


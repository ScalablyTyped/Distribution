package typings.slateHtmlSerializer

import typings.slateHtmlSerializer.slateHtmlSerializerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var toJSON: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(toJSON: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (toJSON != null) __obj.updateDynamic("toJSON")(toJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}


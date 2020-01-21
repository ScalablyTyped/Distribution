package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsOptions extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
}

object FieldsOptions {
  @scala.inline
  def apply(fields: String = null): FieldsOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsOptions]
  }
}


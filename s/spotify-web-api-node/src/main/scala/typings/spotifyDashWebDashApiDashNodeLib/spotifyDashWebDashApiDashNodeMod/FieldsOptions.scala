package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsOptions extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
}

object FieldsOptions {
  @scala.inline
  def apply(fields: java.lang.String = null): FieldsOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[FieldsOptions]
  }
}


package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locations extends js.Object {
  var locations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var restrictionType: java.lang.String
}

object Anon_Locations {
  @scala.inline
  def apply(restrictionType: java.lang.String, locations: js.Array[java.lang.String] = null): Anon_Locations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restrictionType")(restrictionType)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[Anon_Locations]
  }
}


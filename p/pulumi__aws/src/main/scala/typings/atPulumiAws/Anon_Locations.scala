package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locations extends js.Object {
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  var restrictionType: String
}

object Anon_Locations {
  @scala.inline
  def apply(restrictionType: String, locations: js.Array[String] = null): Anon_Locations = {
    val __obj = js.Dynamic.literal(restrictionType = restrictionType)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[Anon_Locations]
  }
}


package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GeoRestrictionAnonLocationsRestrictionType extends js.Object {
  var geoRestriction: atPulumiPulumiLib.outputMod.Input[Anon_LocationsRestrictionType]
}

object Anon_GeoRestrictionAnonLocationsRestrictionType {
  @scala.inline
  def apply(geoRestriction: atPulumiPulumiLib.outputMod.Input[Anon_LocationsRestrictionType]): Anon_GeoRestrictionAnonLocationsRestrictionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("geoRestriction")(geoRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GeoRestrictionAnonLocationsRestrictionType]
  }
}


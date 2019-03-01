package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LocationsRestrictionType extends js.Object {
  var locations: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var restrictionType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_LocationsRestrictionType {
  @scala.inline
  def apply(
    restrictionType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    locations: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_LocationsRestrictionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restrictionType")(restrictionType.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LocationsRestrictionType]
  }
}


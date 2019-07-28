package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LocationsRestrictionType extends js.Object {
  var locations: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var restrictionType: Input[String]
}

object Anon_LocationsRestrictionType {
  @scala.inline
  def apply(restrictionType: Input[String], locations: Input[js.Array[Input[String]]] = null): Anon_LocationsRestrictionType = {
    val __obj = js.Dynamic.literal(restrictionType = restrictionType.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LocationsRestrictionType]
  }
}


package typings.atPulumiAws.iotThingTypeMod

import typings.atPulumiAws.Anon_DescriptionSearchableAttributes
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingTypeArgs extends js.Object {
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  val deprecated: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The name of the thing type.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  val properties: js.UndefOr[Input[Anon_DescriptionSearchableAttributes]] = js.undefined
}

object ThingTypeArgs {
  @scala.inline
  def apply(
    deprecated: Input[Boolean] = null,
    name: Input[String] = null,
    properties: Input[Anon_DescriptionSearchableAttributes] = null
  ): ThingTypeArgs = {
    val __obj = js.Dynamic.literal()
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeArgs]
  }
}


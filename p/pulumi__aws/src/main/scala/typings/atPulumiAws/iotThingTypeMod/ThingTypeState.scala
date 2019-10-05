package typings.atPulumiAws.iotThingTypeMod

import typings.atPulumiAws.typesInputMod.iot.ThingTypeProperties
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingTypeState extends js.Object {
  /**
    * The ARN of the created AWS IoT Thing Type.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  val deprecated: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The name of the thing type.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  val properties: js.UndefOr[Input[ThingTypeProperties]] = js.undefined
}

object ThingTypeState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    deprecated: Input[Boolean] = null,
    name: Input[String] = null,
    properties: Input[ThingTypeProperties] = null
  ): ThingTypeState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeState]
  }
}


package typings
package atPulumiAwsLib.iotThingTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingTypeArgs extends js.Object {
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  val deprecated: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The name of the thing type.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val properties: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DescriptionSearchableAttributes]
  ] = js.undefined
}


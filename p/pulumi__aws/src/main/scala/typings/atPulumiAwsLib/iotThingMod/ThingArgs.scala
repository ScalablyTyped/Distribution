package typings
package atPulumiAwsLib.iotThingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingArgs extends js.Object {
  /**
    * Map of attributes of the thing.
    */
  val attributes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The name of the thing.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The thing type name.
    */
  val thingTypeName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ThingArgs {
  @scala.inline
  def apply(
    attributes: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    thingTypeName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ThingArgs = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingArgs]
  }
}


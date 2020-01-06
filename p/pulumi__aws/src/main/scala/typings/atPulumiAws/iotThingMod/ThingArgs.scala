package typings.atPulumiAws.iotThingMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingArgs extends js.Object {
  /**
    * Map of attributes of the thing.
    */
  val attributes: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The name of the thing.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The thing type name.
    */
  val thingTypeName: js.UndefOr[Input[String]] = js.native
}

object ThingArgs {
  @scala.inline
  def apply(
    attributes: Input[StringDictionary[_]] = null,
    name: Input[String] = null,
    thingTypeName: Input[String] = null
  ): ThingArgs = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingArgs]
  }
}


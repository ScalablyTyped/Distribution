package typings.atPulumiAws.typesInputMod.iot

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingTypeProperties extends js.Object {
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ThingTypeProperties {
  @scala.inline
  def apply(description: Input[String] = null, searchableAttributes: Input[js.Array[Input[String]]] = null): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (searchableAttributes != null) __obj.updateDynamic("searchableAttributes")(searchableAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeProperties]
  }
}


package typings.atPulumiAws.typesOutputMod.iotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingTypeProperties extends js.Object {
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.Array[String]
}

object ThingTypeProperties {
  @scala.inline
  def apply(searchableAttributes: js.Array[String], description: String = null): ThingTypeProperties = {
    val __obj = js.Dynamic.literal(searchableAttributes = searchableAttributes)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ThingTypeProperties]
  }
}


package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeProperties extends js.Object {
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.Array[String] = js.native
}

object ThingTypeProperties {
  @scala.inline
  def apply(searchableAttributes: js.Array[String], description: String = null): ThingTypeProperties = {
    val __obj = js.Dynamic.literal(searchableAttributes = searchableAttributes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeProperties]
  }
}


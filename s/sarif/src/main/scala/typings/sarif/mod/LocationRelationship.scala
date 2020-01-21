package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRelationship extends js.Object {
  /**
    * A description of the location relationship.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * A set of distinct strings that categorize the relationship. Well-known kinds include 'includes', 'isIncludedBy'
    * and 'relevant'.
    */
  var kinds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the location relationship.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A reference to the related location.
    */
  var target: Double
}

object LocationRelationship {
  @scala.inline
  def apply(
    target: Double,
    description: Message = null,
    kinds: js.Array[String] = null,
    properties: PropertyBag = null
  ): LocationRelationship = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (kinds != null) __obj.updateDynamic("kinds")(kinds.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRelationship]
  }
}


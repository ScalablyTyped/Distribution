package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingDescriptorRelationship extends js.Object {
  /**
    * A description of the reporting descriptor relationship.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * A set of distinct strings that categorize the relationship. Well-known kinds include 'canPrecede', 'canFollow',
    * 'willPrecede', 'willFollow', 'superset', 'subset', 'equal', 'disjoint', 'relevant', and 'incomparable'.
    */
  var kinds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the reporting descriptor reference.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A reference to the related reporting descriptor.
    */
  var target: ReportingDescriptorReference
}

object ReportingDescriptorRelationship {
  @scala.inline
  def apply(
    target: ReportingDescriptorReference,
    description: Message = null,
    kinds: js.Array[java.lang.String] = null,
    properties: PropertyBag = null
  ): ReportingDescriptorRelationship = {
    val __obj = js.Dynamic.literal(target = target)
    if (description != null) __obj.updateDynamic("description")(description)
    if (kinds != null) __obj.updateDynamic("kinds")(kinds)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ReportingDescriptorRelationship]
  }
}


package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingDescriptorRelationship extends js.Object {
  /**
    * A set of distinct strings that categorize the relationshship. Well-known kinds include canPrecede, canFollow,
    * willPrecede, willFollow, superset, subset, equal, disjoint, relevant, and incomparable.
    */
  var kinds: js.Array[java.lang.String]
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
    kinds: js.Array[java.lang.String],
    target: ReportingDescriptorReference,
    properties: PropertyBag = null
  ): ReportingDescriptorRelationship = {
    val __obj = js.Dynamic.literal(kinds = kinds, target = target)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ReportingDescriptorRelationship]
  }
}


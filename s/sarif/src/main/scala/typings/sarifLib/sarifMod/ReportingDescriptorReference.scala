package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingDescriptorReference extends js.Object {
  /**
    * A notification identifier.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A JSON pointer used to retrieve a reporting descriptor from an array within a tool component.
    */
  var pointer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the reporting descriptor reference.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object ReportingDescriptorReference {
  @scala.inline
  def apply(id: java.lang.String = null, pointer: java.lang.String = null, properties: PropertyBag = null): ReportingDescriptorReference = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (pointer != null) __obj.updateDynamic("pointer")(pointer)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ReportingDescriptorReference]
  }
}


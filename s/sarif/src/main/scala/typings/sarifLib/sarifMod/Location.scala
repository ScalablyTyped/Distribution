package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * A set of regions relevant to the location.
    */
  var annotations: js.UndefOr[js.Array[Region]] = js.undefined
  /**
    * The logical location associated with the result.
    */
  var logicalLocation: js.UndefOr[LogicalLocation] = js.undefined
  /**
    * A message relevant to the location.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Identifies the artifact and region.
    */
  var physicalLocation: js.UndefOr[PhysicalLocation] = js.undefined
  /**
    * Key/value pairs that provide additional information about the location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    annotations: js.Array[Region] = null,
    logicalLocation: LogicalLocation = null,
    message: Message = null,
    physicalLocation: PhysicalLocation = null,
    properties: PropertyBag = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (logicalLocation != null) __obj.updateDynamic("logicalLocation")(logicalLocation)
    if (message != null) __obj.updateDynamic("message")(message)
    if (physicalLocation != null) __obj.updateDynamic("physicalLocation")(physicalLocation)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Location]
  }
}


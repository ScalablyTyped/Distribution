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
    * Value that distinguishes this location from all other locations within a single result object.
    */
  var id: js.UndefOr[scala.Double] = js.undefined
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
  /**
    * An array of objects that describe relationships between this location and others.
    */
  var relationships: js.UndefOr[js.Array[LocationRelationship]] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    annotations: js.Array[Region] = null,
    id: scala.Int | scala.Double = null,
    logicalLocation: LogicalLocation = null,
    message: Message = null,
    physicalLocation: PhysicalLocation = null,
    properties: PropertyBag = null,
    relationships: js.Array[LocationRelationship] = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (logicalLocation != null) __obj.updateDynamic("logicalLocation")(logicalLocation)
    if (message != null) __obj.updateDynamic("message")(message)
    if (physicalLocation != null) __obj.updateDynamic("physicalLocation")(physicalLocation)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (relationships != null) __obj.updateDynamic("relationships")(relationships)
    __obj.asInstanceOf[Location]
  }
}


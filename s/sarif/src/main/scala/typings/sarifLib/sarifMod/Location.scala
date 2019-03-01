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
    * The human-readable fully qualified name of the logical location. If run.logicalLocations is present, this value
    * matches a property name within that object, from which further information about the logical location can be
    * obtained.
    */
  var fullyQualifiedLogicalName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index within the logical locations array of the logical location associated with the result.
    */
  var logicalLocationIndex: js.UndefOr[scala.Double] = js.undefined
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
    fullyQualifiedLogicalName: java.lang.String = null,
    logicalLocationIndex: scala.Int | scala.Double = null,
    message: Message = null,
    physicalLocation: PhysicalLocation = null,
    properties: PropertyBag = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (fullyQualifiedLogicalName != null) __obj.updateDynamic("fullyQualifiedLogicalName")(fullyQualifiedLogicalName)
    if (logicalLocationIndex != null) __obj.updateDynamic("logicalLocationIndex")(logicalLocationIndex.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (physicalLocation != null) __obj.updateDynamic("physicalLocation")(physicalLocation)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Location]
  }
}


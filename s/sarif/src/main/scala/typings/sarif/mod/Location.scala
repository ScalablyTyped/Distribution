package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * A set of regions relevant to the location.
    */
  var annotations: js.UndefOr[js.Array[Region]] = js.native
  /**
    * Value that distinguishes this location from all other locations within a single result object.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * The logical locations associated with the result.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.native
  /**
    * A message relevant to the location.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * Identifies the artifact and region.
    */
  var physicalLocation: js.UndefOr[PhysicalLocation] = js.native
  /**
    * Key/value pairs that provide additional information about the location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * An array of objects that describe relationships between this location and others.
    */
  var relationships: js.UndefOr[js.Array[LocationRelationship]] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotationsVarargs(value: Region*): Self = this.set("annotations", js.Array(value :_*))
    @scala.inline
    def setAnnotations(value: js.Array[Region]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLogicalLocationsVarargs(value: LogicalLocation*): Self = this.set("logicalLocations", js.Array(value :_*))
    @scala.inline
    def setLogicalLocations(value: js.Array[LogicalLocation]): Self = this.set("logicalLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalLocations: Self = this.set("logicalLocations", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPhysicalLocation(value: PhysicalLocation): Self = this.set("physicalLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalLocation: Self = this.set("physicalLocation", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRelationshipsVarargs(value: LocationRelationship*): Self = this.set("relationships", js.Array(value :_*))
    @scala.inline
    def setRelationships(value: js.Array[LocationRelationship]): Self = this.set("relationships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
  }
  
}


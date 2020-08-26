package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalPropertyFileReference extends js.Object {
  /**
    * A stable, unique identifer for the external property file in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * A non-negative integer specifying the number of items contained in the external property file.
    */
  var itemCount: js.UndefOr[Double] = js.native
  /**
    * The location of the external property file.
    */
  var location: js.UndefOr[ArtifactLocation] = js.native
  /**
    * Key/value pairs that provide additional information about the external property file.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object ExternalPropertyFileReference {
  @scala.inline
  def apply(): ExternalPropertyFileReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalPropertyFileReference]
  }
  @scala.inline
  implicit class ExternalPropertyFileReferenceOps[Self <: ExternalPropertyFileReference] (val x: Self) extends AnyVal {
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
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
    @scala.inline
    def setLocation(value: ArtifactLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}


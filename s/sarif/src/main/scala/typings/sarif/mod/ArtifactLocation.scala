package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactLocation extends js.Object {
  /**
    * A short description of the artifact location.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The index within the run artifacts array of the artifact object associated with the artifact location.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Key/value pairs that provide additional information about the artifact location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * A string containing a valid relative or absolute URI.
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property
    * is interpreted.
    */
  var uriBaseId: js.UndefOr[String] = js.native
}

object ArtifactLocation {
  @scala.inline
  def apply(): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactLocation]
  }
  @scala.inline
  implicit class ArtifactLocationOps[Self <: ArtifactLocation] (val x: Self) extends AnyVal {
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
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setUriBaseId(value: String): Self = this.set("uriBaseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUriBaseId: Self = this.set("uriBaseId", js.undefined)
  }
  
}


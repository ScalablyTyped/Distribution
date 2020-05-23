package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactLocation extends js.Object {
  /**
    * A short description of the artifact location.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * The index within the run artifacts array of the artifact object associated with the artifact location.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the artifact location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A string containing a valid relative or absolute URI.
    */
  var uri: js.UndefOr[String] = js.undefined
  /**
    * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property
    * is interpreted.
    */
  var uriBaseId: js.UndefOr[String] = js.undefined
}

object ArtifactLocation {
  @scala.inline
  def apply(
    description: Message = null,
    index: js.UndefOr[Double] = js.undefined,
    properties: PropertyBag = null,
    uri: String = null,
    uriBaseId: String = null
  ): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (uriBaseId != null) __obj.updateDynamic("uriBaseId")(uriBaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactLocation]
  }
}


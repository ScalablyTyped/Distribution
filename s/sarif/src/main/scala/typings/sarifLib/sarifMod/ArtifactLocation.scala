package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactLocation extends js.Object {
  /**
    * The index within the run artifacts array of the artifact object associated with the artifact location.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the artifact location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A string containing a valid relative or absolute URI.
    */
  var uri: java.lang.String
  /**
    * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property
    * is interpreted.
    */
  var uriBaseId: js.UndefOr[java.lang.String] = js.undefined
}

object ArtifactLocation {
  @scala.inline
  def apply(
    uri: java.lang.String,
    index: scala.Int | scala.Double = null,
    properties: PropertyBag = null,
    uriBaseId: java.lang.String = null
  ): ArtifactLocation = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (uriBaseId != null) __obj.updateDynamic("uriBaseId")(uriBaseId)
    __obj.asInstanceOf[ArtifactLocation]
  }
}


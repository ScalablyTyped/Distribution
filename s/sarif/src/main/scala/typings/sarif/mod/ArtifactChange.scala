package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactChange extends js.Object {
  /**
    * The location of the artifact to change.
    */
  var artifactLocation: ArtifactLocation
  /**
    * Key/value pairs that provide additional information about the change.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of replacement objects, each of which represents the replacement of a single region in a single
    * artifact specified by 'artifactLocation'.
    */
  var replacements: js.Array[Replacement]
}

object ArtifactChange {
  @scala.inline
  def apply(
    artifactLocation: ArtifactLocation,
    replacements: js.Array[Replacement],
    properties: PropertyBag = null
  ): ArtifactChange = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], replacements = replacements.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactChange]
  }
}


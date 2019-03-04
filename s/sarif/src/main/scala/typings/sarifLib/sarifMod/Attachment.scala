package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  /**
    * The location of the attachment.
    */
  var artifactLocation: ArtifactLocation
  /**
    * A message describing the role played by the attachment.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the attachment.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of rectangles specifying areas of interest within the image.
    */
  var rectangles: js.UndefOr[js.Array[Rectangle]] = js.undefined
  /**
    * An array of regions of interest within the attachment.
    */
  var regions: js.UndefOr[js.Array[Region]] = js.undefined
}

object Attachment {
  @scala.inline
  def apply(
    artifactLocation: ArtifactLocation,
    description: Message = null,
    properties: PropertyBag = null,
    rectangles: js.Array[Rectangle] = null,
    regions: js.Array[Region] = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation)
    if (description != null) __obj.updateDynamic("description")(description)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (rectangles != null) __obj.updateDynamic("rectangles")(rectangles)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[Attachment]
  }
}


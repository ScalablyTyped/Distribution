package typings
package atPulumiAwsLib.ecrGetImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val imageDigest: java.lang.String
  /**
    * The date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
    */
  val imagePushedAt: scala.Double
  /**
    * The size, in bytes, of the image in the repository.
    */
  val imageSizeInBytes: scala.Double
  val imageTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of tags associated with this image.
    */
  val imageTags: js.Array[java.lang.String]
  val registryId: java.lang.String
  val repositoryName: java.lang.String
}

object GetImageResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    imageDigest: java.lang.String,
    imagePushedAt: scala.Double,
    imageSizeInBytes: scala.Double,
    imageTags: js.Array[java.lang.String],
    registryId: java.lang.String,
    repositoryName: java.lang.String,
    imageTag: java.lang.String = null
  ): GetImageResult = {
    val __obj = js.Dynamic.literal(id = id, imageDigest = imageDigest, imagePushedAt = imagePushedAt, imageSizeInBytes = imageSizeInBytes, imageTags = imageTags, registryId = registryId, repositoryName = repositoryName)
    if (imageTag != null) __obj.updateDynamic("imageTag")(imageTag)
    __obj.asInstanceOf[GetImageResult]
  }
}


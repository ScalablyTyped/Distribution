package typings.atPulumiAws.ecrGetImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val imageDigest: String
  /**
    * The date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
    */
  val imagePushedAt: Double
  /**
    * The size, in bytes, of the image in the repository.
    */
  val imageSizeInBytes: Double
  val imageTag: js.UndefOr[String] = js.undefined
  /**
    * The list of tags associated with this image.
    */
  val imageTags: js.Array[String]
  val registryId: String
  val repositoryName: String
}

object GetImageResult {
  @scala.inline
  def apply(
    id: String,
    imageDigest: String,
    imagePushedAt: Double,
    imageSizeInBytes: Double,
    imageTags: js.Array[String],
    registryId: String,
    repositoryName: String,
    imageTag: String = null
  ): GetImageResult = {
    val __obj = js.Dynamic.literal(id = id, imageDigest = imageDigest, imagePushedAt = imagePushedAt, imageSizeInBytes = imageSizeInBytes, imageTags = imageTags, registryId = registryId, repositoryName = repositoryName)
    if (imageTag != null) __obj.updateDynamic("imageTag")(imageTag)
    __obj.asInstanceOf[GetImageResult]
  }
}


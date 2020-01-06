package typings.atPulumiAws.ecrGetImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val imageDigest: String = js.native
  /**
    * The date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
    */
  val imagePushedAt: Double = js.native
  /**
    * The size, in bytes, of the image in the repository.
    */
  val imageSizeInBytes: Double = js.native
  val imageTag: js.UndefOr[String] = js.native
  /**
    * The list of tags associated with this image.
    */
  val imageTags: js.Array[String] = js.native
  val registryId: String = js.native
  val repositoryName: String = js.native
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], imageDigest = imageDigest.asInstanceOf[js.Any], imagePushedAt = imagePushedAt.asInstanceOf[js.Any], imageSizeInBytes = imageSizeInBytes.asInstanceOf[js.Any], imageTags = imageTags.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (imageTag != null) __obj.updateDynamic("imageTag")(imageTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageResult]
  }
}


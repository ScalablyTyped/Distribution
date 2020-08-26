package typings.pulumiAws.getImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageResult extends js.Object {
  /**
    * The provider-assigned unique ID for this managed resource.
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
    repositoryName: String
  ): GetImageResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], imageDigest = imageDigest.asInstanceOf[js.Any], imagePushedAt = imagePushedAt.asInstanceOf[js.Any], imageSizeInBytes = imageSizeInBytes.asInstanceOf[js.Any], imageTags = imageTags.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageResult]
  }
  @scala.inline
  implicit class GetImageResultOps[Self <: GetImageResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageDigest(value: String): Self = this.set("imageDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagePushedAt(value: Double): Self = this.set("imagePushedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageSizeInBytes(value: Double): Self = this.set("imageSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageTagsVarargs(value: String*): Self = this.set("imageTags", js.Array(value :_*))
    @scala.inline
    def setImageTags(value: js.Array[String]): Self = this.set("imageTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistryId(value: String): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageTag(value: String): Self = this.set("imageTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTag: Self = this.set("imageTag", js.undefined)
  }
  
}


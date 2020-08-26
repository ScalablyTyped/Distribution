package typings.pulumiAws.getImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageArgs extends js.Object {
  /**
    * The sha256 digest of the image manifest. At least one of `imageDigest` or `imageTag` must be specified.
    */
  val imageDigest: js.UndefOr[String] = js.native
  /**
    * The tag associated with this image. At least one of `imageDigest` or `imageTag` must be specified.
    */
  val imageTag: js.UndefOr[String] = js.native
  /**
    * The ID of the Registry where the repository resides.
    */
  val registryId: js.UndefOr[String] = js.native
  /**
    * The name of the ECR Repository.
    */
  val repositoryName: String = js.native
}

object GetImageArgs {
  @scala.inline
  def apply(repositoryName: String): GetImageArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageArgs]
  }
  @scala.inline
  implicit class GetImageArgsOps[Self <: GetImageArgs] (val x: Self) extends AnyVal {
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
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageDigest(value: String): Self = this.set("imageDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDigest: Self = this.set("imageDigest", js.undefined)
    @scala.inline
    def setImageTag(value: String): Self = this.set("imageTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTag: Self = this.set("imageTag", js.undefined)
    @scala.inline
    def setRegistryId(value: String): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
  
}


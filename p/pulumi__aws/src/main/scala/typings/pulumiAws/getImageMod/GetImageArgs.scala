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
  def apply(
    repositoryName: String,
    imageDigest: String = null,
    imageTag: String = null,
    registryId: String = null
  ): GetImageArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest.asInstanceOf[js.Any])
    if (imageTag != null) __obj.updateDynamic("imageTag")(imageTag.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageArgs]
  }
}


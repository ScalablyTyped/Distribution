package typings
package atPulumiAwsLib.ecrGetImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageArgs extends js.Object {
  /**
    * The sha256 digest of the image manifest. At least one of `image_digest` or `image_tag` must be specified.
    */
  val imageDigest: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tag associated with this image. At least one of `image_digest` or `image_tag` must be specified.
    */
  val imageTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the Registry where the repository resides.
    */
  val registryId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the ECR Repository.
    */
  val repositoryName: java.lang.String
}

object GetImageArgs {
  @scala.inline
  def apply(
    repositoryName: java.lang.String,
    imageDigest: java.lang.String = null,
    imageTag: java.lang.String = null,
    registryId: java.lang.String = null
  ): GetImageArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest)
    if (imageTag != null) __obj.updateDynamic("imageTag")(imageTag)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[GetImageArgs]
  }
}


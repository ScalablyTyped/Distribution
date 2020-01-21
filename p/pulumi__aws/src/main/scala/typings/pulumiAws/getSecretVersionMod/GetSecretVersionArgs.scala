package typings.pulumiAws.getSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretVersionArgs extends js.Object {
  /**
    * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
    */
  val secretId: String = js.native
  /**
    * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `versionStage`.
    */
  val versionId: js.UndefOr[String] = js.native
  /**
    * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
    */
  val versionStage: js.UndefOr[String] = js.native
}

object GetSecretVersionArgs {
  @scala.inline
  def apply(secretId: String, versionId: String = null, versionStage: String = null): GetSecretVersionArgs = {
    val __obj = js.Dynamic.literal(secretId = secretId.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    if (versionStage != null) __obj.updateDynamic("versionStage")(versionStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretVersionArgs]
  }
}


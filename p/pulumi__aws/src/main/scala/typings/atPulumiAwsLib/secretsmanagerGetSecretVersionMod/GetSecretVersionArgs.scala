package typings
package atPulumiAwsLib.secretsmanagerGetSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretVersionArgs extends js.Object {
  /**
    * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
    */
  val secretId: java.lang.String
  /**
    * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `version_stage`.
    */
  val versionId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
    */
  val versionStage: js.UndefOr[java.lang.String] = js.undefined
}


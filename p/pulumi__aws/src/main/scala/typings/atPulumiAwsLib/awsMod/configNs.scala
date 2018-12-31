package typings
package atPulumiAwsLib.awsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "config")
@js.native
object configNs extends js.Object {
  var accessKey: js.UndefOr[java.lang.String] = js.native
  var allowedAccountIds: js.UndefOr[js.Array[java.lang.String]] = js.native
  var assumeRole: js.UndefOr[atPulumiAwsLib.Anon_RoleArnSessionName] = js.native
  var dynamodbEndpoint: js.UndefOr[java.lang.String] = js.native
  var endpoints: js.UndefOr[js.Array[atPulumiAwsLib.Anon_S3control]] = js.native
  var forbiddenAccountIds: js.UndefOr[js.Array[java.lang.String]] = js.native
  var insecure: js.UndefOr[scala.Boolean] = js.native
  var kinesisEndpoint: js.UndefOr[java.lang.String] = js.native
  var maxRetries: js.UndefOr[scala.Double] = js.native
  var profile: js.UndefOr[java.lang.String] = js.native
  var region: atPulumiAwsLib.regionMod.Region = js.native
  var s3ForcePathStyle: js.UndefOr[scala.Boolean] = js.native
  var secretKey: js.UndefOr[java.lang.String] = js.native
  var sharedCredentialsFile: js.UndefOr[java.lang.String] = js.native
  var skipCredentialsValidation: js.UndefOr[scala.Boolean] = js.native
  var skipGetEc2Platforms: js.UndefOr[scala.Boolean] = js.native
  var skipMetadataApiCheck: js.UndefOr[scala.Boolean] = js.native
  var skipRegionValidation: js.UndefOr[scala.Boolean] = js.native
  var skipRequestingAccountId: js.UndefOr[scala.Boolean] = js.native
  var token: js.UndefOr[java.lang.String] = js.native
  def requireRegion(): atPulumiAwsLib.regionMod.Region = js.native
}


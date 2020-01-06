package typings.atPulumiAws.typesInputMod.athena

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkgroupConfigurationResultConfigurationEncryptionConfiguration extends js.Object {
  /**
    * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (SSE-S3), server-side encryption with KMS-managed keys (SSE-KMS), or client-side encryption with KMS-managed keys (CSE-KMS) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup.
    */
  var encryptionOption: js.UndefOr[Input[String]] = js.native
  /**
    * For SSE-KMS and CSE-KMS, this is the KMS key Amazon Resource Name (ARN).
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.native
}

object WorkgroupConfigurationResultConfigurationEncryptionConfiguration {
  @scala.inline
  def apply(encryptionOption: Input[String] = null, kmsKeyArn: Input[String] = null): WorkgroupConfigurationResultConfigurationEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (encryptionOption != null) __obj.updateDynamic("encryptionOption")(encryptionOption.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]
  }
}


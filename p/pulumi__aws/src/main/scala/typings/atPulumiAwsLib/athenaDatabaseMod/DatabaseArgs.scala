package typings
package atPulumiAwsLib.athenaDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseArgs extends js.Object {
  /**
    * Name of s3 bucket to save the results of the query execution.
    */
  val bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryption_configuration` block is documented below.
    */
  val encryptionConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EncryptionOptionKmsKey]] = js.undefined
  /**
    * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Name of the database to create.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DatabaseArgs {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    encryptionConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EncryptionOptionKmsKey] = null,
    forceDestroy: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DatabaseArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseArgs]
  }
}


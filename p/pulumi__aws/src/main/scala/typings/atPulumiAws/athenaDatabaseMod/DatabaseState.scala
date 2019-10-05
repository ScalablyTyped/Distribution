package typings.atPulumiAws.athenaDatabaseMod

import typings.atPulumiAws.typesInputMod.athena.DatabaseEncryptionConfiguration
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseState extends js.Object {
  /**
    * Name of s3 bucket to save the results of the query execution.
    */
  val bucket: js.UndefOr[Input[String]] = js.undefined
  /**
    * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
    */
  val encryptionConfiguration: js.UndefOr[Input[DatabaseEncryptionConfiguration]] = js.undefined
  /**
    * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Name of the database to create.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object DatabaseState {
  @scala.inline
  def apply(
    bucket: Input[String] = null,
    encryptionConfiguration: Input[DatabaseEncryptionConfiguration] = null,
    forceDestroy: Input[Boolean] = null,
    name: Input[String] = null
  ): DatabaseState = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseState]
  }
}


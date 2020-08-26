package typings.pulumiAws.databaseMod

import typings.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseState extends js.Object {
  /**
    * Name of s3 bucket to save the results of the query execution.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
    */
  val encryptionConfiguration: js.UndefOr[Input[DatabaseEncryptionConfiguration]] = js.native
  /**
    * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Name of the database to create.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object DatabaseState {
  @scala.inline
  def apply(): DatabaseState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseState]
  }
  @scala.inline
  implicit class DatabaseStateOps[Self <: DatabaseState] (val x: Self) extends AnyVal {
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
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setEncryptionConfiguration(value: Input[DatabaseEncryptionConfiguration]): Self = this.set("encryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("encryptionConfiguration", js.undefined)
    @scala.inline
    def setForceDestroy(value: Input[Boolean]): Self = this.set("forceDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDestroy: Self = this.set("forceDestroy", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


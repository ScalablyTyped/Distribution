package typings.pulumiAws.vaultMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultState extends js.Object {
  /**
    * The ARN of the vault.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The server-side encryption key that is used to protect your backups.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the backup vault to create.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The number of recovery points that are stored in a backup vault.
    */
  val recoveryPoints: js.UndefOr[Input[Double]] = js.native
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object VaultState {
  @scala.inline
  def apply(): VaultState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultState]
  }
  @scala.inline
  implicit class VaultStateOps[Self <: VaultState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRecoveryPoints(value: Input[Double]): Self = this.set("recoveryPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecoveryPoints: Self = this.set("recoveryPoints", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


package typings.atPulumiAws.backupVaultMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultState extends js.Object {
  /**
    * The ARN of the vault.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The server-side encryption key that is used to protect your backups.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the backup vault to create.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of recovery points that are stored in a backup vault.
    */
  val recoveryPoints: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object VaultState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    kmsKeyArn: Input[String] = null,
    name: Input[String] = null,
    recoveryPoints: Input[Double] = null,
    tags: Input[StringDictionary[Input[String]]] = null
  ): VaultState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recoveryPoints != null) __obj.updateDynamic("recoveryPoints")(recoveryPoints.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultState]
  }
}


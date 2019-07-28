package typings.atPulumiAws.backupVaultMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultArgs extends js.Object {
  /**
    * The server-side encryption key that is used to protect your backups.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the backup vault to create.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object VaultArgs {
  @scala.inline
  def apply(
    kmsKeyArn: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[Input[String]]] = null
  ): VaultArgs = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultArgs]
  }
}


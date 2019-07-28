package typings.atPulumiAws.kmsAliasMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the key alias.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates an unique alias beginning with the specified prefix.
    * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the target key identifier.
    */
  val targetKeyArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier for the key for which the alias is for, can be either an ARN or key_id.
    */
  val targetKeyId: js.UndefOr[Input[String]] = js.undefined
}

object AliasState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    targetKeyArn: Input[String] = null,
    targetKeyId: Input[String] = null
  ): AliasState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (targetKeyArn != null) __obj.updateDynamic("targetKeyArn")(targetKeyArn.asInstanceOf[js.Any])
    if (targetKeyId != null) __obj.updateDynamic("targetKeyId")(targetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasState]
  }
}


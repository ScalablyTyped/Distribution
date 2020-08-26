package typings.pulumiAws.kmsAliasMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the key alias.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates an unique alias beginning with the specified prefix.
    * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target key identifier.
    */
  val targetKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier for the key for which the alias is for, can be either an ARN or key_id.
    */
  val targetKeyId: js.UndefOr[Input[String]] = js.native
}

object AliasState {
  @scala.inline
  def apply(): AliasState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasState]
  }
  @scala.inline
  implicit class AliasStateOps[Self <: AliasState] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setTargetKeyArn(value: Input[String]): Self = this.set("targetKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetKeyArn: Self = this.set("targetKeyArn", js.undefined)
    @scala.inline
    def setTargetKeyId(value: Input[String]): Self = this.set("targetKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetKeyId: Self = this.set("targetKeyId", js.undefined)
  }
  
}


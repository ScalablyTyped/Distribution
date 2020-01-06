package typings.atPulumiAws.iamAccountAliasMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAliasState extends js.Object {
  /**
    * The account alias
    */
  val accountAlias: js.UndefOr[Input[String]] = js.native
}

object AccountAliasState {
  @scala.inline
  def apply(accountAlias: Input[String] = null): AccountAliasState = {
    val __obj = js.Dynamic.literal()
    if (accountAlias != null) __obj.updateDynamic("accountAlias")(accountAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAliasState]
  }
}


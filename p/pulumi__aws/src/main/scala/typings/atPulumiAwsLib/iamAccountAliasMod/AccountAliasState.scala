package typings
package atPulumiAwsLib.iamAccountAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAliasState extends js.Object {
  /**
    * The account alias
    */
  val accountAlias: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object AccountAliasState {
  @scala.inline
  def apply(accountAlias: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): AccountAliasState = {
    val __obj = js.Dynamic.literal()
    if (accountAlias != null) __obj.updateDynamic("accountAlias")(accountAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAliasState]
  }
}


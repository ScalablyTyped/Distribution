package typings
package atPulumiAwsLib.iamAccountAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAliasArgs extends js.Object {
  /**
    * The account alias
    */
  val accountAlias: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object AccountAliasArgs {
  @scala.inline
  def apply(accountAlias: atPulumiPulumiLib.outputMod.Input[java.lang.String]): AccountAliasArgs = {
    val __obj = js.Dynamic.literal(accountAlias = accountAlias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountAliasArgs]
  }
}


package typings.atPulumiAws.iamAccountAliasMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAliasArgs extends js.Object {
  /**
    * The account alias
    */
  val accountAlias: Input[String]
}

object AccountAliasArgs {
  @scala.inline
  def apply(accountAlias: Input[String]): AccountAliasArgs = {
    val __obj = js.Dynamic.literal(accountAlias = accountAlias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountAliasArgs]
  }
}


package typings.pulumiAws.accountAliasMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAliasArgs extends js.Object {
  /**
    * The account alias
    */
  val accountAlias: Input[String] = js.native
}

object AccountAliasArgs {
  @scala.inline
  def apply(accountAlias: Input[String]): AccountAliasArgs = {
    val __obj = js.Dynamic.literal(accountAlias = accountAlias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountAliasArgs]
  }
}


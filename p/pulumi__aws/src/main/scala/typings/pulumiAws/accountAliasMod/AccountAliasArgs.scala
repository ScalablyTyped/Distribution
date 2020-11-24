package typings.pulumiAws.accountAliasMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class AccountAliasArgsOps[Self <: AccountAliasArgs] (val x: Self) extends AnyVal {
    
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
    def setAccountAlias(value: Input[String]): Self = this.set("accountAlias", value.asInstanceOf[js.Any])
  }
}

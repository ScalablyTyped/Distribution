package typings.pulumiAws.accountAliasMod

import typings.pulumiPulumi.outputMod.Input
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
  def apply(): AccountAliasState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAliasState]
  }
  @scala.inline
  implicit class AccountAliasStateOps[Self <: AccountAliasState] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteAccountAlias: Self = this.set("accountAlias", js.undefined)
  }
  
}


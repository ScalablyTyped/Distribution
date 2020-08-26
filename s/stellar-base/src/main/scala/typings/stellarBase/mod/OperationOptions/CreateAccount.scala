package typings.stellarBase.mod.OperationOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccount extends BaseOptions {
  var destination: String = js.native
  var startingBalance: String = js.native
}

object CreateAccount {
  @scala.inline
  def apply(destination: String, startingBalance: String): CreateAccount = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccount]
  }
  @scala.inline
  implicit class CreateAccountOps[Self <: CreateAccount] (val x: Self) extends AnyVal {
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
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartingBalance(value: String): Self = this.set("startingBalance", value.asInstanceOf[js.Any])
  }
  
}


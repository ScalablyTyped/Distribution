package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.CreateAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccount_ extends BaseOperation[CreateAccount] {
  
  var destination: String = js.native
  
  var startingBalance: String = js.native
}
object CreateAccount_ {
  
  @scala.inline
  def apply(destination: String, startingBalance: String, `type`: CreateAccount): CreateAccount_ = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccount_]
  }
  
  @scala.inline
  implicit class CreateAccount_Ops[Self <: CreateAccount_] (val x: Self) extends AnyVal {
    
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

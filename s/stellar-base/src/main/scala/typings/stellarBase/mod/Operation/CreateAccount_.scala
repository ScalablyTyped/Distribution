package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.CreateAccount
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccount_
  extends BaseOperation[CreateAccount]
     with _Operation {
  
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
  implicit class CreateAccount_MutableBuilder[Self <: CreateAccount_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingBalance(value: String): Self = StObject.set(x, "startingBalance", value.asInstanceOf[js.Any])
  }
}

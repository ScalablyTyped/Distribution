package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccount
  extends BaseOptions
     with _OperationOptions {
  
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
  implicit class CreateAccountMutableBuilder[Self <: CreateAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingBalance(value: String): Self = StObject.set(x, "startingBalance", value.asInstanceOf[js.Any])
  }
}

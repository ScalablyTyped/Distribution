package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeAccountSponsorship
  extends BaseOptions
     with _OperationOptions {
  
  var account: String = js.native
}
object RevokeAccountSponsorship {
  
  @scala.inline
  def apply(account: String): RevokeAccountSponsorship = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeAccountSponsorship]
  }
  
  @scala.inline
  implicit class RevokeAccountSponsorshipMutableBuilder[Self <: RevokeAccountSponsorship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
  }
}

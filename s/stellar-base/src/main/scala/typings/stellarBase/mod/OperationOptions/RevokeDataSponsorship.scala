package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeDataSponsorship
  extends BaseOptions
     with _OperationOptions {
  
  var account: String = js.native
  
  var name: String = js.native
}
object RevokeDataSponsorship {
  
  @scala.inline
  def apply(account: String, name: String): RevokeDataSponsorship = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeDataSponsorship]
  }
  
  @scala.inline
  implicit class RevokeDataSponsorshipMutableBuilder[Self <: RevokeDataSponsorship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

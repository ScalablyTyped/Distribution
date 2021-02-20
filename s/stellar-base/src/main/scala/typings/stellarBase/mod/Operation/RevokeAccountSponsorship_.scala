package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.RevokeSponsorship
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeAccountSponsorship_
  extends BaseOperation[RevokeSponsorship]
     with _Operation {
  
  var account: String = js.native
}
object RevokeAccountSponsorship_ {
  
  @scala.inline
  def apply(account: String, `type`: RevokeSponsorship): RevokeAccountSponsorship_ = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeAccountSponsorship_]
  }
  
  @scala.inline
  implicit class RevokeAccountSponsorship_MutableBuilder[Self <: RevokeAccountSponsorship_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
  }
}

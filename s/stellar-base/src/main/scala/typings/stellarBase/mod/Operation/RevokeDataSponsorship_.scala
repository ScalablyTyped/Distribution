package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.RevokeSponsorship
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeDataSponsorship_
  extends BaseOperation[RevokeSponsorship]
     with _Operation {
  
  var account: String = js.native
  
  var name: String = js.native
}
object RevokeDataSponsorship_ {
  
  @scala.inline
  def apply(account: String, name: String, `type`: RevokeSponsorship): RevokeDataSponsorship_ = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeDataSponsorship_]
  }
  
  @scala.inline
  implicit class RevokeDataSponsorship_MutableBuilder[Self <: RevokeDataSponsorship_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

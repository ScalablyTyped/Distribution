package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.AccountMerge
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountMerge_
  extends BaseOperation[AccountMerge]
     with _Operation {
  
  var destination: String = js.native
}
object AccountMerge_ {
  
  @scala.inline
  def apply(destination: String, `type`: AccountMerge): AccountMerge_ = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMerge_]
  }
  
  @scala.inline
  implicit class AccountMerge_MutableBuilder[Self <: AccountMerge_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}

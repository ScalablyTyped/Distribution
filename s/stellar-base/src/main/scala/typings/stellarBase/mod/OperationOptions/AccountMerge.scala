package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountMerge
  extends BaseOptions
     with _OperationOptions {
  
  var destination: String = js.native
}
object AccountMerge {
  
  @scala.inline
  def apply(destination: String): AccountMerge = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountMerge]
  }
  
  @scala.inline
  implicit class AccountMergeMutableBuilder[Self <: AccountMerge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}

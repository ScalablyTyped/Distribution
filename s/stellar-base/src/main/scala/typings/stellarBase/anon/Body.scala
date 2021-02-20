package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.MuxedAccount
import typings.stellarBase.xdrMod.xdr.OperationBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends StObject {
  
  var body: OperationBody = js.native
  
  var sourceAccount: Null | MuxedAccount = js.native
}
object Body {
  
  @scala.inline
  def apply(body: OperationBody): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: OperationBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccount(value: MuxedAccount): Self = StObject.set(x, "sourceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccountNull: Self = StObject.set(x, "sourceAccount", null)
  }
}

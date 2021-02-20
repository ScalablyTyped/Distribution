package typings.stellarBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreAuthTx extends StObject {
  
  var preAuthTx: js.Any = js.native
}
object PreAuthTx {
  
  @scala.inline
  def apply(preAuthTx: js.Any): PreAuthTx = {
    val __obj = js.Dynamic.literal(preAuthTx = preAuthTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthTx]
  }
  
  @scala.inline
  implicit class PreAuthTxMutableBuilder[Self <: PreAuthTx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreAuthTx(value: js.Any): Self = StObject.set(x, "preAuthTx", value.asInstanceOf[js.Any])
  }
}

package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait PBKDF2Params extends StObject {
  
  var iter: js.UndefOr[Double] = js.native
  
  var salt: js.UndefOr[BitArray_] = js.native
}
object PBKDF2Params {
  
  @scala.inline
  def apply(): PBKDF2Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PBKDF2Params]
  }
  
  @scala.inline
  implicit class PBKDF2ParamsMutableBuilder[Self <: PBKDF2Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIter(value: Double): Self = StObject.set(x, "iter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterUndefined: Self = StObject.set(x, "iter", js.undefined)
    
    @scala.inline
    def setSalt(value: BitArray_): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    @scala.inline
    def setSaltVarargs(value: Double*): Self = StObject.set(x, "salt", js.Array(value :_*))
  }
}

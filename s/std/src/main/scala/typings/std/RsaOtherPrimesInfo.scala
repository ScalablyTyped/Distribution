package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaOtherPrimesInfo extends StObject {
  
  var d: js.UndefOr[java.lang.String] = js.native
  
  var r: js.UndefOr[java.lang.String] = js.native
  
  var t: js.UndefOr[java.lang.String] = js.native
}
object RsaOtherPrimesInfo {
  
  @scala.inline
  def apply(): RsaOtherPrimesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RsaOtherPrimesInfo]
  }
  
  @scala.inline
  implicit class RsaOtherPrimesInfoMutableBuilder[Self <: RsaOtherPrimesInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: java.lang.String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setR(value: java.lang.String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setT(value: java.lang.String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}

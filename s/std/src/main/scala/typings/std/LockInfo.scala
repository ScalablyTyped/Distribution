package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockInfo extends StObject {
  
  /* standard dom */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var mode: js.UndefOr[LockMode] = js.undefined
  
  /* standard dom */
  var name: js.UndefOr[java.lang.String] = js.undefined
}
object LockInfo {
  
  inline def apply(): LockInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LockInfo] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: java.lang.String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setMode(value: LockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

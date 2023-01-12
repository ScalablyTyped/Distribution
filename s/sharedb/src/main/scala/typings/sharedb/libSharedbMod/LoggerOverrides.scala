package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerOverrides extends StObject {
  
  var error: js.UndefOr[LoggerFunction] = js.undefined
  
  var info: js.UndefOr[LoggerFunction] = js.undefined
  
  var warn: js.UndefOr[LoggerFunction] = js.undefined
}
object LoggerOverrides {
  
  inline def apply(): LoggerOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggerOverrides] (val x: Self) extends AnyVal {
    
    inline def setError(value: LoggerFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInfo(value: LoggerFunction): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setWarn(value: LoggerFunction): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}

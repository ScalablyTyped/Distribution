package typings.snowflakeSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowflakeError
  extends StObject
     with SnowflakeErrorExternal {
  
  var externalize: js.UndefOr[js.Function0[SnowflakeErrorExternal]] = js.undefined
}
object SnowflakeError {
  
  inline def apply(message: String, name: String): SnowflakeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnowflakeError]
  }
  
  extension [Self <: SnowflakeError](x: Self) {
    
    inline def setExternalize(value: () => SnowflakeErrorExternal): Self = StObject.set(x, "externalize", js.Any.fromFunction0(value))
    
    inline def setExternalizeUndefined: Self = StObject.set(x, "externalize", js.undefined)
  }
}

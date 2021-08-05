package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpApiLogs extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
}
object HttpApiLogs {
  
  inline def apply(): HttpApiLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpApiLogs]
  }
  
  extension [Self <: HttpApiLogs](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}

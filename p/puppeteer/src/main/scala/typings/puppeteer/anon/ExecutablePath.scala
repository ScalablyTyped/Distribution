package typings.puppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutablePath extends StObject {
  
  var executablePath: String
  
  var missingText: js.UndefOr[String] = js.undefined
}
object ExecutablePath {
  
  inline def apply(executablePath: String): ExecutablePath = {
    val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutablePath]
  }
  
  extension [Self <: ExecutablePath](x: Self) {
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    inline def setMissingText(value: String): Self = StObject.set(x, "missingText", value.asInstanceOf[js.Any])
    
    inline def setMissingTextUndefined: Self = StObject.set(x, "missingText", js.undefined)
  }
}

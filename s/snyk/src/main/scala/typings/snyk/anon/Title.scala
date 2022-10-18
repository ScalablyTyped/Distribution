package typings.snyk.anon

import typings.snyk.distLibSnykTestCommonMod.SEVERITY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var id: String
  
  var severity: SEVERITY
  
  var title: String
}
object Title {
  
  inline def apply(id: String, severity: SEVERITY, title: String): Title = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: SEVERITY): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

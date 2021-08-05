package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var shortcut: js.UndefOr[String] = js.undefined
  
  var usage: js.UndefOr[String] = js.undefined
}
object Required {
  
  inline def apply(): Required = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Required]
  }
  
  extension [Self <: Required](x: Self) {
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    
    inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    
    inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}

package typings.storybookPreviewWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeDocsOnly extends StObject {
  
  var includeDocsOnly: Boolean
}
object IncludeDocsOnly {
  
  inline def apply(includeDocsOnly: Boolean): IncludeDocsOnly = {
    val __obj = js.Dynamic.literal(includeDocsOnly = includeDocsOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeDocsOnly]
  }
  
  extension [Self <: IncludeDocsOnly](x: Self) {
    
    inline def setIncludeDocsOnly(value: Boolean): Self = StObject.set(x, "includeDocsOnly", value.asInstanceOf[js.Any])
  }
}

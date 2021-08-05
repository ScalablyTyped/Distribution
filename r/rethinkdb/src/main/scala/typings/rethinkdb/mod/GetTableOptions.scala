package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableOptions extends StObject {
  
  var useOutdated: Boolean
}
object GetTableOptions {
  
  inline def apply(useOutdated: Boolean): GetTableOptions = {
    val __obj = js.Dynamic.literal(useOutdated = useOutdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableOptions]
  }
  
  extension [Self <: GetTableOptions](x: Self) {
    
    inline def setUseOutdated(value: Boolean): Self = StObject.set(x, "useOutdated", value.asInstanceOf[js.Any])
  }
}

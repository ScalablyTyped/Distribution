package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var query: js.UndefOr[Query] = js.undefined
}
object Payload {
  
  inline def apply(): Payload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload]
  }
  
  extension [Self <: Payload](x: Self) {
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}

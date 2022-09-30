package typings.reactQuery.queryMod

import typings.reactQuery.reactQueryStrings.fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchAction
  extends StObject
     with Action[Any, Any] {
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var `type`: fetch
}
object FetchAction {
  
  inline def apply(): FetchAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fetch")
    __obj.asInstanceOf[FetchAction]
  }
  
  extension [Self <: FetchAction](x: Self) {
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setType(value: fetch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

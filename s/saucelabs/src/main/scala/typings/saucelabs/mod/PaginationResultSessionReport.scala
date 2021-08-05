package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationResultSessionReport
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var entities: js.UndefOr[js.Array[SessionReport]] = js.undefined
  
  var metaData: js.UndefOr[PaginationSettings] = js.undefined
}
object PaginationResultSessionReport {
  
  inline def apply(): PaginationResultSessionReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationResultSessionReport]
  }
  
  extension [Self <: PaginationResultSessionReport](x: Self) {
    
    inline def setEntities(value: js.Array[SessionReport]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SessionReport*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setMetaData(value: PaginationSettings): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    inline def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
  }
}

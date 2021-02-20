package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationResultSessionReport
  extends /* key */ StringDictionary[js.Any] {
  
  var entities: js.UndefOr[js.Array[SessionReport]] = js.native
  
  var metaData: js.UndefOr[PaginationSettings] = js.native
}
object PaginationResultSessionReport {
  
  @scala.inline
  def apply(): PaginationResultSessionReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationResultSessionReport]
  }
  
  @scala.inline
  implicit class PaginationResultSessionReportMutableBuilder[Self <: PaginationResultSessionReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[SessionReport]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: SessionReport*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setMetaData(value: PaginationSettings): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
  }
}

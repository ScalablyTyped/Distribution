package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class PaginationResultSessionReportOps[Self <: PaginationResultSessionReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntitiesVarargs(value: SessionReport*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[SessionReport]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setMetaData(value: PaginationSettings): Self = this.set("metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaData: Self = this.set("metaData", js.undefined)
  }
}

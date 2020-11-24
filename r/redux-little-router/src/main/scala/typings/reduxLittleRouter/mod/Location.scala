package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends HistoryLocation {
  
  var basename: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[LocationOptions] = js.native
  
  var params: js.UndefOr[Params] = js.native
  
  var previous: js.UndefOr[Location] = js.native
  
  var query: js.UndefOr[Query] = js.native
  
  var queue: js.UndefOr[js.Array[Location]] = js.native
  
  var result: js.UndefOr[ObjectLiteral[_]] = js.native
  
  var routes: js.UndefOr[Routes] = js.native
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    
    @scala.inline
    def setOptions(value: LocationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPrevious(value: Location): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQueueVarargs(value: Location*): Self = this.set("queue", js.Array(value :_*))
    
    @scala.inline
    def setQueue(value: js.Array[Location]): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    
    @scala.inline
    def setResult(value: ObjectLiteral[_]): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setRoutes(value: Routes): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
  }
}

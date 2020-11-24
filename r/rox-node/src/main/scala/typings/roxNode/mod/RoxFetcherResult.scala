package typings.roxNode.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoxFetcherResult extends js.Object {
  
  var creationDate: Date = js.native
  
  var errorDetails: js.UndefOr[String] = js.native
  
  var fetcherStatus: RoxFetcherStatus = js.native
  
  var hasChanges: Boolean = js.native
}
object RoxFetcherResult {
  
  @scala.inline
  def apply(creationDate: Date, fetcherStatus: RoxFetcherStatus, hasChanges: Boolean): RoxFetcherResult = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], fetcherStatus = fetcherStatus.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoxFetcherResult]
  }
  
  @scala.inline
  implicit class RoxFetcherResultOps[Self <: RoxFetcherResult] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: Date): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetcherStatus(value: RoxFetcherStatus): Self = this.set("fetcherStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChanges(value: Boolean): Self = this.set("hasChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetails(value: String): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
  }
}

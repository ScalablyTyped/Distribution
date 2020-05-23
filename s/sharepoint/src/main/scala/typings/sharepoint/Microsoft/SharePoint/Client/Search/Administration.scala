package typings.sharepoint.Microsoft.SharePoint.Client.Search

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.JsonObjectResult
import typings.sharepoint.anon.High
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Administration")
@js.native
object Administration extends js.Object {
  @js.native
  trait DocumentCrawlLog extends ClientObject {
    def getCrawledUrls(
      getCountOnly: Boolean,
      maxRows: High,
      queryString: String,
      isLike: Boolean,
      contentSourceID: Double,
      errorLevel: Double,
      errorID: Double,
      startDateTime: Date,
      endDateTime: Date
    ): JsonObjectResult = js.native
  }
  
  @js.native
  sealed trait SearchObjectLevel extends js.Object
  
  @js.native
  object SearchObjectLevel extends js.Object {
    @js.native
    sealed trait spSite extends SearchObjectLevel
    
    @js.native
    sealed trait spSiteSubscription extends SearchObjectLevel
    
    @js.native
    sealed trait spWeb extends SearchObjectLevel
    
    @js.native
    sealed trait ssa extends SearchObjectLevel
    
  }
  
  type SearchObjectOwner = ClientObject
}


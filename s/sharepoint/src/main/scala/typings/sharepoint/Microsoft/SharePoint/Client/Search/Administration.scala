package typings.sharepoint.Microsoft.SharePoint.Client.Search

import typings.sharepoint.Anon_High
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel
import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.JsonObjectResult
import typings.sharepoint.SP.Site
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Administration")
@js.native
object Administration extends js.Object {
  @js.native
  class DocumentCrawlLog protected () extends ClientObject {
    def this(context: ClientContext, site: Site) = this()
    def getCrawledUrls(
      getCountOnly: Boolean,
      maxRows: Anon_High,
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
  class SearchObjectOwner protected () extends ClientObject {
    def this(context: ClientContext, lowestCurrentLevelToUse: SearchObjectLevel) = this()
  }
  
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
    
    /* 1 */ val spSite: typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSite with Double = js.native
    /* 2 */ val spSiteSubscription: typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSiteSubscription with Double = js.native
    /* 0 */ val spWeb: typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spWeb with Double = js.native
    /* 3 */ val ssa: typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.ssa with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SearchObjectLevel with Double] = js.native
  }
  
}


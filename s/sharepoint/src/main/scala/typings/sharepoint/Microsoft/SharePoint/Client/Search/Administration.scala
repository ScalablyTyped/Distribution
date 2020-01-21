package typings.sharepoint.Microsoft.SharePoint.Client.Search

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.AnonHigh
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
      maxRows: AnonHigh,
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SearchObjectLevel with Double] = js.native
    /* 1 */ @js.native
    object spSite extends TopLevel[spSite with Double]
    
    /* 2 */ @js.native
    object spSiteSubscription extends TopLevel[spSiteSubscription with Double]
    
    /* 0 */ @js.native
    object spWeb extends TopLevel[spWeb with Double]
    
    /* 3 */ @js.native
    object ssa extends TopLevel[ssa with Double]
    
  }
  
}


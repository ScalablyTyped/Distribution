package typings.sharepoint.global.Microsoft.SharePoint.Client.Search

import typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel
import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Site
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Administration {
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Administration.DocumentCrawlLog")
  @js.native
  class DocumentCrawlLog protected ()
    extends typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.DocumentCrawlLog {
    def this(context: ClientContext, site: Site) = this()
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel")
  @js.native
  object SearchObjectLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel with Double
      ] = js.native
    
    /* 1 */ val spSite: typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSite with Double = js.native
    
    /* 2 */ val spSiteSubscription: typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSiteSubscription with Double = js.native
    
    /* 0 */ val spWeb: typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spWeb with Double = js.native
    
    /* 3 */ val ssa: typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.ssa with Double = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Administration.SearchObjectOwner")
  @js.native
  class SearchObjectOwner protected () extends ClientObject {
    def this(context: ClientContext, lowestCurrentLevelToUse: SearchObjectLevel) = this()
  }
}

package typings.sharepoint.global.Microsoft.SharePoint.Client.Search

import typings.sharepoint.SP.ClientContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portability {
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Portability.SearchConfigurationPortability")
  @js.native
  class SearchConfigurationPortability protected ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Portability.SearchConfigurationPortability {
    def this(context: ClientContext) = this()
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Portability.SearchConfigurationPortabilityPropertyNames")
  @js.native
  class SearchConfigurationPortabilityPropertyNames ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Portability.SearchConfigurationPortabilityPropertyNames
  object SearchConfigurationPortabilityPropertyNames {
    
    @JSGlobal("Microsoft.SharePoint.Client.Search.Portability.SearchConfigurationPortabilityPropertyNames")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Portability.SearchConfigurationPortabilityPropertyNames.importWarnings")
    @js.native
    def importWarnings: String = js.native
    @scala.inline
    def importWarnings_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importWarnings")(x.asInstanceOf[js.Any])
  }
}

package typings.solrClient

import typings.solrClient.mod.Client
import typings.solrClient.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Solr {
    
    @JSGlobal("Solr")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createClient(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[Client]
    inline def createClient(options: Options): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  }
}

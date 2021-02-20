package typings.sharepoint.global.Microsoft

import typings.sharepoint.SP.ClientContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Office {
  
  object Server {
    
    object ReputationModel {
      
      @JSGlobal("Microsoft.Office.Server.ReputationModel.Reputation")
      @js.native
      class Reputation ()
        extends typings.sharepoint.Microsoft.Office.Server.ReputationModel.Reputation
      object Reputation {
        
        /* static member */
        @JSGlobal("Microsoft.Office.Server.ReputationModel.Reputation.setLike")
        @js.native
        def setLike(context: ClientContext, listId: String, itemId: Double, like: Boolean): Unit = js.native
        
        /* static member */
        @JSGlobal("Microsoft.Office.Server.ReputationModel.Reputation.setRating")
        @js.native
        def setRating(context: ClientContext, listId: String, itemId: Double, rating: Double): Unit = js.native
      }
    }
  }
}

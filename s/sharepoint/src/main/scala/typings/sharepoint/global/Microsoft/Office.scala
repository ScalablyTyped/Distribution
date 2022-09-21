package typings.sharepoint.global.Microsoft

import typings.sharepoint.SP.ClientContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Office {
  
  object Server {
    
    object ReputationModel {
      
      @JSGlobal("Microsoft.Office.Server.ReputationModel.Reputation")
      @js.native
      open class Reputation ()
        extends StObject
           with typings.sharepoint.Microsoft.Office.Server.ReputationModel.Reputation
      object Reputation {
        
        @JSGlobal("Microsoft.Office.Server.ReputationModel.Reputation")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        inline def setLike(context: ClientContext, listId: String, itemId: Double, like: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLike")(context.asInstanceOf[js.Any], listId.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], like.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /* static member */
        inline def setRating(context: ClientContext, listId: String, itemId: Double, rating: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRating")(context.asInstanceOf[js.Any], listId.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], rating.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
    }
  }
}

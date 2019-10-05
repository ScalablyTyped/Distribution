package typings.sharepoint.Microsoft

import typings.sharepoint.SP.ClientContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Office")
@js.native
object Office extends js.Object {
  @js.native
  object Server extends js.Object {
    @js.native
    object ReputationModel extends js.Object {
      @js.native
      class Reputation () extends js.Object
      
      /* static members */
      @js.native
      object Reputation extends js.Object {
        def setLike(context: ClientContext, listId: String, itemId: Double, like: Boolean): Unit = js.native
        def setRating(context: ClientContext, listId: String, itemId: Double, rating: Double): Unit = js.native
      }
      
    }
    
  }
  
}


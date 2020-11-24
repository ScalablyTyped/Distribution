package typings.samchon

import typings.samchon.iprotocolMod.IProtocol
import typings.samchon.userMod.User
import typings.samchon.webServerMod.WebServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/service/Server", JSImport.Namespace)
@js.native
object serviceServerMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Server ()
    extends WebServer
       with IProtocol {
    
    /**
      * @hidden
      */
    var _Erase_user: js.Any = js.native
    
    /**
      * @hidden
      */
    var account_map_ : js.Any = js.native
    
    /**
      * Factory method creating {@link User} object.
      *
      * @return A newly created {@link User} object.
      */
    /* protected */ def createUser(): User = js.native
    
    /**
      * Get an {@link User} object by its *accountID*.
      *
      * @param accountID Account id of {@link User} to get.
      * @return An {@link User} object.
      */
    def get(accountID: String): User = js.native
    
    /**
      * Test wheter an {@link User} exists with the *accountID*.
      *
      * @param accountID Account id of {@link User} to find.
      * @return Exists or not.
      */
    def has(accountID: String): Boolean = js.native
    
    /**
      * @hidden
      */
    var session_map_ : js.Any = js.native
  }
}

package typings.samchon

import typings.samchon.entityCollectionMod.EntityDequeCollection
import typings.samchon.externalSystemMod.ExternalSystem
import typings.samchon.externalSystemRoleMod.ExternalSystemRole
import typings.samchon.iprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalSystemArrayMod {
  
  @JSImport("samchon/templates/external/ExternalSystemArray", "ExternalSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: ExternalSystem */] ()
    extends EntityDequeCollection[System]
       with IProtocol {
    
    /**
      * @hidden
      */
    var _Handle_system_erase: js.Any = js.native
    
    /**
      * Get a role.
      *
      * @param name Name, identifier of target {@link ExternalSystemRole role}.
      *
      * @return The specified role.
      */
    def getRole(name: String): ExternalSystemRole = js.native
    
    /**
      * Test whether the role exists.
      *
      * @param name Name, identifier of target {@link ExternalSystemRole role}.
      *
      * @return Whether the role has or not.
      */
    def hasRole(name: String): Boolean = js.native
  }
}

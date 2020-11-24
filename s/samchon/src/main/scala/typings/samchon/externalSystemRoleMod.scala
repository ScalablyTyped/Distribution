package typings.samchon

import typings.samchon.entityMod.Entity
import typings.samchon.externalSystemArrayMod.ExternalSystemArray
import typings.samchon.externalSystemMod.ExternalSystem
import typings.samchon.iprotocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/external/ExternalSystemRole", JSImport.Namespace)
@js.native
object externalSystemRoleMod extends js.Object {
  
  @js.native
  abstract class ExternalSystemRole protected ()
    extends Entity
       with IProtocol {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: ExternalSystem) = this()
    
    /**
      * Get name, who represents and identifies this role.
      */
    def getName(): String = js.native
    
    /**
      * Get parent {@link ExternalSystemRole} object.
      */
    def getSystem(): ExternalSystem = js.native
    
    /**
      * Get grandparent {@link ExternalSystemArray}.
      *
      * Get the grandparent {@link ExternalSystemArray} object through this parent {@link ExternalSystem},
      * {@link ExternalSystem.getSystemArray ExternalSystem.getSystemArray()}.
      *
      * @return The grandparent {@link ExternalSystemArray} object.
      */
    def getSystemArray(): ExternalSystemArray[ExternalSystem] = js.native
    
    /**
      * A name, represents and identifies this {@link ExternalSystemRole role}.
      *
      * This {@link name} is an identifier represents this {@link ExternalSystemRole role}. This {@link name} is
      * used in {@link ExternalSystemArray.getRole} and {@link ExternalSystem.get}, as a key elements. Thus, this
      * {@link name} should be unique in an {@link ExternalSystemArray}.
      */
    var name: String = js.native
    
    /**
      * @hidden
      */
    var system: js.Any = js.native
  }
}

package typings.samchon

import typings.samchon.protocolEntityEntityMod.Entity
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.protocolInvokeIprotocolMod.IProtocol
import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesExternalExternalSystemRoleMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/external/ExternalSystemRole", "ExternalSystemRole")
  @js.native
  open class ExternalSystemRole protected ()
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
    /* protected */ var name: String = js.native
    
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    /* CompleteClass */
    override def replyData(invoke: Invoke): Unit = js.native
    
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    /* CompleteClass */
    override def sendData(invoke: Invoke): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var system: Any = js.native
  }
}

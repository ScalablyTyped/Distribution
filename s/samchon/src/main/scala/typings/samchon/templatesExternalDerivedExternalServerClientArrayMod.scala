package typings.samchon

import typings.samchon.templatesExternalDerivedExternalClientArrayMod.ExternalClientArray
import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesExternalDerivedExternalServerClientArrayMod {
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ecol.libBasicIeventdispatcherMod.IEventDispatcher because Already inherited
  - typings.ecol.libBasicIcollectionMod.ICollection because Already inherited
  - typings.ecol.libLinearDequeCollectionMod.DequeCollection because Already inherited
  - typings.ecol.mod.DequeCollection because Already inherited
  - typings.samchon.protocolInvokeIprotocolMod.IProtocol because Already inherited
  - typings.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection because Already inherited
  - typings.samchon.protocolServerIserverMod.IServer because Already inherited
  - typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray because Already inherited
  - typings.samchon.templatesExternalInterfacesIexternalclientarrayMod.IExternalClientArray because Already inherited
  - typings.samchon.templatesExternalInterfacesIexternalserverclientarrayMod.IExternalServerClientArray because var conflicts: _Handle_system_erase, _Notify_erase, _Notify_insert, dispatcher_. Inlined connect */ @JSImport("samchon/templates/external/derived/ExternalServerClientArray", "ExternalServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ExternalServerClientArray[T /* <: ExternalSystem */] () extends ExternalClientArray[T] {
    
    /**
      * @inheritdoc
      */
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
    
    /**
      * Factory method creating an {@link IExternalServer} object.
      *
      * @param xml An {@link XML} object represents child element, so that can identify the type of child to create.
      * @return A newly created {@link IExternalServer} object.
      */
    /* protected */ def createExternalServer(xml: XML): T = js.native
  }
}

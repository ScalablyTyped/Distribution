package typings.samchon

import typings.samchon.templatesDistributedDerivedDistributedClientArrayMediatorMod.DistributedClientArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesDistributedDerivedDistributedServerClientArrayMediatorMod {
  
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
  - typings.samchon.templatesExternalInterfacesIexternalserverclientarrayMod.IExternalServerClientArray because var conflicts: _Handle_system_erase, _Notify_erase, _Notify_insert, dispatcher_. Inlined connect */ @JSImport("samchon/templates/distributed/derived/DistributedServerClientArrayMediator", "DistributedServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerClientArrayMediator[System /* <: DistributedSystem */] () extends DistributedClientArrayMediator[System] {
    
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
      * Factory method creating an {@link IDistributedServer} object.
      *
      * @param xml An {@link XML} object represents child element, so that can identify the type of child to create.
      * @return A newly created {@link IDistributedServer} object.
      */
    /* protected */ def createExternalServer(xml: XML): System = js.native
  }
}

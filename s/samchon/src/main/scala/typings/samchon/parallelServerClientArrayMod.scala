package typings.samchon

import typings.samchon.parallelClientArrayMod.ParallelClientArray
import typings.samchon.parallelSystemMod.ParallelSystem
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallelServerClientArrayMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ecol.ieventdispatcherMod.IEventDispatcher because Already inherited
  - typings.ecol.icollectionMod.ICollection because Already inherited
  - typings.ecol.dequeCollectionMod.DequeCollection because Already inherited
  - typings.ecol.mod.DequeCollection because Already inherited
  - typings.samchon.iprotocolMod.IProtocol because Already inherited
  - typings.samchon.entityCollectionMod.EntityDequeCollection because Already inherited
  - typings.samchon.iserverMod.IServer because Already inherited
  - typings.samchon.externalSystemArrayMod.ExternalSystemArray because Already inherited
  - typings.samchon.iexternalclientarrayMod.IExternalClientArray because Already inherited
  - typings.samchon.iexternalserverclientarrayMod.IExternalServerClientArray because var conflicts: _Handle_system_erase, _Notify_erase, _Notify_insert, dispatcher_. Inlined connect */ @JSImport("samchon/templates/parallel/derived/ParallelServerClientArray", "ParallelServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArray[System /* <: ParallelSystem */] () extends ParallelClientArray[System] {
    
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
      * Factory method creating an {@link IParallelServer} object.
      *
      * @param xml An {@link XML} object represents child element, so that can identify the type of child to create.
      * @return A newly created {@link IParallelServer} object.
      */
    /* protected */ def createExternalServer(xml: XML): System = js.native
  }
}

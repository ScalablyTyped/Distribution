package typings.samchon

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.samchon.protocolServerIserverMod.IServer
import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesExternalInterfacesIexternalclientarrayMod {
  
  @js.native
  trait IExternalClientArray[System /* <: ExternalSystem */]
    extends ExternalSystemArray[System]
       with IServer {
    
    /* InferMemberOverrides */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          System, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    /* InferMemberOverrides */
    override def dispatchEvent(
      event: CollectionEvent[
          System, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[
          System, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
  }
}

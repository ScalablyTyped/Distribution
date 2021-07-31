package typings.samchonFramework.mod.collections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon-framework", "collections.HashMultiMapCollection")
@js.native
class HashMultiMapCollection[Key, T] ()
  extends typings.samchon.mod.collections.HashMultiMapCollection[Key, T]
object HashMultiMapCollection {
  
  /* was `typeof CollectionEvent` */
  @JSImport("samchon-framework", "collections.HashMultiMapCollection.Event")
  @js.native
  class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected ()
    extends typings.samchon.mod.collections.HashMultiMapCollection.Event[T, SourceT, IteratorT, ReverseT] {
    def this(`type`: String, first: IteratorT, last: IteratorT) = this()
  }
  /* was `typeof CollectionEvent` */
  object Event
}

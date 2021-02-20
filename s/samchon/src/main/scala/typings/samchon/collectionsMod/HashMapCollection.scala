package typings.samchon.collectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/collections", "HashMapCollection")
@js.native
class HashMapCollection[Key, T] ()
  extends typings.ecol.mod.HashMapCollection[Key, T]
object HashMapCollection {
  
  /* was `typeof CollectionEvent` */
  @JSImport("samchon/collections", "HashMapCollection.Event")
  @js.native
  class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected ()
    extends typings.ecol.mod.HashMapCollection.Event[T, SourceT, IteratorT, ReverseT] {
    def this(`type`: String, first: IteratorT, last: IteratorT) = this()
  }
  /* was `typeof CollectionEvent` */
  object Event
}

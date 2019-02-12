package typings
package samchonLib.collectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/collections", "CollectionEvent")
@js.native
class CollectionEvent[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] protected ()
  extends ecolLib.ecolMod.CollectionEvent[T, SourceT, IteratorT, ReverseT] {
  def this(`type`: java.lang.String, first: IteratorT, last: IteratorT) = this()
}


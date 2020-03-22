package typings.samchonFramework.mod.collections

import typings.tstl.icontainerMod.IContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.icontainerMod.IContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "collections.EventDispatcher")
@js.native
class EventDispatcher[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] ()
  extends typings.samchon.mod.collections.EventDispatcher[T, SourceT, IteratorT, ReverseT]


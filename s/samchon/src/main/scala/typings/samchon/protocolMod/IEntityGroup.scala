package typings.samchon.protocolMod

import typings.std.Iterator
import typings.sxml.sxmlMod.XML
import typings.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "IEntityGroup")
@js.native
object IEntityGroup extends js.Object {
  /**
    * @hidden
    */
  def construct[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    entityGroup: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    xml: XML,
    prohibited_names: String*
  ): Unit = js.native
  def count[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    entityGroup: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    key: js.Any
  ): Double = js.native
  def get[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    entityGroup: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    key: js.Any
  ): T = js.native
  def has[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    entityGroup: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    key: js.Any
  ): Boolean = js.native
  /**
    * @hidden
    */
  def toXML[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    group: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    prohibited_names: String*
  ): XML = js.native
}


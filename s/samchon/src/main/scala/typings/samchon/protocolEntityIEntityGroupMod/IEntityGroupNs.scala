package typings.samchon.protocolEntityIEntityGroupMod

import typings.samchon.protocolEntityIEntityMod.IEntity
import typings.sxml.sxmlMod.XML
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.tstlMod.baseNs.Container
import typings.tstl.tstlMod.baseNs.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/entity/IEntityGroup", "IEntityGroup")
@js.native
object IEntityGroupNs extends js.Object {
  /**
    * @hidden
    */
  def construct[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], xml: XML, prohibited_names: String*): Unit = js.native
  def count[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Double = js.native
  def get[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): T = js.native
  def has[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Boolean = js.native
  /**
    * @hidden
    */
  def toXML[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](group: IEntityGroup[T, SourceT, IteratorT, ReverseT], prohibited_names: String*): XML = js.native
}


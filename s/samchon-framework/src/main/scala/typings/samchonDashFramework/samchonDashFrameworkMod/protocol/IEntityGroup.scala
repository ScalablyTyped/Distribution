package typings.samchonDashFramework.samchonDashFrameworkMod.protocol

import typings.sxml.sxmlMod.XML
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.tstlMod.base.Container
import typings.tstl.tstlMod.base.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol.IEntityGroup")
@js.native
object IEntityGroup extends js.Object {
  /**
    * @hidden
    */
  def construct[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
    entityGroup: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    xml: XML,
    prohibited_names: String*
  ): Unit = js.native
  def count[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
    entityGroup: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    key: js.Any
  ): Double = js.native
  def get[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
    entityGroup: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    key: js.Any
  ): T = js.native
  def has[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
    entityGroup: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    key: js.Any
  ): Boolean = js.native
  /**
    * @hidden
    */
  def toXML[T /* <: typings.samchon.protocolEntityIEntityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
    group: typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    prohibited_names: String*
  ): XML = js.native
}


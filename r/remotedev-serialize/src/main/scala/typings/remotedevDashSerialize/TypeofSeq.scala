package typings.remotedevDashSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.SeqNs.Indexed
import typings.immutable.immutableMod.SeqNs.Keyed
import typings.immutable.immutableMod.SeqNs.Set
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSeq extends js.Object {
  /**
    * `Seq` which represents an ordered indexed list of values.
    */
  val IndexedNs: TypeofIndexed = js.native
  val KeyedNs: js.Any = js.native
  val SetNs: TypeofSetOf = js.native
  def Indexed(): typings.immutable.immutableMod.SeqNs.Indexed[_] = js.native
  def Indexed[T](collection: Iterable[T]): typings.immutable.immutableMod.SeqNs.Indexed[T] = js.native
  @JSName("Indexed")
  def Indexed_T[T](): Indexed[T] = js.native
  def Keyed(): typings.immutable.immutableMod.SeqNs.Keyed[_, _] = js.native
  def Keyed[V](obj: StringDictionary[V]): typings.immutable.immutableMod.SeqNs.Keyed[String, V] = js.native
  def Keyed[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.immutableMod.SeqNs.Keyed[K, V] = js.native
  @JSName("Keyed")
  def Keyed_KV[K, V](): Keyed[K, V] = js.native
  def Set(): typings.immutable.immutableMod.SeqNs.Set[_] = js.native
  def Set[T](collection: Iterable[T]): typings.immutable.immutableMod.SeqNs.Set[T] = js.native
  @JSName("Set")
  def Set_T[T](): Set[T] = js.native
  /**
    * True if `maybeSeq` is a Seq, it is not backed by a concrete
    * structure such as Map, List, or Set.
    */
  def isSeq(maybeSeq: js.Any): Boolean = js.native
}


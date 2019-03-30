package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CollectionIndexed extends js.Object {
  /**
    * `Seq` which represents an ordered indexed list of values.
    */
  val IndexedNs: Anon_OfValues = js.native
  val KeyedNs: js.Any = js.native
  val SetNs: Anon_Of = js.native
  def Indexed(): immutableLib.immutableMod.SeqNs.Indexed[_] = js.native
  def Indexed[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  @JSName("Indexed")
  def Indexed_T[T](): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Keyed(): immutableLib.immutableMod.SeqNs.Keyed[_, _] = js.native
  def Keyed[V](obj: org.scalablytyped.runtime.StringDictionary[V]): immutableLib.immutableMod.SeqNs.Keyed[java.lang.String, V] = js.native
  def Keyed[K, V](collection: stdLib.Iterable[js.Tuple2[K, V]]): immutableLib.immutableMod.SeqNs.Keyed[K, V] = js.native
  @JSName("Keyed")
  def Keyed_KV[K, V](): immutableLib.immutableMod.SeqNs.Keyed[K, V] = js.native
  def Set(): immutableLib.immutableMod.SeqNs.Set[_] = js.native
  def Set[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.SeqNs.Set[T] = js.native
  @JSName("Set")
  def Set_T[T](): immutableLib.immutableMod.SeqNs.Set[T] = js.native
  /**
    * True if `maybeSeq` is a Seq, it is not backed by a concrete
    * structure such as Map, List, or Set.
    */
  def isSeq(maybeSeq: js.Any): scala.Boolean = js.native
}


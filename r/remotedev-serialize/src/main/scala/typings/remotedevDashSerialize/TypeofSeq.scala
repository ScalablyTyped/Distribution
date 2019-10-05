package typings.remotedevDashSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.Seq
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSeq extends js.Object {
  /**
    * `Seq` which represents an ordered indexed list of values.
    */
  val Indexed: TypeofIndexedCollection = js.native
  val Keyed: TypeofKeyedCollection = js.native
  val Set: TypeofSetCollection = js.native
  def apply(): Seq[_, _] = js.native
  def apply[T](collection: typings.immutable.immutableMod.Collection.Indexed[T]): typings.immutable.immutableMod.Seq.Indexed[T] = js.native
  def apply[T](collection: typings.immutable.immutableMod.Collection.Set[T]): typings.immutable.immutableMod.Seq.Set[T] = js.native
  def apply[T](collection: Iterable[T]): typings.immutable.immutableMod.Seq.Indexed[T] = js.native
  def apply[V](obj: StringDictionary[V]): typings.immutable.immutableMod.Seq.Keyed[String, V] = js.native
  def apply[S /* <: Seq[_, _] */](seq: S): S = js.native
  def apply[K, V](collection: typings.immutable.immutableMod.Collection.Keyed[K, V]): typings.immutable.immutableMod.Seq.Keyed[K, V] = js.native
  /**
    * True if `maybeSeq` is a Seq, it is not backed by a concrete
    * structure such as Map, List, or Set.
    */
  def isSeq(maybeSeq: js.Any): Boolean = js.native
}


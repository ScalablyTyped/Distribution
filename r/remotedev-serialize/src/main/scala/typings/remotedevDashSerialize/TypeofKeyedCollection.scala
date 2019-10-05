package typings.remotedevDashSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.Seq.Keyed
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofKeyedCollection extends js.Object {
  def apply(): Keyed[_, _] = js.native
  def apply[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
  def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): Keyed[K, V] = js.native
}


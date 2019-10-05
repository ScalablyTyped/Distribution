package typings.remotedevDashSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.Collection.Keyed
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofKeyed extends js.Object {
  def apply[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
  def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): Keyed[K, V] = js.native
}


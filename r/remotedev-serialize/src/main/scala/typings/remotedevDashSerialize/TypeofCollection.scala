package typings.remotedevDashSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCollection extends js.Object {
  val IndexedNs: js.Any = js.native
  val KeyedNs: js.Any = js.native
  val SetNs: js.Any = js.native
  def Indexed[T](collection: Iterable[T]): typings.immutable.immutableMod.CollectionNs.Indexed[T] = js.native
  def Keyed[V](obj: StringDictionary[V]): typings.immutable.immutableMod.CollectionNs.Keyed[String, V] = js.native
  def Keyed[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.immutableMod.CollectionNs.Keyed[K, V] = js.native
  def Set[T](collection: Iterable[T]): typings.immutable.immutableMod.CollectionNs.Set[T] = js.native
  /**
    * @deprecated use `const { isAssociative } = require('immutable')`
    */
  def isAssociative(maybeAssociative: js.Any): Boolean = js.native
  /**
    * @deprecated use `const { isIndexed } = require('immutable')`
    */
  def isIndexed(maybeIndexed: js.Any): /* is immutable.immutable.Collection.Indexed<any> */ Boolean = js.native
  /**
    * @deprecated use `const { isKeyed } = require('immutable')`
    */
  def isKeyed(maybeKeyed: js.Any): /* is immutable.immutable.Collection.Keyed<any, any> */ Boolean = js.native
  /**
    * @deprecated use `const { isOrdered } = require('immutable')`
    */
  def isOrdered(maybeOrdered: js.Any): Boolean = js.native
}


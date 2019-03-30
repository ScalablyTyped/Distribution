package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Collection extends js.Object {
  val IndexedNs: js.Any = js.native
  val KeyedNs: js.Any = js.native
  val SetNs: js.Any = js.native
  def Indexed[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.CollectionNs.Indexed[T] = js.native
  def Keyed[V](obj: org.scalablytyped.runtime.StringDictionary[V]): immutableLib.immutableMod.CollectionNs.Keyed[java.lang.String, V] = js.native
  def Keyed[K, V](collection: stdLib.Iterable[js.Tuple2[K, V]]): immutableLib.immutableMod.CollectionNs.Keyed[K, V] = js.native
  def Set[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.CollectionNs.Set[T] = js.native
  /**
    * @deprecated use `const { isAssociative } = require('immutable')`
    */
  def isAssociative(maybeAssociative: js.Any): scala.Boolean = js.native
  /**
    * @deprecated use `const { isIndexed } = require('immutable')`
    */
  def isIndexed(maybeIndexed: js.Any): /* is immutable.immutable.Collection.Indexed<any> */ scala.Boolean = js.native
  /**
    * @deprecated use `const { isKeyed } = require('immutable')`
    */
  def isKeyed(maybeKeyed: js.Any): /* is immutable.immutable.Collection.Keyed<any, any> */ scala.Boolean = js.native
  /**
    * @deprecated use `const { isOrdered } = require('immutable')`
    */
  def isOrdered(maybeOrdered: js.Any): scala.Boolean = js.native
}


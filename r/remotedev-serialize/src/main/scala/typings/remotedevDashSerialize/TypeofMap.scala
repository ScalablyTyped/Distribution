package typings.remotedevDashSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.Map
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMap extends js.Object {
  def apply(): Map[_, _] = js.native
  def apply[V](obj: StringDictionary[V]): Map[String, V] = js.native
  def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): Map[K, V] = js.native
  /**
    * True if the provided value is a Map
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map.isMap({}) // false
    * Map.isMap(Map()) // true
    * ```
    */
  def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
  /**
    * Creates a new Map from alternating keys and values
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map.of(
    *   'key', 'value',
    *   'numerical value', 3,
    *    0, 'numerical key'
    * )
    * // Map { 0: "numerical key", "key": "value", "numerical value": 3 }
    * ```
    *
    * @deprecated Use Map([ [ 'k', 'v' ] ]) or Map({ k: 'v' })
    */
  def of(keyValues: js.Any*): Map[_, _] = js.native
}


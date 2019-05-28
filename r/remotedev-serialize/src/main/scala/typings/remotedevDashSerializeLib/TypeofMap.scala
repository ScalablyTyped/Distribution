package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofMap extends js.Object {
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
  def isMap(maybeMap: js.Any): /* is immutable.immutable.Map<any, any> */ scala.Boolean
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
  def of(keyValues: js.Any*): immutableLib.immutableMod.Map[_, _]
}

object TypeofMap {
  @scala.inline
  def apply(
    isMap: js.Any => /* is immutable.immutable.Map<any, any> */ scala.Boolean,
    of: /* repeated */ js.Any => immutableLib.immutableMod.Map[_, _]
  ): TypeofMap = {
    val __obj = js.Dynamic.literal(isMap = js.Any.fromFunction1(isMap), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[TypeofMap]
  }
}


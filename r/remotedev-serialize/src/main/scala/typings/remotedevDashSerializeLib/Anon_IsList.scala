package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsList extends js.Object {
  /**
    * True if the provided value is a List
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable');
    * List.isList([]); // false
    * List.isList(List()); // true
    * ```
    */
  def isList(maybeList: js.Any): /* is immutable.immutable.List<any> */ scala.Boolean
  /**
    * Creates a new List containing `values`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable');
    * List.of(1, 2, 3, 4)
    * // List [ 1, 2, 3, 4 ]
    * ```
    *
    * Note: Values are not altered or converted in any way.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable');
    * List.of({x:1}, 2, [3], 4)
    * // List [ { x: 1 }, 2, [ 3 ], 4 ]
    * ```
    */
  def of[T](values: T*): immutableLib.immutableMod.List[T]
}

object Anon_IsList {
  @scala.inline
  def apply(
    isList: js.Any => /* is immutable.immutable.List<any> */ scala.Boolean,
    of: /* repeated */ js.Any => immutableLib.immutableMod.List[js.Any]
  ): Anon_IsList = {
    val __obj = js.Dynamic.literal(isList = js.Any.fromFunction1(isList), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Anon_IsList]
  }
}


package typings.remotedevDashSerialize

import typings.immutable.immutableMod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofList extends js.Object {
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
  def isList(maybeList: js.Any): /* is immutable.immutable.List<any> */ Boolean
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
  def of[T](values: T*): List[T]
}

object TypeofList {
  @scala.inline
  def apply(
    isList: js.Any => /* is immutable.immutable.List<any> */ Boolean,
    of: /* repeated */ js.Any => List[js.Any]
  ): TypeofList = {
    val __obj = js.Dynamic.literal(isList = js.Any.fromFunction1(isList), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[TypeofList]
  }
}


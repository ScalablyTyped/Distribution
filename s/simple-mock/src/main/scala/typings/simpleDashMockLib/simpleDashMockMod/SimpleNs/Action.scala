package typings
package simpleDashMockLib.simpleDashMockMod.SimpleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T] extends js.Object {
  /**
    * arguments to call back with
    */
  var cbArgs: stdLib.ArrayLike[_]
  var returnValue: T
  var throwError: stdLib.Error
}


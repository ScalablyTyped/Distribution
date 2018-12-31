package typings
package simpleDashMockLib.simpleDashMockMod.SimpleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calls[T] extends js.Object {
  /**
    * first argument
    */
  var arg: js.Any
  /**
    * an array of arguments received on the call
    */
  var args: js.Array[_]
  /**
    * the context (this) of the call
    */
  var context: js.Any
  /**
    * autoincrementing number, can be compared to evaluate call order
    */
  var k: scala.Double
  /**
    * the value returned by the wrapped function
    */
  var returned: T
  /**
    * the error thrown by the wrapped function
    */
  var threw: stdLib.Error
}


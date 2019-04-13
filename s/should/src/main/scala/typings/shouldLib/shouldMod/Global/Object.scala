package typings
package shouldLib.shouldMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var should: shouldLib.shouldMod.Assertion
}

object Object {
  @scala.inline
  def apply(should: shouldLib.shouldMod.Assertion): Object = {
    val __obj = js.Dynamic.literal(should = should)
  
    __obj.asInstanceOf[Object]
  }
}


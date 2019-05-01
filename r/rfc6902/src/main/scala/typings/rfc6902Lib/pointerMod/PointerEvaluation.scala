package typings
package rfc6902Lib.pointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEvaluation extends js.Object {
  var key: java.lang.String
  var parent: js.Any
  var value: js.Any
}

object PointerEvaluation {
  @scala.inline
  def apply(key: java.lang.String, parent: js.Any, value: js.Any): PointerEvaluation = {
    val __obj = js.Dynamic.literal(key = key, parent = parent, value = value)
  
    __obj.asInstanceOf[PointerEvaluation]
  }
}


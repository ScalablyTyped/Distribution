package typings.rfc6902.pointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEvaluation extends js.Object {
  var key: String
  var parent: js.Any
  var value: js.Any
}

object PointerEvaluation {
  @scala.inline
  def apply(key: String, parent: js.Any, value: js.Any): PointerEvaluation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvaluation]
  }
}


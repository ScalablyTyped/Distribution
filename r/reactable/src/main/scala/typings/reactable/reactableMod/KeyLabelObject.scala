package typings.reactable.reactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyLabelObject extends js.Object {
  var key: String
  var label: String
}

object KeyLabelObject {
  @scala.inline
  def apply(key: String, label: String): KeyLabelObject = {
    val __obj = js.Dynamic.literal(key = key, label = label)
  
    __obj.asInstanceOf[KeyLabelObject]
  }
}


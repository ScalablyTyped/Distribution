package typings
package reactableLib.reactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyLabelObject extends js.Object {
  var key: java.lang.String
  var label: java.lang.String
}

object KeyLabelObject {
  @scala.inline
  def apply(key: java.lang.String, label: java.lang.String): KeyLabelObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[KeyLabelObject]
  }
}


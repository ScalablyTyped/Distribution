package typings
package quillLib.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: java.lang.String
  var shortKey: js.UndefOr[scala.Boolean] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: java.lang.String, shortKey: js.UndefOr[scala.Boolean] = js.undefined): Key = {
    val __obj = js.Dynamic.literal(key = key)
    if (!js.isUndefined(shortKey)) __obj.updateDynamic("shortKey")(shortKey)
    __obj.asInstanceOf[Key]
  }
}


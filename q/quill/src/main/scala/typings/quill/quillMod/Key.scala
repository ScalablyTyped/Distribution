package typings.quill.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var shortKey: js.UndefOr[Boolean] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: String, shortKey: js.UndefOr[Boolean] = js.undefined): Key = {
    val __obj = js.Dynamic.literal(key = key)
    if (!js.isUndefined(shortKey)) __obj.updateDynamic("shortKey")(shortKey)
    __obj.asInstanceOf[Key]
  }
}


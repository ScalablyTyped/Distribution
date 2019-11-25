package typings.quill.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String | Double
  var shortKey: js.UndefOr[Boolean] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: String | Double, shortKey: js.UndefOr[Boolean] = js.undefined): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(shortKey)) __obj.updateDynamic("shortKey")(shortKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}


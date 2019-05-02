package typings
package simplecrawlerLib.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var encodeURIComponent: js.UndefOr[js.Function] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(encodeURIComponent: js.Function = null): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (encodeURIComponent != null) __obj.updateDynamic("encodeURIComponent")(encodeURIComponent)
    __obj.asInstanceOf[StringifyOptions]
  }
}


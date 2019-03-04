package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceDescription extends js.Object {
  var code: java.lang.String
  var map: js.UndefOr[java.lang.String | RawSourceMap] = js.undefined
}

object SourceDescription {
  @scala.inline
  def apply(code: java.lang.String, map: java.lang.String | RawSourceMap = null): SourceDescription = {
    val __obj = js.Dynamic.literal(code = code)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDescription]
  }
}


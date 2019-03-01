package typings
package sourceDashMapDashSupportLib.sourceDashMapDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlAndMap extends js.Object {
  var map: java.lang.String | nodeLib.Buffer
  var url: java.lang.String
}

object UrlAndMap {
  @scala.inline
  def apply(map: java.lang.String | nodeLib.Buffer, url: java.lang.String): UrlAndMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UrlAndMap]
  }
}


package typings.sourceDashMapDashSupport.sourceDashMapDashSupportMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlAndMap extends js.Object {
  var map: String | Buffer
  var url: String
}

object UrlAndMap {
  @scala.inline
  def apply(map: String | Buffer, url: String): UrlAndMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlAndMap]
  }
}


package typings.sourceListMap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var map: Mappings
  var source: String
}

object Map {
  @scala.inline
  def apply(map: Mappings, source: String): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
}


package typings.sourceListMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMap extends js.Object {
  var map: AnonFileMappings
  var source: String
}

object AnonMap {
  @scala.inline
  def apply(map: AnonFileMappings, source: String): AnonMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMap]
  }
}


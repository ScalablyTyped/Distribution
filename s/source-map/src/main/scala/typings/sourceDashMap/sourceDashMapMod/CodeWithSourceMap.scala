package typings.sourceDashMap.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeWithSourceMap extends js.Object {
  var code: String
  var map: SourceMapGenerator
}

object CodeWithSourceMap {
  @scala.inline
  def apply(code: String, map: SourceMapGenerator): CodeWithSourceMap = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeWithSourceMap]
  }
}


package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeWithSourceMap extends js.Object {
  var code: java.lang.String
  var map: SourceMapGenerator
}

object CodeWithSourceMap {
  @scala.inline
  def apply(code: java.lang.String, map: SourceMapGenerator): CodeWithSourceMap = {
    val __obj = js.Dynamic.literal(code = code, map = map)
  
    __obj.asInstanceOf[CodeWithSourceMap]
  }
}


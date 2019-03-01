package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawSection extends js.Object {
  var map: RawSourceMap
  var offset: Position
}

object RawSection {
  @scala.inline
  def apply(map: RawSourceMap, offset: Position): RawSection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[RawSection]
  }
}


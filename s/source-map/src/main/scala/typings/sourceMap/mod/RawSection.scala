package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawSection extends js.Object {
  var map: RawSourceMap = js.native
  var offset: Position = js.native
}

object RawSection {
  @scala.inline
  def apply(map: RawSourceMap, offset: Position): RawSection = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawSection]
  }
  @scala.inline
  implicit class RawSectionOps[Self <: RawSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMap(value: RawSourceMap): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Position): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
  
}


package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawIndexMap extends StartOfSourceMap {
  var sections: js.Array[RawSection] = js.native
  var version: Double = js.native
}

object RawIndexMap {
  @scala.inline
  def apply(sections: js.Array[RawSection], version: Double): RawIndexMap = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawIndexMap]
  }
  @scala.inline
  implicit class RawIndexMapOps[Self <: RawIndexMap] (val x: Self) extends AnyVal {
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
    def setSectionsVarargs(value: RawSection*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[RawSection]): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}


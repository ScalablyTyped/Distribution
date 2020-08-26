package typings.puppeteer.mod

import typings.puppeteer.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageEntry extends js.Object {
  var ranges: js.Array[End] = js.native
  var text: String = js.native
  var url: String = js.native
}

object CoverageEntry {
  @scala.inline
  def apply(ranges: js.Array[End], text: String, url: String): CoverageEntry = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEntry]
  }
  @scala.inline
  implicit class CoverageEntryOps[Self <: CoverageEntry] (val x: Self) extends AnyVal {
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
    def setRangesVarargs(value: End*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[End]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}


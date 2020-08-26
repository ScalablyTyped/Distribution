package typings.reactNative.anon

import typings.reactNative.mod.SectionListData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Section[ItemT] extends js.Object {
  var section: SectionListData[ItemT] = js.native
}

object Section {
  @scala.inline
  def apply[ItemT](section: SectionListData[ItemT]): Section[ItemT] = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section[ItemT]]
  }
  @scala.inline
  implicit class SectionOps[Self <: Section[_], ItemT] (val x: Self with Section[ItemT]) extends AnyVal {
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
    def setSection(value: SectionListData[ItemT]): Self = this.set("section", value.asInstanceOf[js.Any])
  }
  
}


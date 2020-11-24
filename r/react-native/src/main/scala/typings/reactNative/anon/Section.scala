package typings.reactNative.anon

import typings.reactNative.mod.SectionListData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Section[ItemT, SectionT] extends js.Object {
  
  var section: SectionListData[ItemT, SectionT] = js.native
}
object Section {
  
  @scala.inline
  def apply[ItemT, SectionT](section: SectionListData[ItemT, SectionT]): Section[ItemT, SectionT] = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section[ItemT, SectionT]]
  }
  
  @scala.inline
  implicit class SectionOps[Self <: Section[_, _], ItemT, SectionT] (val x: Self with (Section[ItemT, SectionT])) extends AnyVal {
    
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
    def setSection(value: SectionListData[ItemT, SectionT]): Self = this.set("section", value.asInstanceOf[js.Any])
  }
}

package typings.prosemirrorMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TightLists extends js.Object {
  
  var tightLists: js.UndefOr[Boolean | Null] = js.native
}
object TightLists {
  
  @scala.inline
  def apply(): TightLists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TightLists]
  }
  
  @scala.inline
  implicit class TightListsOps[Self <: TightLists] (val x: Self) extends AnyVal {
    
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
    def setTightLists(value: Boolean): Self = this.set("tightLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTightLists: Self = this.set("tightLists", js.undefined)
    
    @scala.inline
    def setTightListsNull: Self = this.set("tightLists", null)
  }
}

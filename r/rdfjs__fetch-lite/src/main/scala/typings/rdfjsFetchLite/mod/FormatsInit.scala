package typings.rdfjsFetchLite.mod

import typings.rdfjsFetchLite.anon.FnCall
import typings.rdfjsFetchLite.anon.PickparsersSinkMapEventEm
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatsInit extends RequestInit {
  
  var fetch: js.UndefOr[FnCall] = js.native
  
  var formats: PickparsersSinkMapEventEm = js.native
}
object FormatsInit {
  
  @scala.inline
  def apply(formats: PickparsersSinkMapEventEm): FormatsInit = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatsInit]
  }
  
  @scala.inline
  implicit class FormatsInitOps[Self <: FormatsInit] (val x: Self) extends AnyVal {
    
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
    def setFormats(value: PickparsersSinkMapEventEm): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetch(value: FnCall): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
  }
}

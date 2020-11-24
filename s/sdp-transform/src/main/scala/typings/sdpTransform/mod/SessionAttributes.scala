package typings.sdpTransform.mod

import typings.sdpTransform.anon.Mids
import typings.sdpTransform.anon.Semantic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionAttributes extends SharedAttributes {
  
  // a=group:BUNDLE audio video
  var groups: js.UndefOr[js.Array[Mids]] = js.native
  
  // a=ice-options:google-ice
  var iceOptions: js.UndefOr[String] = js.native
  
  var icelite: js.UndefOr[String] = js.native
  
  // a=msid-semantic: WMS Jvlam5X3SX1OP6pn20zWogvaKJz5Hjf9OnlV
  var msidSemantic: js.UndefOr[Semantic] = js.native
}
object SessionAttributes {
  
  @scala.inline
  def apply(): SessionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionAttributes]
  }
  
  @scala.inline
  implicit class SessionAttributesOps[Self <: SessionAttributes] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: Mids*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[Mids]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setIceOptions(value: String): Self = this.set("iceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceOptions: Self = this.set("iceOptions", js.undefined)
    
    @scala.inline
    def setIcelite(value: String): Self = this.set("icelite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcelite: Self = this.set("icelite", js.undefined)
    
    @scala.inline
    def setMsidSemantic(value: Semantic): Self = this.set("msidSemantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsidSemantic: Self = this.set("msidSemantic", js.undefined)
  }
}

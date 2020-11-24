package typings.smartystreetsJavascriptSdk.mod.usStreet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analysis extends js.Object {
  
  var active: String = js.native
  
  var cmra: String = js.native
  
  var dpvFootnotes: String = js.native
  
  var dpvMatchCode: String = js.native
  
  var footnotes: String = js.native
  
  var isEwsMatch: Boolean = js.native
  
  var isSuiteLinkMatch: Boolean = js.native
  
  var lacsLinkCode: js.Any = js.native
  
  var lacsLinkIndicator: js.Any = js.native
  
  var vacant: String = js.native
}
object Analysis {
  
  @scala.inline
  def apply(
    active: String,
    cmra: String,
    dpvFootnotes: String,
    dpvMatchCode: String,
    footnotes: String,
    isEwsMatch: Boolean,
    isSuiteLinkMatch: Boolean,
    lacsLinkCode: js.Any,
    lacsLinkIndicator: js.Any,
    vacant: String
  ): Analysis = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cmra = cmra.asInstanceOf[js.Any], dpvFootnotes = dpvFootnotes.asInstanceOf[js.Any], dpvMatchCode = dpvMatchCode.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], isEwsMatch = isEwsMatch.asInstanceOf[js.Any], isSuiteLinkMatch = isSuiteLinkMatch.asInstanceOf[js.Any], lacsLinkCode = lacsLinkCode.asInstanceOf[js.Any], lacsLinkIndicator = lacsLinkIndicator.asInstanceOf[js.Any], vacant = vacant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analysis]
  }
  
  @scala.inline
  implicit class AnalysisOps[Self <: Analysis] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmra(value: String): Self = this.set("cmra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpvFootnotes(value: String): Self = this.set("dpvFootnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpvMatchCode(value: String): Self = this.set("dpvMatchCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotes(value: String): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEwsMatch(value: Boolean): Self = this.set("isEwsMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuiteLinkMatch(value: Boolean): Self = this.set("isSuiteLinkMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLacsLinkCode(value: js.Any): Self = this.set("lacsLinkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLacsLinkIndicator(value: js.Any): Self = this.set("lacsLinkIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVacant(value: String): Self = this.set("vacant", value.asInstanceOf[js.Any])
  }
}

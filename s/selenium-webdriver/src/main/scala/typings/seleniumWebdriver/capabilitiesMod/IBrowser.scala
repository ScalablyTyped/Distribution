package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBrowser extends js.Object {
  
  var CHROME: String = js.native
  
  var EDGE: String = js.native
  
  var FIREFOX: String = js.native
  
  var IE: String = js.native
  
  var INTERNET_EXPLORER: String = js.native
  
  var SAFARI: String = js.native
}
object IBrowser {
  
  @scala.inline
  def apply(
    CHROME: String,
    EDGE: String,
    FIREFOX: String,
    IE: String,
    INTERNET_EXPLORER: String,
    SAFARI: String
  ): IBrowser = {
    val __obj = js.Dynamic.literal(CHROME = CHROME.asInstanceOf[js.Any], EDGE = EDGE.asInstanceOf[js.Any], FIREFOX = FIREFOX.asInstanceOf[js.Any], IE = IE.asInstanceOf[js.Any], INTERNET_EXPLORER = INTERNET_EXPLORER.asInstanceOf[js.Any], SAFARI = SAFARI.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowser]
  }
  
  @scala.inline
  implicit class IBrowserOps[Self <: IBrowser] (val x: Self) extends AnyVal {
    
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
    def setCHROME(value: String): Self = this.set("CHROME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDGE(value: String): Self = this.set("EDGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIREFOX(value: String): Self = this.set("FIREFOX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIE(value: String): Self = this.set("IE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINTERNET_EXPLORER(value: String): Self = this.set("INTERNET_EXPLORER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAFARI(value: String): Self = this.set("SAFARI", value.asInstanceOf[js.Any])
  }
}

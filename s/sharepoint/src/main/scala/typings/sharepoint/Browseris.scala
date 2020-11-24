package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Browseris extends js.Object {
  
  var armProcessor: Boolean = js.native
  
  var chrome: Boolean = js.native
  
  var chrome7up: Boolean = js.native
  
  var chrome8up: Boolean = js.native
  
  var chrome9up: Boolean = js.native
  
  var firefox: Boolean = js.native
  
  var firefox36up: Boolean = js.native
  
  var firefox3up: Boolean = js.native
  
  var firefox4up: Boolean = js.native
  
  var ie: Boolean = js.native
  
  var ie55up: Boolean = js.native
  
  var ie5up: Boolean = js.native
  
  var ie7down: Boolean = js.native
  
  var ie8down: Boolean = js.native
  
  var ie8standard: Boolean = js.native
  
  var ie8standardUp: Boolean = js.native
  
  var ie9down: Boolean = js.native
  
  var ie9standardUp: Boolean = js.native
  
  var iever: Boolean = js.native
  
  var ipad: Boolean = js.native
  
  var isTouch: Boolean = js.native
  
  var mac: Boolean = js.native
  
  var major: Boolean = js.native
  
  var msTouch: Boolean = js.native
  
  var nav: Boolean = js.native
  
  var nav6: Boolean = js.native
  
  var nav6up: Boolean = js.native
  
  var nav7up: Boolean = js.native
  
  var osver: Boolean = js.native
  
  var safari: Boolean = js.native
  
  var safari125up: Boolean = js.native
  
  var safari3up: Boolean = js.native
  
  var verIEFull: Boolean = js.native
  
  var w3c: Boolean = js.native
  
  var webKit: Boolean = js.native
  
  var win: Boolean = js.native
  
  var win32: Boolean = js.native
  
  var win64bit: Boolean = js.native
  
  var win8AppHost: Boolean = js.native
  
  var windowsphone: Boolean = js.native
  
  var winnt: Boolean = js.native
}
object Browseris {
  
  @scala.inline
  def apply(
    armProcessor: Boolean,
    chrome: Boolean,
    chrome7up: Boolean,
    chrome8up: Boolean,
    chrome9up: Boolean,
    firefox: Boolean,
    firefox36up: Boolean,
    firefox3up: Boolean,
    firefox4up: Boolean,
    ie: Boolean,
    ie55up: Boolean,
    ie5up: Boolean,
    ie7down: Boolean,
    ie8down: Boolean,
    ie8standard: Boolean,
    ie8standardUp: Boolean,
    ie9down: Boolean,
    ie9standardUp: Boolean,
    iever: Boolean,
    ipad: Boolean,
    isTouch: Boolean,
    mac: Boolean,
    major: Boolean,
    msTouch: Boolean,
    nav: Boolean,
    nav6: Boolean,
    nav6up: Boolean,
    nav7up: Boolean,
    osver: Boolean,
    safari: Boolean,
    safari125up: Boolean,
    safari3up: Boolean,
    verIEFull: Boolean,
    w3c: Boolean,
    webKit: Boolean,
    win: Boolean,
    win32: Boolean,
    win64bit: Boolean,
    win8AppHost: Boolean,
    windowsphone: Boolean,
    winnt: Boolean
  ): Browseris = {
    val __obj = js.Dynamic.literal(armProcessor = armProcessor.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], chrome7up = chrome7up.asInstanceOf[js.Any], chrome8up = chrome8up.asInstanceOf[js.Any], chrome9up = chrome9up.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], firefox36up = firefox36up.asInstanceOf[js.Any], firefox3up = firefox3up.asInstanceOf[js.Any], firefox4up = firefox4up.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], ie55up = ie55up.asInstanceOf[js.Any], ie5up = ie5up.asInstanceOf[js.Any], ie7down = ie7down.asInstanceOf[js.Any], ie8down = ie8down.asInstanceOf[js.Any], ie8standard = ie8standard.asInstanceOf[js.Any], ie8standardUp = ie8standardUp.asInstanceOf[js.Any], ie9down = ie9down.asInstanceOf[js.Any], ie9standardUp = ie9standardUp.asInstanceOf[js.Any], iever = iever.asInstanceOf[js.Any], ipad = ipad.asInstanceOf[js.Any], isTouch = isTouch.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], msTouch = msTouch.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], nav6 = nav6.asInstanceOf[js.Any], nav6up = nav6up.asInstanceOf[js.Any], nav7up = nav7up.asInstanceOf[js.Any], osver = osver.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], safari125up = safari125up.asInstanceOf[js.Any], safari3up = safari3up.asInstanceOf[js.Any], verIEFull = verIEFull.asInstanceOf[js.Any], w3c = w3c.asInstanceOf[js.Any], webKit = webKit.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any], win32 = win32.asInstanceOf[js.Any], win64bit = win64bit.asInstanceOf[js.Any], win8AppHost = win8AppHost.asInstanceOf[js.Any], windowsphone = windowsphone.asInstanceOf[js.Any], winnt = winnt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browseris]
  }
  
  @scala.inline
  implicit class BrowserisOps[Self <: Browseris] (val x: Self) extends AnyVal {
    
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
    def setArmProcessor(value: Boolean): Self = this.set("armProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome7up(value: Boolean): Self = this.set("chrome7up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome8up(value: Boolean): Self = this.set("chrome8up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome9up(value: Boolean): Self = this.set("chrome9up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefox(value: Boolean): Self = this.set("firefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefox36up(value: Boolean): Self = this.set("firefox36up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefox3up(value: Boolean): Self = this.set("firefox3up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefox4up(value: Boolean): Self = this.set("firefox4up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe(value: Boolean): Self = this.set("ie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe55up(value: Boolean): Self = this.set("ie55up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe5up(value: Boolean): Self = this.set("ie5up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe7down(value: Boolean): Self = this.set("ie7down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe8down(value: Boolean): Self = this.set("ie8down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe8standard(value: Boolean): Self = this.set("ie8standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe8standardUp(value: Boolean): Self = this.set("ie8standardUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe9down(value: Boolean): Self = this.set("ie9down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe9standardUp(value: Boolean): Self = this.set("ie9standardUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIever(value: Boolean): Self = this.set("iever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpad(value: Boolean): Self = this.set("ipad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTouch(value: Boolean): Self = this.set("isTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: Boolean): Self = this.set("mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Boolean): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTouch(value: Boolean): Self = this.set("msTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNav(value: Boolean): Self = this.set("nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNav6(value: Boolean): Self = this.set("nav6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNav6up(value: Boolean): Self = this.set("nav6up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNav7up(value: Boolean): Self = this.set("nav7up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsver(value: Boolean): Self = this.set("osver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafari(value: Boolean): Self = this.set("safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafari125up(value: Boolean): Self = this.set("safari125up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafari3up(value: Boolean): Self = this.set("safari3up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerIEFull(value: Boolean): Self = this.set("verIEFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW3c(value: Boolean): Self = this.set("w3c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebKit(value: Boolean): Self = this.set("webKit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin(value: Boolean): Self = this.set("win", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin32(value: Boolean): Self = this.set("win32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin64bit(value: Boolean): Self = this.set("win64bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin8AppHost(value: Boolean): Self = this.set("win8AppHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsphone(value: Boolean): Self = this.set("windowsphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinnt(value: Boolean): Self = this.set("winnt", value.asInstanceOf[js.Any])
  }
}

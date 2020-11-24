package typings.reactAdal.anon

import typings.reactAdal.reactAdalNumbers.`1`
import typings.reactAdal.reactAdalNumbers.`2`
import typings.reactAdal.reactAdalNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ERROR extends js.Object {
  
  var ERROR: typings.reactAdal.reactAdalNumbers.`0` = js.native
  
  var INFO: `2` = js.native
  
  var VERBOSE: `3` = js.native
  
  var WARN: `1` = js.native
}
object ERROR {
  
  @scala.inline
  def apply(ERROR: typings.reactAdal.reactAdalNumbers.`0`, INFO: `2`, VERBOSE: `3`, WARN: `1`): ERROR = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], VERBOSE = VERBOSE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERROR]
  }
  
  @scala.inline
  implicit class ERROROps[Self <: ERROR] (val x: Self) extends AnyVal {
    
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
    def setERROR(value: typings.reactAdal.reactAdalNumbers.`0`): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINFO(value: `2`): Self = this.set("INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERBOSE(value: `3`): Self = this.set("VERBOSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWARN(value: `1`): Self = this.set("WARN", value.asInstanceOf[js.Any])
  }
}

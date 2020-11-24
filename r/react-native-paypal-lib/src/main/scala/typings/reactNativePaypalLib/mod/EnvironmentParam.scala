package typings.reactNativePaypalLib.mod

import typings.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK
import typings.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION
import typings.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentParam extends js.Object {
  
  var NO_NETWORK: typings.reactNativePaypalLib.reactNativePaypalLibStrings.NO_NETWORK = js.native
  
  var PRODUCTION: typings.reactNativePaypalLib.reactNativePaypalLibStrings.PRODUCTION = js.native
  
  var SANDBOX: typings.reactNativePaypalLib.reactNativePaypalLibStrings.SANDBOX = js.native
}
object EnvironmentParam {
  
  @scala.inline
  def apply(NO_NETWORK: NO_NETWORK, PRODUCTION: PRODUCTION, SANDBOX: SANDBOX): EnvironmentParam = {
    val __obj = js.Dynamic.literal(NO_NETWORK = NO_NETWORK.asInstanceOf[js.Any], PRODUCTION = PRODUCTION.asInstanceOf[js.Any], SANDBOX = SANDBOX.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentParam]
  }
  
  @scala.inline
  implicit class EnvironmentParamOps[Self <: EnvironmentParam] (val x: Self) extends AnyVal {
    
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
    def setNO_NETWORK(value: NO_NETWORK): Self = this.set("NO_NETWORK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPRODUCTION(value: PRODUCTION): Self = this.set("PRODUCTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSANDBOX(value: SANDBOX): Self = this.set("SANDBOX", value.asInstanceOf[js.Any])
  }
}

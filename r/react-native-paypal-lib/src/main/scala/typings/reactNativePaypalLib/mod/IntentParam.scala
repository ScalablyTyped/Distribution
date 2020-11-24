package typings.reactNativePaypalLib.mod

import typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE
import typings.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER
import typings.reactNativePaypalLib.reactNativePaypalLibStrings.SALE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentParam extends js.Object {
  
  var AUTHORIZE: typings.reactNativePaypalLib.reactNativePaypalLibStrings.AUTHORIZE = js.native
  
  var ORDER: typings.reactNativePaypalLib.reactNativePaypalLibStrings.ORDER = js.native
  
  var SALE: typings.reactNativePaypalLib.reactNativePaypalLibStrings.SALE = js.native
}
object IntentParam {
  
  @scala.inline
  def apply(AUTHORIZE: AUTHORIZE, ORDER: ORDER, SALE: SALE): IntentParam = {
    val __obj = js.Dynamic.literal(AUTHORIZE = AUTHORIZE.asInstanceOf[js.Any], ORDER = ORDER.asInstanceOf[js.Any], SALE = SALE.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentParam]
  }
  
  @scala.inline
  implicit class IntentParamOps[Self <: IntentParam] (val x: Self) extends AnyVal {
    
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
    def setAUTHORIZE(value: AUTHORIZE): Self = this.set("AUTHORIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setORDER(value: ORDER): Self = this.set("ORDER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSALE(value: SALE): Self = this.set("SALE", value.asInstanceOf[js.Any])
  }
}

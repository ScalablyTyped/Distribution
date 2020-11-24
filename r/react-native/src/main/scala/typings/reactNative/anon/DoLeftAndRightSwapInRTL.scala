package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoLeftAndRightSwapInRTL extends js.Object {
  
  var doLeftAndRightSwapInRTL: Boolean = js.native
  
  var isRTL: Boolean = js.native
}
object DoLeftAndRightSwapInRTL {
  
  @scala.inline
  def apply(doLeftAndRightSwapInRTL: Boolean, isRTL: Boolean): DoLeftAndRightSwapInRTL = {
    val __obj = js.Dynamic.literal(doLeftAndRightSwapInRTL = doLeftAndRightSwapInRTL.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoLeftAndRightSwapInRTL]
  }
  
  @scala.inline
  implicit class DoLeftAndRightSwapInRTLOps[Self <: DoLeftAndRightSwapInRTL] (val x: Self) extends AnyVal {
    
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
    def setDoLeftAndRightSwapInRTL(value: Boolean): Self = this.set("doLeftAndRightSwapInRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
  }
}

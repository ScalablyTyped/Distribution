package typings.reactNative.mod

import typings.reactNative.anon.DoLeftAndRightSwapInRTL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nManagerStatic extends js.Object {
  
  def allowRTL(allowRTL: Boolean): Unit = js.native
  
  var doLeftAndRightSwapInRTL: Boolean = js.native
  
  def forceRTL(forceRTL: Boolean): Unit = js.native
  
  def getConstants(): DoLeftAndRightSwapInRTL = js.native
  
  var isRTL: Boolean = js.native
  
  def swapLeftAndRightInRTL(swapLeftAndRight: Boolean): Unit = js.native
}
object I18nManagerStatic {
  
  @scala.inline
  def apply(
    allowRTL: Boolean => Unit,
    doLeftAndRightSwapInRTL: Boolean,
    forceRTL: Boolean => Unit,
    getConstants: () => DoLeftAndRightSwapInRTL,
    isRTL: Boolean,
    swapLeftAndRightInRTL: Boolean => Unit
  ): I18nManagerStatic = {
    val __obj = js.Dynamic.literal(allowRTL = js.Any.fromFunction1(allowRTL), doLeftAndRightSwapInRTL = doLeftAndRightSwapInRTL.asInstanceOf[js.Any], forceRTL = js.Any.fromFunction1(forceRTL), getConstants = js.Any.fromFunction0(getConstants), isRTL = isRTL.asInstanceOf[js.Any], swapLeftAndRightInRTL = js.Any.fromFunction1(swapLeftAndRightInRTL))
    __obj.asInstanceOf[I18nManagerStatic]
  }
  
  @scala.inline
  implicit class I18nManagerStaticOps[Self <: I18nManagerStatic] (val x: Self) extends AnyVal {
    
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
    def setAllowRTL(value: Boolean => Unit): Self = this.set("allowRTL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoLeftAndRightSwapInRTL(value: Boolean): Self = this.set("doLeftAndRightSwapInRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRTL(value: Boolean => Unit): Self = this.set("forceRTL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetConstants(value: () => DoLeftAndRightSwapInRTL): Self = this.set("getConstants", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapLeftAndRightInRTL(value: Boolean => Unit): Self = this.set("swapLeftAndRightInRTL", js.Any.fromFunction1(value))
  }
}

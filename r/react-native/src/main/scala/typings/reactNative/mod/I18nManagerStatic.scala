package typings.reactNative.mod

import typings.reactNative.anon.DoLeftAndRightSwapInRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18nManagerStatic extends StObject {
  
  def allowRTL(allowRTL: Boolean): Unit
  
  var doLeftAndRightSwapInRTL: Boolean
  
  def forceRTL(forceRTL: Boolean): Unit
  
  def getConstants(): DoLeftAndRightSwapInRTL
  
  var isRTL: Boolean
  
  def swapLeftAndRightInRTL(swapLeftAndRight: Boolean): Unit
}
object I18nManagerStatic {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: I18nManagerStatic] (val x: Self) extends AnyVal {
    
    inline def setAllowRTL(value: Boolean => Unit): Self = StObject.set(x, "allowRTL", js.Any.fromFunction1(value))
    
    inline def setDoLeftAndRightSwapInRTL(value: Boolean): Self = StObject.set(x, "doLeftAndRightSwapInRTL", value.asInstanceOf[js.Any])
    
    inline def setForceRTL(value: Boolean => Unit): Self = StObject.set(x, "forceRTL", js.Any.fromFunction1(value))
    
    inline def setGetConstants(value: () => DoLeftAndRightSwapInRTL): Self = StObject.set(x, "getConstants", js.Any.fromFunction0(value))
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setSwapLeftAndRightInRTL(value: Boolean => Unit): Self = StObject.set(x, "swapLeftAndRightInRTL", js.Any.fromFunction1(value))
  }
}

package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceSearchHelper extends StObject {
  
  def dispose(): Unit
  
  def getState(): VoiceListeningState
  
  def isBrowserSupported(): Boolean
  
  def isListening(): Boolean
  
  def toggleListening(): Unit
}
object VoiceSearchHelper {
  
  inline def apply(
    dispose: () => Unit,
    getState: () => VoiceListeningState,
    isBrowserSupported: () => Boolean,
    isListening: () => Boolean,
    toggleListening: () => Unit
  ): VoiceSearchHelper = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getState = js.Any.fromFunction0(getState), isBrowserSupported = js.Any.fromFunction0(isBrowserSupported), isListening = js.Any.fromFunction0(isListening), toggleListening = js.Any.fromFunction0(toggleListening))
    __obj.asInstanceOf[VoiceSearchHelper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceSearchHelper] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setGetState(value: () => VoiceListeningState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setIsBrowserSupported(value: () => Boolean): Self = StObject.set(x, "isBrowserSupported", js.Any.fromFunction0(value))
    
    inline def setIsListening(value: () => Boolean): Self = StObject.set(x, "isListening", js.Any.fromFunction0(value))
    
    inline def setToggleListening(value: () => Unit): Self = StObject.set(x, "toggleListening", js.Any.fromFunction0(value))
  }
}

package typings.reactInstantsearchDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceSearchHelper extends js.Object {
  
  def dispose(): Unit = js.native
  
  def getState(): VoiceListeningState = js.native
  
  def isBrowserSupported(): Boolean = js.native
  
  def isListening(): Boolean = js.native
  
  def toggleListening(): Unit = js.native
}
object VoiceSearchHelper {
  
  @scala.inline
  def apply(
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
  implicit class VoiceSearchHelperOps[Self <: VoiceSearchHelper] (val x: Self) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetState(value: () => VoiceListeningState): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBrowserSupported(value: () => Boolean): Self = this.set("isBrowserSupported", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsListening(value: () => Boolean): Self = this.set("isListening", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleListening(value: () => Unit): Self = this.set("toggleListening", js.Any.fromFunction0(value))
  }
}

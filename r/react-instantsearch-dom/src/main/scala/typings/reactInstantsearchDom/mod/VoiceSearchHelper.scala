package typings.reactInstantsearchDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceSearchHelper extends js.Object {
  def dispose(): Unit
  def getState(): VoiceListeningState
  def isBrowserSupported(): Boolean
  def isListening(): Boolean
  def toggleListening(): Unit
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
}


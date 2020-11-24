package typings.reactSpeechRecognition.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognition extends js.Object {
  
  def abortListening(): Unit = js.native
  
  def browserSupportsSpeechRecognition(): Boolean = js.native
  
  def getRecognition(): SpeechRecognition | Null = js.native
  
  def startListening(): js.Promise[Unit] = js.native
  def startListening(options: ListeningOptions): js.Promise[Unit] = js.native
  
  def stopListening(): Unit = js.native
}

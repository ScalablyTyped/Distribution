package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionEvent extends Event {
  val resultIndex: Double = js.native
  val results: SpeechRecognitionResultList = js.native
}


package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Speaks a text._
  * @see https://docs.scriptable.app/speech
  */
object Speech {
  
  @JSGlobal("Speech")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Speaks a text.
    * @param text - Text to speak.
    * @see https://docs.scriptable.app/speech/#speak
    */
  inline def speak(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("speak")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

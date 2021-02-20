package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Presents an interface for dictation._
  * @see https://docs.scriptable.app/dictation
  */
object Dictation {
  
  /**
    * _Starts dictation._
    *
    * Presents an interface that shows the dictated string. Press "Done" when you are done dictating the text.
    * @param locale - Optional string identifier that specifies the language to dictate in. E.g. "en" for English, "it" for Italian and "da" for Danish. Defaults to the locale of the
    * device.
    * @see https://docs.scriptable.app/dictation/#start
    */
  @JSGlobal("Dictation.start")
  @js.native
  def start(): js.Promise[String] = js.native
  @JSGlobal("Dictation.start")
  @js.native
  def start(locale: String): js.Promise[String] = js.native
}

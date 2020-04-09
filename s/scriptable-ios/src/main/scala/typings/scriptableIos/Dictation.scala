package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Presents an interface for dictation._
  * @see https://docs.scriptable.app/dictation
  */
@JSGlobal("Dictation")
@js.native
object Dictation extends js.Object {
  /**
    * _Starts dictation._
    *
    * Presents an interface that shows the dictated string. Press "Done" when you are done dictating the text.
    * @param locale - Optional string identifier that specifies the language to dictate in. E.g. "en" for English, "it" for Italian and "da" for Danish. Defaults to the locale of the
    * device.
    * @see https://docs.scriptable.app/dictation/#start
    */
  def start(): js.Promise[String] = js.native
  def start(locale: String): js.Promise[String] = js.native
}


package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`no-speech`
  - typings.std.stdStrings.aborted
  - typings.std.stdStrings.`audio-capture`
  - typings.std.stdStrings.network
  - typings.std.stdStrings.`not-allowed`
  - typings.std.stdStrings.`service-not-allowed`
  - typings.std.stdStrings.`bad-grammar`
  - typings.std.stdStrings.`language-not-supported`
*/
trait SpeechRecognitionErrorCode extends js.Object

object SpeechRecognitionErrorCode {
  @scala.inline
  def aborted: typings.std.stdStrings.aborted = this.cast("aborted")
  @scala.inline
  def `audio-capture`: typings.std.stdStrings.`audio-capture` = this.cast("audio-capture")
  @scala.inline
  def `bad-grammar`: typings.std.stdStrings.`bad-grammar` = this.cast("bad-grammar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `language-not-supported`: typings.std.stdStrings.`language-not-supported` = this.cast("language-not-supported")
  @scala.inline
  def network: typings.std.stdStrings.network = this.cast("network")
  @scala.inline
  def `no-speech`: typings.std.stdStrings.`no-speech` = this.cast("no-speech")
  @scala.inline
  def `not-allowed`: typings.std.stdStrings.`not-allowed` = this.cast("not-allowed")
  @scala.inline
  def `service-not-allowed`: typings.std.stdStrings.`service-not-allowed` = this.cast("service-not-allowed")
}


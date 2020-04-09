package typings.reactInstantsearchDom.mod

import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`audio-capture`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`bad-grammar`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`language-not-supported`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`no-speech`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`not-allowed`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`service-not-allowed`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.aborted
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceListeningState extends js.Object {
  var errorCode: js.UndefOr[
    `no-speech` | aborted | `audio-capture` | network | `not-allowed` | `service-not-allowed` | `bad-grammar` | `language-not-supported`
  ] = js.undefined
  var isSpeechFinal: Boolean
  var status: Status
  var transcript: String
}

object VoiceListeningState {
  @scala.inline
  def apply(
    isSpeechFinal: Boolean,
    status: Status,
    transcript: String,
    errorCode: `no-speech` | aborted | `audio-capture` | network | `not-allowed` | `service-not-allowed` | `bad-grammar` | `language-not-supported` = null
  ): VoiceListeningState = {
    val __obj = js.Dynamic.literal(isSpeechFinal = isSpeechFinal.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transcript = transcript.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceListeningState]
  }
}


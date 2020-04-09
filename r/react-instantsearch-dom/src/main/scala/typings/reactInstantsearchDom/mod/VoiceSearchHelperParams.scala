package typings.reactInstantsearchDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceSearchHelperParams extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var searchAsYouSpeak: Boolean
  def onQueryChange(query: String): Unit
  def onStateChange(): Unit
}

object VoiceSearchHelperParams {
  @scala.inline
  def apply(
    onQueryChange: String => Unit,
    onStateChange: () => Unit,
    searchAsYouSpeak: Boolean,
    language: String = null
  ): VoiceSearchHelperParams = {
    val __obj = js.Dynamic.literal(onQueryChange = js.Any.fromFunction1(onQueryChange), onStateChange = js.Any.fromFunction0(onStateChange), searchAsYouSpeak = searchAsYouSpeak.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSearchHelperParams]
  }
}


package typings.reactInstantsearchDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceSearchHelperParams extends js.Object {
  var language: js.UndefOr[String] = js.native
  var searchAsYouSpeak: Boolean = js.native
  def onQueryChange(query: String): Unit = js.native
  def onStateChange(): Unit = js.native
}

object VoiceSearchHelperParams {
  @scala.inline
  def apply(onQueryChange: String => Unit, onStateChange: () => Unit, searchAsYouSpeak: Boolean): VoiceSearchHelperParams = {
    val __obj = js.Dynamic.literal(onQueryChange = js.Any.fromFunction1(onQueryChange), onStateChange = js.Any.fromFunction0(onStateChange), searchAsYouSpeak = searchAsYouSpeak.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSearchHelperParams]
  }
  @scala.inline
  implicit class VoiceSearchHelperParamsOps[Self <: VoiceSearchHelperParams] (val x: Self) extends AnyVal {
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
    def setOnQueryChange(value: String => Unit): Self = this.set("onQueryChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnStateChange(value: () => Unit): Self = this.set("onStateChange", js.Any.fromFunction0(value))
    @scala.inline
    def setSearchAsYouSpeak(value: Boolean): Self = this.set("searchAsYouSpeak", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}


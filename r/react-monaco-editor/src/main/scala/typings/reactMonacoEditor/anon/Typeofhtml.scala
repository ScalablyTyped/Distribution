package typings.reactMonacoEditor.anon

import typings.monacoEditor.mod.languages.html.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofhtml extends js.Object {
  var handlebarDefaults: LanguageServiceDefaults = js.native
  var htmlDefaults: LanguageServiceDefaults = js.native
  var razorDefaults: LanguageServiceDefaults = js.native
}

object Typeofhtml {
  @scala.inline
  def apply(
    handlebarDefaults: LanguageServiceDefaults,
    htmlDefaults: LanguageServiceDefaults,
    razorDefaults: LanguageServiceDefaults
  ): Typeofhtml = {
    val __obj = js.Dynamic.literal(handlebarDefaults = handlebarDefaults.asInstanceOf[js.Any], htmlDefaults = htmlDefaults.asInstanceOf[js.Any], razorDefaults = razorDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofhtml]
  }
  @scala.inline
  implicit class TypeofhtmlOps[Self <: Typeofhtml] (val x: Self) extends AnyVal {
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
    def setHandlebarDefaults(value: LanguageServiceDefaults): Self = this.set("handlebarDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlDefaults(value: LanguageServiceDefaults): Self = this.set("htmlDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setRazorDefaults(value: LanguageServiceDefaults): Self = this.set("razorDefaults", value.asInstanceOf[js.Any])
  }
  
}


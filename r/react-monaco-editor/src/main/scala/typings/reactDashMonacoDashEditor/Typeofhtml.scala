package typings.reactDashMonacoDashEditor

import typings.monacoDashEditor.monacoDashEditorMod.languages.html.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhtml extends js.Object {
  var handlebarDefaults: LanguageServiceDefaults
  var htmlDefaults: LanguageServiceDefaults
  var razorDefaults: LanguageServiceDefaults
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
}


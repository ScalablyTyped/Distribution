package typings.reactDashMonacoDashEditor

import typings.monacoDashEditor.monacoDashEditorMod.languages.json.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofjson extends js.Object {
  var jsonDefaults: LanguageServiceDefaults
}

object Typeofjson {
  @scala.inline
  def apply(jsonDefaults: LanguageServiceDefaults): Typeofjson = {
    val __obj = js.Dynamic.literal(jsonDefaults = jsonDefaults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofjson]
  }
}


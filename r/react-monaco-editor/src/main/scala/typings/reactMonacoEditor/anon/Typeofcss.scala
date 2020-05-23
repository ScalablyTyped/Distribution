package typings.reactMonacoEditor.anon

import typings.monacoEditor.mod.languages.css.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcss extends js.Object {
  var cssDefaults: LanguageServiceDefaults
  var lessDefaults: LanguageServiceDefaults
  var scssDefaults: LanguageServiceDefaults
}

object Typeofcss {
  @scala.inline
  def apply(
    cssDefaults: LanguageServiceDefaults,
    lessDefaults: LanguageServiceDefaults,
    scssDefaults: LanguageServiceDefaults
  ): Typeofcss = {
    val __obj = js.Dynamic.literal(cssDefaults = cssDefaults.asInstanceOf[js.Any], lessDefaults = lessDefaults.asInstanceOf[js.Any], scssDefaults = scssDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcss]
  }
}


package typings.reactMonacoEditor.anon

import typings.monacoEditor.mod.languages.json.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofjson extends js.Object {
  var jsonDefaults: LanguageServiceDefaults = js.native
}

object Typeofjson {
  @scala.inline
  def apply(jsonDefaults: LanguageServiceDefaults): Typeofjson = {
    val __obj = js.Dynamic.literal(jsonDefaults = jsonDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofjson]
  }
  @scala.inline
  implicit class TypeofjsonOps[Self <: Typeofjson] (val x: Self) extends AnyVal {
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
    def setJsonDefaults(value: LanguageServiceDefaults): Self = this.set("jsonDefaults", value.asInstanceOf[js.Any])
  }
  
}


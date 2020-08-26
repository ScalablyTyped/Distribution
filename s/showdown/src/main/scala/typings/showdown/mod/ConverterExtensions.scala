package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Showdown converter extensions store object.
  */
@js.native
trait ConverterExtensions extends js.Object {
  var language: js.Array[ShowdownExtension] = js.native
  var output: js.Array[ShowdownExtension] = js.native
}

object ConverterExtensions {
  @scala.inline
  def apply(language: js.Array[ShowdownExtension], output: js.Array[ShowdownExtension]): ConverterExtensions = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterExtensions]
  }
  @scala.inline
  implicit class ConverterExtensionsOps[Self <: ConverterExtensions] (val x: Self) extends AnyVal {
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
    def setLanguageVarargs(value: ShowdownExtension*): Self = this.set("language", js.Array(value :_*))
    @scala.inline
    def setLanguage(value: js.Array[ShowdownExtension]): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputVarargs(value: ShowdownExtension*): Self = this.set("output", js.Array(value :_*))
    @scala.inline
    def setOutput(value: js.Array[ShowdownExtension]): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}


package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Showdown converter extensions store object.
  */
trait ConverterExtensions extends js.Object {
  var language: js.Array[ShowdownExtension]
  var output: js.Array[ShowdownExtension]
}

object ConverterExtensions {
  @scala.inline
  def apply(language: js.Array[ShowdownExtension], output: js.Array[ShowdownExtension]): ConverterExtensions = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterExtensions]
  }
}


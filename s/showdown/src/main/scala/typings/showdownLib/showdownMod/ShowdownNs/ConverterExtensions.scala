package typings
package showdownLib.showdownMod.ShowdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterExtensions extends js.Object {
  var language: js.Array[ShowdownExtension]
  var output: js.Array[ShowdownExtension]
}

object ConverterExtensions {
  @scala.inline
  def apply(language: js.Array[ShowdownExtension], output: js.Array[ShowdownExtension]): ConverterExtensions = {
    val __obj = js.Dynamic.literal(language = language, output = output)
  
    __obj.asInstanceOf[ConverterExtensions]
  }
}


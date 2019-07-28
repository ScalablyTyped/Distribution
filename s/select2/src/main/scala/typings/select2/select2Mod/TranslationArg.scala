package typings.select2.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationArg extends js.Object {
  var input: String
  var maximum: Double
  var minimum: Double
}

object TranslationArg {
  @scala.inline
  def apply(input: String, maximum: Double, minimum: Double): TranslationArg = {
    val __obj = js.Dynamic.literal(input = input, maximum = maximum, minimum = minimum)
  
    __obj.asInstanceOf[TranslationArg]
  }
}


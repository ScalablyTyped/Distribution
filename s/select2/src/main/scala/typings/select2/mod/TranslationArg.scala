package typings.select2.mod

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
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationArg]
  }
}


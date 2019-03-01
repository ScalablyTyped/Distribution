package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationArg extends js.Object {
  var input: java.lang.String
  var maximum: scala.Double
  var minimum: scala.Double
}

object TranslationArg {
  @scala.inline
  def apply(input: java.lang.String, maximum: scala.Double, minimum: scala.Double): TranslationArg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("maximum")(maximum)
    __obj.updateDynamic("minimum")(minimum)
    __obj.asInstanceOf[TranslationArg]
  }
}


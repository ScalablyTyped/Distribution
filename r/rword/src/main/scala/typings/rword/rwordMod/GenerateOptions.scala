package typings.rword.rwordMod

import typings.rword.rwordStrings.all
import typings.rword.rwordStrings.first
import typings.rword.rwordStrings.none
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  /**
    * Changes the capitalization of the words returned.
    */
  var capitalize: js.UndefOr[none | all | first] = js.undefined
  /**
    * Words that don't match the regexp will not be returned.
    */
  var contains: js.UndefOr[String | RegExp] = js.undefined
  /**
    * Allows you to set an exact length or range of lengths for words to return.
    */
  var length: js.UndefOr[Double | String] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    capitalize: none | all | first = null,
    contains: String | RegExp = null,
    length: Double | String = null
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    if (capitalize != null) __obj.updateDynamic("capitalize")(capitalize.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}


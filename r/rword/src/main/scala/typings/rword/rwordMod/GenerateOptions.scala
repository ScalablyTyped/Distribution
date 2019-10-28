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
    * Sets the capitalization of the randomly chosen words
    */
  var capitalize: js.UndefOr[none | first | all] = js.undefined
  /**
    * Regex words must match to have a chance of being randomly chosen
    * @example "word"
    * @example /ing$/
    */
  var contains: js.UndefOr[RegExp | String] = js.undefined
  /**
    * A length or range of lengths that a word must match for it to have a
    *  chance of being randomly chosen
    * @example 5
    * @example "3-10"
    */
  var length: js.UndefOr[String | Double] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    capitalize: none | first | all = null,
    contains: RegExp | String = null,
    length: String | Double = null
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    if (capitalize != null) __obj.updateDynamic("capitalize")(capitalize.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}


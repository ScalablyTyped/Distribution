package typings.projectNameGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Whether to output words beginning with the same letter or not
    * @default false
    */
  var alliterative: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether a numeric suffix is generated or not. The number is between 1 - 9999, both inclusive.
    * @default false
    */
  var number: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of words generated (excluding number).
    * All words will be adjectives, except the last one which will be a noun
    * @default 2
    */
  var words: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alliterative: js.UndefOr[Boolean] = js.undefined,
    number: js.UndefOr[Boolean] = js.undefined,
    words: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alliterative)) __obj.updateDynamic("alliterative")(alliterative.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(words)) __obj.updateDynamic("words")(words.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


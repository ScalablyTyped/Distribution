package typings
package rwordLib.rwordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  /**
    * Changes the capitalization of the words returned.
    */
  var capitalize: js.UndefOr[
    rwordLib.rwordLibStrings.none | rwordLib.rwordLibStrings.all | rwordLib.rwordLibStrings.first
  ] = js.undefined
  /**
    * Words that don't match the regexp will not be returned.
    */
  var contains: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  /**
    * Allows you to set an exact length or range of lengths for words to return.
    */
  var length: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    capitalize: rwordLib.rwordLibStrings.none | rwordLib.rwordLibStrings.all | rwordLib.rwordLibStrings.first = null,
    contains: java.lang.String | stdLib.RegExp = null,
    length: scala.Double | java.lang.String = null
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    if (capitalize != null) __obj.updateDynamic("capitalize")(capitalize.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}


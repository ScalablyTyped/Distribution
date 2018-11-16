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


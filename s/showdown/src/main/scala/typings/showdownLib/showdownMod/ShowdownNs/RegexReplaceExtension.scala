package typings
package showdownLib.showdownMod.ShowdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Regex/replace style extensions are very similar to javascript's string.replace function.
     * Two properties are given, `regex` and `replace`.
     */

trait RegexReplaceExtension extends Extension {
  /**
           * Should be either a string or a RegExp object.
           *
           * Keep in mind that, if a string is used, it will automatically be given a g modifier,
           * that is, it is assumed to be a global replacement.
           */
  var regex: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  /**
           * Can be either a string or a function. If replace is a string,
           * it can use the $1 syntax for group substitution,
           * exactly as if it were making use of string.replace (internally it does this actually).
           */
  var replace: js.UndefOr[js.Any] = js.undefined
}


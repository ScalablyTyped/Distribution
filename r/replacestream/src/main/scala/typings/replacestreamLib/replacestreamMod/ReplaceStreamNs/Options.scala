package typings
package replacestreamLib.replacestreamMod.ReplaceStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The text encoding used during search and replace.
    *
    * Default: `"utf8"`
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When doing string match (not relevant for regex matching) whether to do a
    * case insensitive search.
    *
    * Default: `true`
    */
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets a limit on the number of times the replacement will be made. This
    * is forced to one when a regex without the global flag is provided.
    *
    * Default: `Infinity`
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * When doing cross-chunk replacing, this sets the maximum length match
    * that will be supported.
    *
    * Default: `100`
    */
  var maxMatchLen: js.UndefOr[scala.Double] = js.undefined
  /**
    * When provided, these flags will be used when creating the search regexes
    * internally.
    *
    * @deprecated as the flags set on the regex provided are no longer mutated
    * if this is not provided.
    */
  var regExpOptions: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    maxMatchLen: scala.Int | scala.Double = null,
    regExpOptions: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maxMatchLen != null) __obj.updateDynamic("maxMatchLen")(maxMatchLen.asInstanceOf[js.Any])
    if (regExpOptions != null) __obj.updateDynamic("regExpOptions")(regExpOptions)
    __obj.asInstanceOf[Options]
  }
}


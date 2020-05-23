package typings.stringReplaceLoader.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceEntry extends Options {
  var flags: js.UndefOr[String] = js.undefined
  var replace: String | ReplaceCallback
  var search: String | RegExp
  var strict: js.UndefOr[Boolean] = js.undefined
}

object ReplaceEntry {
  @scala.inline
  def apply(
    replace: String | ReplaceCallback,
    search: String | RegExp,
    flags: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): ReplaceEntry = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceEntry]
  }
}


package typings.stripComments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strip-comments", "first")
@js.native
object first extends js.Object {
  
  /**
    * Strip the first comment from the given `input`. Or, if `opts.keepProtected` is true,
    * the first non-protected comment will be stripped.
    *
    * ```js
    * const output = strip.first(input, { keepProtected: true });
    * console.log(output);
    * // => '//! first comment\nfoo; '
    * ```
    * @param  `input` string from which to strip comments
    * @param [`options`] pass `opts.keepProtected: true` to keep comments with `!`
    */
  def apply(input: String): String = js.native
  def apply(input: String, options: Options): String = js.native
}

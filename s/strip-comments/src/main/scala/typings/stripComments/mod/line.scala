package typings.stripComments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strip-comments", "line")
@js.native
object line extends js.Object {
  /**
    * Strip only line comments.
    *
    * ```js
    * const str = strip.line('const foo = "bar";// this is a comment\n / * me too *\/');
    * console.log(str);
    * // => 'const foo = "bar";\n/ * me too *\/'
    * ```
    * @param  `input` string from which to strip comments
    * @param  [`options`] pass `opts.keepProtected: true` to keep ignored comments (e.g. `//!`)
    */
  def apply(input: String): String = js.native
  def apply(input: String, options: Options): String = js.native
}


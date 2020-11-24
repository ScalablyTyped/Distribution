package typings.stripComments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strip-comments", "block")
@js.native
object block extends js.Object {
  
  /**
    * Strip only block comments.
    *
    * ```js
    * const strip = require('..');
    * const str = strip.block('const foo = "bar";// this is a comment\n / * me too *\/');
    * console.log(str);
    * // => 'const foo = "bar";// this is a comment'
    * ```
    * @param `input` string from which to strip comments
    * @param  [`options`] pass `opts.keepProtected: true` to keep ignored comments (e.g. `/ *!`)
    */
  def apply(input: String): String = js.native
  def apply(input: String, options: Options): String = js.native
}

package typings.stripComments

import typings.stripComments.mod.Options
import typings.stripComments.nodeMod.Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strip-comments/lib/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  
  /**
    * Parses a string and returns a basic CST (Concrete Syntax Tree).
    *
    * ```js
    * const strip = require('..');
    * const str = strip.block('const foo = "bar";// this is a comment\n / * me too *\/');
    * console.log(str);
    * // => 'const foo = "bar";// this is a comment'
    * ```
    * @param  `input` string from which to strip comments
    * @param  `options` pass `opts.keepProtected: true` to keep ignored comments (e.g. `/ *!`)
    */
  def apply(input: String): Block = js.native
  def apply(input: String, options: Options): Block = js.native
}

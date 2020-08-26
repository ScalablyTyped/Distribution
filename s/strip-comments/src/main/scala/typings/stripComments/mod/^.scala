package typings.stripComments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strip-comments", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Strip all code comments from the given `input`, including protected
    * comments that start with `!`, unless disabled by setting `options.keepProtected`
    * to true.
    *
    * ```js
    * const str = strip('const foo = "bar";// this is a comment\n / * me too *\/');
    * console.log(str);
    * // => 'const foo = "bar";'
    * ```
    * @param string - string from which to strip comments
    * @param [options] - passed to [extract-comments][extract-comments]
    */
  def apply(input: String): String = js.native
  def apply(input: String, options: Options): String = js.native
}


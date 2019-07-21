package typings
package redentLib.redentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  [Strip redundant indentation](https://github.com/sindresorhus/strip-indent) and [indent the string](https://github.com/sindresorhus/indent-string).
  @param string - The string to normalize indentation.
  @param count - How many times you want `options.indent` repeated. Default: `0`.
  @example
  ```
  import redent = require('redent');
  redent('\n  foo\n    bar\n', 1);
  //=> '\n foo\n   bar\n'
  ```
  */
  def apply(string: java.lang.String): java.lang.String = js.native
  def apply(string: java.lang.String, count: scala.Double): java.lang.String = js.native
  def apply(string: java.lang.String, count: scala.Double, options: Options): java.lang.String = js.native
}


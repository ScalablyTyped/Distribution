package typings
package replaceDashStringLib.replaceDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("replace-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Replace all substring matches in a string.
  @param input - String to work on.
  @param needle - String to match in `input`.
  @param replacement - Replacement for `needle` matches.
  @returns A new string with all `needle` matches replaced with `replacement`.
  @example
  ```
  import replaceString = require('replace-string');
  const string = 'My friend has a 🐑. I want a 🐑 too!';
  replaceString(string, '🐑', '🦄');
  //=> 'My friend has a 🦄. I want a 🦄 too!'
  replaceString('Foo 🐑 Bar', '🐑', (needle, matchCount, input, matchIndex) => `${needle}❤️`);
  //=> 'Foo 🐑❤️ Bar'
  ```
  */
  def apply(
    input: java.lang.String,
    needle: java.lang.String,
    replacement: java.lang.String | ReplacementFunction
  ): java.lang.String = js.native
  def apply(
    input: java.lang.String,
    needle: java.lang.String,
    replacement: java.lang.String | ReplacementFunction,
    options: Options
  ): java.lang.String = js.native
}


package typings.replaceString.mod

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
  def apply(input: String, needle: String, replacement: String): String = js.native
  def apply(input: String, needle: String, replacement: String, options: Options): String = js.native
  def apply(input: String, needle: String, replacement: ReplacementFunction): String = js.native
  def apply(input: String, needle: String, replacement: ReplacementFunction, options: Options): String = js.native
}


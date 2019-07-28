package typings.stringDashLength

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string-length", JSImport.Namespace)
@js.native
object stringDashLengthMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function stringLength(string: string): number;
  // export = stringLength;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Get the real length of a string - by correctly counting astral symbols and ignoring [ansi escape codes](https://github.com/sindresorhus/strip-ansi).
  	`String#length` errornously counts [astral symbols](https://web.archive.org/web/20150721114550/http://www.tlg.uci.edu/~opoudjis/unicode/unicode_astral.html) as two characters.
  	@example
  	```
  	import stringLength = require('string-length');
  	'🐴'.length;
  	//=> 2
  	stringLength('🐴');
  	//=> 1
  	stringLength('\\u001B[1municorn\\u001B[22m');
  	//=> 7
  	```
  	*/
  def apply(string: String): Double = js.native
  /**
  	Get the real length of a string - by correctly counting astral symbols and ignoring [ansi escape codes](https://github.com/sindresorhus/strip-ansi).
  	`String#length` errornously counts [astral symbols](https://web.archive.org/web/20150721114550/http://www.tlg.uci.edu/~opoudjis/unicode/unicode_astral.html) as two characters.
  	@example
  	```
  	import stringLength = require('string-length');
  	'🐴'.length;
  	//=> 2
  	stringLength('🐴');
  	//=> 1
  	stringLength('\\u001B[1municorn\\u001B[22m');
  	//=> 7
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function stringLength(string: string): number;
  // export = stringLength;
  def default(string: String): Double = js.native
}


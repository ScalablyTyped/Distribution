package typings.stringWidth

import typings.stringWidth.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the visual width of a string - the number of columns required to display it.
  	Some Unicode characters are [fullwidth](https://en.wikipedia.org/wiki/Halfwidth_and_fullwidth_forms) and use double the normal width. [ANSI escape codes](https://en.wikipedia.org/wiki/ANSI_escape_code) are stripped and doesn't affect the width.
  	@example
  	```
  	import stringWidth = require('string-width');
  	stringWidth('a');
  	//=> 1
  	stringWidth('古');
  	//=> 2
  	stringWidth('\\u001B[1m古\\u001B[22m');
  	//=> 2
  	```
  	*/
  inline def apply(string: String): Double = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("string-width", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function stringWidth(string: string): number;
  // export = stringWidth;
  @JSImport("string-width", "default")
  @js.native
  def default: Call = js.native
  /**
  	Get the visual width of a string - the number of columns required to display it.
  	Some Unicode characters are [fullwidth](https://en.wikipedia.org/wiki/Halfwidth_and_fullwidth_forms) and use double the normal width. [ANSI escape codes](https://en.wikipedia.org/wiki/ANSI_escape_code) are stripped and doesn't affect the width.
  	@example
  	```
  	import stringWidth = require('string-width');
  	stringWidth('a');
  	//=> 1
  	stringWidth('古');
  	//=> 2
  	stringWidth('\\u001B[1m古\\u001B[22m');
  	//=> 2
  	```
  	*/
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function stringWidth(string: string): number;
  // export = stringWidth;
  inline def default(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}

package typings.stringWidth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
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
    def apply(string: String): Double = js.native
  }
}

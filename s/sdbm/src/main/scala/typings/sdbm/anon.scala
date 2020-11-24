package typings.sdbm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    /**
    	[SDBM](http://www.cse.yorku.ca/~oz/hash.html#sdbm) non-cryptographic hash function.
    	@returns The hash as a positive integer.
    	@example
    	```
    	import sdbm = require('sdbm');
    	sdbm('🦄🌈');
    	//=> 4053542802
    	```
    	*/
    def apply(string: String): Double = js.native
  }
}

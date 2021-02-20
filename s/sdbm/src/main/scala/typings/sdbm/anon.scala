package typings.sdbm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
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

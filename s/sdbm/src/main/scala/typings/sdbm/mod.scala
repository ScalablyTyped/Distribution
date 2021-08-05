package typings.sdbm

import typings.sdbm.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply(string: String): Double = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("sdbm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function sdbm(string: string): number;
  // export = sdbm;
  @JSImport("sdbm", "default")
  @js.native
  def default: Call = js.native
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
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function sdbm(string: string): number;
  // export = sdbm;
  inline def default(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}

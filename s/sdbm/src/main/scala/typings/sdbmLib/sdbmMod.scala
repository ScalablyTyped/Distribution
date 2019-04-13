package typings
package sdbmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdbm", JSImport.Namespace)
@js.native
object sdbmMod extends js.Object {
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function sdbm(string: string): number;
  // export = sdbm;
  @JSName("default")
  var default_Original: sdbmLib.Anon_Default = js.native
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
  def apply(string: java.lang.String): scala.Double = js.native
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
  def default(string: java.lang.String): scala.Double = js.native
}


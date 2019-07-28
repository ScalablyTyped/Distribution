package typings.sdbm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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


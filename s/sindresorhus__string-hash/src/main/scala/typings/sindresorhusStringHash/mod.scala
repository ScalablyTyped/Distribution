package typings.sindresorhusStringHash

import typings.sindresorhusFnv1a.AnonDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/string-hash", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function fnv1a(string: string): number;
  // export = fnv1a;
  @JSName("default")
  var default_Original: AnonDefault = js.native
  /**
  	[FNV-1a](https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function) non-cryptographic hash function.
  	@returns The hash as a positive integer.
  	@example
  	```
  	import fnv1a = require('@sindresorhus/fnv1a');
  	fnv1a('🦄🌈');
  	//=> 582881315
  	```
  	*/
  def apply(string: String): Double = js.native
  /**
  	[FNV-1a](https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function) non-cryptographic hash function.
  	@returns The hash as a positive integer.
  	@example
  	```
  	import fnv1a = require('@sindresorhus/fnv1a');
  	fnv1a('🦄🌈');
  	//=> 582881315
  	```
  	*/
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function fnv1a(string: string): number;
  // export = fnv1a;
  def default(string: String): Double = js.native
}


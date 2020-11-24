package typings.sindresorhusFnv1a.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sindresorhus/fnv1a", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	[FNV-1a](https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function) non-cryptographic hash function.
  	@returns The hash as a positive integer.
  	@example
  	```
  	import fnv1a = require('@sindresorhus/fnv1a');
  	fnv1a('🦄🌈');
  	//=> 2868248295
  	```
  	*/
  def apply(string: String): Double = js.native
  
  /**
  	[FNV-1a](https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function) non-cryptographic hash function.
  	Generate a larger hash using `BigInt`.
  	@returns The hash as a positive BigInt.
  	@example
  	```
  	import fnv1a = require('@sindresorhus/fnv1a');
  	fnv1a.bigInt('🦄🌈', {size: 128});
  	//=> 13487074350300261116944693128525960095n
  	```
  	*/
  def bigInt(string: String): js.BigInt = js.native
  def bigInt(string: String, options: Options): js.BigInt = js.native
}

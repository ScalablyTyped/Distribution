package typings.sindresorhusStringHash

import typings.sindresorhusFnv1a.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @scala.inline
  def apply(string: String): Double = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@sindresorhus/string-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def bigInt(string: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("bigInt")(string.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  @scala.inline
  def bigInt(string: String, options: Options): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("bigInt")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
}

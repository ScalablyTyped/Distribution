package typings.sindresorhusFnv1a

import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`1024`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`128`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`256`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`32`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`512`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`64`
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
  inline def apply(string: String): Double = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@sindresorhus/fnv1a", JSImport.Namespace)
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
  inline def bigInt(string: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("bigInt")(string.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def bigInt(string: String, options: Options): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("bigInt")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  trait Options extends StObject {
    
    /**
    		The bit size of the hash.
    		@default 32
    		*/
    var size: js.UndefOr[`32` | `64` | `128` | `256` | `512` | `1024`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSize(value: `32` | `64` | `128` | `256` | `512` | `1024`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

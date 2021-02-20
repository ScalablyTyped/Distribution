package typings.sindresorhusFnv1a

import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`1024`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`128`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`256`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`32`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`512`
import typings.sindresorhusFnv1a.sindresorhusFnv1aNumbers.`64`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("@sindresorhus/fnv1a", JSImport.Namespace)
  @js.native
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
  @JSImport("@sindresorhus/fnv1a", "bigInt")
  @js.native
  def bigInt(string: String): js.BigInt = js.native
  @JSImport("@sindresorhus/fnv1a", "bigInt")
  @js.native
  def bigInt(string: String, options: Options): js.BigInt = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		The bit size of the hash.
    		@default 32
    		*/
    var size: js.UndefOr[`32` | `64` | `128` | `256` | `512` | `1024`] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: `32` | `64` | `128` | `256` | `512` | `1024`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

package typings.sindresorhusFnv1a

import typings.sindresorhusFnv1a.sindresorhusFnv1aInts.`1024`
import typings.sindresorhusFnv1a.sindresorhusFnv1aInts.`128`
import typings.sindresorhusFnv1a.sindresorhusFnv1aInts.`256`
import typings.sindresorhusFnv1a.sindresorhusFnv1aInts.`32`
import typings.sindresorhusFnv1a.sindresorhusFnv1aInts.`512`
import typings.sindresorhusFnv1a.sindresorhusFnv1aInts.`64`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sindresorhus/fnv1a", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def default(string: String, options: Options): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  trait Options extends StObject {
    
    /**
    	The bit size of the hash.
    	@default 32
    	*/
    val size: js.UndefOr[`32` | `64` | `128` | `256` | `512` | `1024`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setSize(value: `32` | `64` | `128` | `256` | `512` | `1024`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

package typings.stablelibRandom

import typings.stablelibRandom.libSourceMod.RandomSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSourceBrowserMod {
  
  @JSImport("@stablelib/random/lib/source/browser", "BrowserRandomSource")
  @js.native
  open class BrowserRandomSource ()
    extends StObject
       with RandomSource {
    
    /* private */ var _crypto: Any = js.native
    
    /**
      * Returns the availability of random source.
      * A source can only be used if isAvailable returns true.
      */
    /* CompleteClass */
    var isAvailable: Boolean = js.native
    
    var isInstantiated: Boolean = js.native
    
    /**
      * Returns a byte array of the given length filled with random bytes.
      */
    /* CompleteClass */
    override def randomBytes(length: Double): js.typedarray.Uint8Array = js.native
  }
}

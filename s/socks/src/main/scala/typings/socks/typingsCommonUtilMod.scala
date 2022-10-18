package typings.socks

import typings.socks.typingsCommonConstantsMod.SocksClientChainOptions
import typings.socks.typingsCommonConstantsMod.SocksClientOptions
import typings.std.Error
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsCommonUtilMod {
  
  @JSImport("socks/typings/common/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Error wrapper for SocksClient
    */
  @JSImport("socks/typings/common/util", "SocksClientError")
  @js.native
  open class SocksClientError protected ()
    extends StObject
       with Error {
    def this(message: String, options: SocksClientChainOptions) = this()
    def this(message: String, options: SocksClientOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var options: SocksClientOptions | SocksClientChainOptions = js.native
  }
  
  /**
    * Shuffles a given array.
    * @param array The array to shuffle.
    */
  inline def shuffleArray(array: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffleArray")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type RequireOnlyOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]:? std.Required<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
}

package typings.socks

import typings.socks.constantsMod.SocksClientChainOptions
import typings.socks.constantsMod.SocksClientOptions
import typings.std.Error
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  /**
    * Error wrapper for SocksClient
    */
  @JSImport("socks/typings/common/util", "SocksClientError")
  @js.native
  class SocksClientError protected () extends Error {
    def this(message: String, options: SocksClientChainOptions) = this()
    def this(message: String, options: SocksClientOptions) = this()
    
    var options: SocksClientOptions | SocksClientChainOptions = js.native
  }
  
  /**
    * Shuffles a given array.
    * @param array The array to shuffle.
    */
  @JSImport("socks/typings/common/util", "shuffleArray")
  @js.native
  def shuffleArray(array: js.Array[_]): Unit = js.native
  
  type RequireOnlyOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]:? std.Required<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
}

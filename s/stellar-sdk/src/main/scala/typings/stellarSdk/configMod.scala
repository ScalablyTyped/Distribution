package typings.stellarSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("stellar-sdk/lib/config", "Config")
  @js.native
  class Config () extends StObject
  object Config {
    
    /* static member */
    @JSImport("stellar-sdk/lib/config", "Config.getTimeout")
    @js.native
    def getTimeout(): Double = js.native
    
    /* static member */
    @JSImport("stellar-sdk/lib/config", "Config.isAllowHttp")
    @js.native
    def isAllowHttp(): Boolean = js.native
    
    /* static member */
    @JSImport("stellar-sdk/lib/config", "Config.setAllowHttp")
    @js.native
    def setAllowHttp(value: Boolean): Unit = js.native
    
    /* static member */
    @JSImport("stellar-sdk/lib/config", "Config.setDefault")
    @js.native
    def setDefault(): Unit = js.native
    
    /* static member */
    @JSImport("stellar-sdk/lib/config", "Config.setTimeout")
    @js.native
    def setTimeout(value: Double): Unit = js.native
  }
}

package typings.skyway

import typings.std.RTCConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var config: js.UndefOr[RTCConfiguration] = js.native
  
  var credential: js.UndefOr[Credential] = js.native
  
  var debug: js.UndefOr[Double] = js.native
  
  var key: String = js.native
  
  var turn: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(key: String): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: RTCConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTurn(value: Boolean): Self = StObject.set(x, "turn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTurnUndefined: Self = StObject.set(x, "turn", js.undefined)
  }
}

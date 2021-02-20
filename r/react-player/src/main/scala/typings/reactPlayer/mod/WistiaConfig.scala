package typings.reactPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WistiaConfig extends StObject {
  
  var options: js.UndefOr[js.Object] = js.native
  
  var playerId: js.UndefOr[String] = js.native
}
object WistiaConfig {
  
  @scala.inline
  def apply(): WistiaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WistiaConfig]
  }
  
  @scala.inline
  implicit class WistiaConfigMutableBuilder[Self <: WistiaConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
  }
}

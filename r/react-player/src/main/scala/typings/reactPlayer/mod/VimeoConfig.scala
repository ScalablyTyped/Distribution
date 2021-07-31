package typings.reactPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VimeoConfig extends StObject {
  
  var playerOptions: js.UndefOr[js.Object] = js.undefined
}
object VimeoConfig {
  
  @scala.inline
  def apply(): VimeoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VimeoConfig]
  }
  
  @scala.inline
  implicit class VimeoConfigMutableBuilder[Self <: VimeoConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerOptions(value: js.Object): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerOptionsUndefined: Self = StObject.set(x, "playerOptions", js.undefined)
  }
}

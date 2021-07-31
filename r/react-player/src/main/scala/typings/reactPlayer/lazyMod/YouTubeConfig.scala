package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YouTubeConfig extends StObject {
  
  var embedOptions: js.UndefOr[js.Object] = js.undefined
  
  var onUnstarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var playerVars: js.UndefOr[js.Object] = js.undefined
}
object YouTubeConfig {
  
  @scala.inline
  def apply(): YouTubeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubeConfig]
  }
  
  @scala.inline
  implicit class YouTubeConfigMutableBuilder[Self <: YouTubeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbedOptions(value: js.Object): Self = StObject.set(x, "embedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedOptionsUndefined: Self = StObject.set(x, "embedOptions", js.undefined)
    
    @scala.inline
    def setOnUnstarted(value: () => Unit): Self = StObject.set(x, "onUnstarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUnstartedUndefined: Self = StObject.set(x, "onUnstarted", js.undefined)
    
    @scala.inline
    def setPlayerVars(value: js.Object): Self = StObject.set(x, "playerVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerVarsUndefined: Self = StObject.set(x, "playerVars", js.undefined)
  }
}

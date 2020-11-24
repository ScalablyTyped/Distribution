package typings.reactPlayer.lazyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YouTubeConfig extends js.Object {
  
  var embedOptions: js.UndefOr[js.Object] = js.native
  
  var onUnstarted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var playerVars: js.UndefOr[js.Object] = js.native
}
object YouTubeConfig {
  
  @scala.inline
  def apply(): YouTubeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubeConfig]
  }
  
  @scala.inline
  implicit class YouTubeConfigOps[Self <: YouTubeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmbedOptions(value: js.Object): Self = this.set("embedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbedOptions: Self = this.set("embedOptions", js.undefined)
    
    @scala.inline
    def setOnUnstarted(value: () => Unit): Self = this.set("onUnstarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnstarted: Self = this.set("onUnstarted", js.undefined)
    
    @scala.inline
    def setPlayerVars(value: js.Object): Self = this.set("playerVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerVars: Self = this.set("playerVars", js.undefined)
  }
}

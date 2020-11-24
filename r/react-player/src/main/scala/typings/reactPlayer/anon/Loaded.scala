package typings.reactPlayer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loaded extends js.Object {
  
  var loaded: Double = js.native
  
  var loadedSeconds: Double = js.native
  
  var played: Double = js.native
  
  var playedSeconds: Double = js.native
}
object Loaded {
  
  @scala.inline
  def apply(loaded: Double, loadedSeconds: Double, played: Double, playedSeconds: Double): Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], loadedSeconds = loadedSeconds.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], playedSeconds = playedSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loaded]
  }
  
  @scala.inline
  implicit class LoadedOps[Self <: Loaded] (val x: Self) extends AnyVal {
    
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
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedSeconds(value: Double): Self = this.set("loadedSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayed(value: Double): Self = this.set("played", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayedSeconds(value: Double): Self = this.set("playedSeconds", value.asInstanceOf[js.Any])
  }
}

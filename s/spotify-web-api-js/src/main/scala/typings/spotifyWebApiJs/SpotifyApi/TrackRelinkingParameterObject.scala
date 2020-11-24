package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackRelinkingParameterObject extends js.Object {
  
  var market: js.UndefOr[String] = js.native
}
object TrackRelinkingParameterObject {
  
  @scala.inline
  def apply(): TrackRelinkingParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackRelinkingParameterObject]
  }
  
  @scala.inline
  implicit class TrackRelinkingParameterObjectOps[Self <: TrackRelinkingParameterObject] (val x: Self) extends AnyVal {
    
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
    def setMarket(value: String): Self = this.set("market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarket: Self = this.set("market", js.undefined)
  }
}

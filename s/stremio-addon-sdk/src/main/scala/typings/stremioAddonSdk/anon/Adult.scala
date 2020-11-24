package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adult extends js.Object {
  
  /**
    * If the addon includes adult content.
    *
    * Defaults to false.
    */
  var adult: js.UndefOr[Boolean] = js.native
  
  /**
    * If the addon includes P2P content, such as BitTorrent, which may reveal the user's IP to other streaming parties.
    *
    * Used to provide an adequate warning to the user.
    */
  var p2p: js.UndefOr[Boolean] = js.native
}
object Adult {
  
  @scala.inline
  def apply(): Adult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adult]
  }
  
  @scala.inline
  implicit class AdultOps[Self <: Adult] (val x: Self) extends AnyVal {
    
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
    def setAdult(value: Boolean): Self = this.set("adult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdult: Self = this.set("adult", js.undefined)
    
    @scala.inline
    def setP2p(value: Boolean): Self = this.set("p2p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP2p: Self = this.set("p2p", js.undefined)
  }
}

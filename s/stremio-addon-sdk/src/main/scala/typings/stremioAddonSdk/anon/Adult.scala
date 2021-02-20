package typings.stremioAddonSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adult extends StObject {
  
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
  implicit class AdultMutableBuilder[Self <: Adult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdult(value: Boolean): Self = StObject.set(x, "adult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdultUndefined: Self = StObject.set(x, "adult", js.undefined)
    
    @scala.inline
    def setP2p(value: Boolean): Self = StObject.set(x, "p2p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2pUndefined: Self = StObject.set(x, "p2p", js.undefined)
  }
}

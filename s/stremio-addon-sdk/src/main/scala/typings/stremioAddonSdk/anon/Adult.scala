package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adult extends js.Object {
  /**
    * If the addon includes adult content.
    *
    * Defaults to false.
    */
  var adult: js.UndefOr[Boolean] = js.undefined
  /**
    * If the addon includes P2P content, such as BitTorrent, which may reveal the user's IP to other streaming parties.
    *
    * Used to provide an adequate warning to the user.
    */
  var p2p: js.UndefOr[Boolean] = js.undefined
}

object Adult {
  @scala.inline
  def apply(adult: js.UndefOr[Boolean] = js.undefined, p2p: js.UndefOr[Boolean] = js.undefined): Adult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adult)) __obj.updateDynamic("adult")(adult.get.asInstanceOf[js.Any])
    if (!js.isUndefined(p2p)) __obj.updateDynamic("p2p")(p2p.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adult]
  }
}


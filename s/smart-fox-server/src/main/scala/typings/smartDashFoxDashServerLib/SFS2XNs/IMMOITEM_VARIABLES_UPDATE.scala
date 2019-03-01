package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMMOITEM_VARIABLES_UPDATE extends js.Object {
  var changedVars: js.Array[java.lang.String]
  var mmoItem: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MMOItem
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MMORoom
}

object IMMOITEM_VARIABLES_UPDATE {
  @scala.inline
  def apply(
    changedVars: js.Array[java.lang.String],
    mmoItem: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MMOItem,
    room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MMORoom
  ): IMMOITEM_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changedVars")(changedVars)
    __obj.updateDynamic("mmoItem")(mmoItem)
    __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[IMMOITEM_VARIABLES_UPDATE]
  }
}


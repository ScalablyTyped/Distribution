package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.MMOItem
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.MMORoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMMOITEM_VARIABLES_UPDATE extends js.Object {
  var changedVars: js.Array[String]
  var mmoItem: MMOItem
  var room: MMORoom
}

object IMMOITEM_VARIABLES_UPDATE {
  @scala.inline
  def apply(changedVars: js.Array[String], mmoItem: MMOItem, room: MMORoom): IMMOITEM_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars, mmoItem = mmoItem, room = room)
  
    __obj.asInstanceOf[IMMOITEM_VARIABLES_UPDATE]
  }
}


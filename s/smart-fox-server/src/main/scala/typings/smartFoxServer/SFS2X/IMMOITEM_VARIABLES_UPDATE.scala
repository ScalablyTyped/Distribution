package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.MMOItem
import typings.smartFoxServer.SFS2X.Entities.MMORoom
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
    val __obj = js.Dynamic.literal(changedVars = changedVars.asInstanceOf[js.Any], mmoItem = mmoItem.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMMOITEM_VARIABLES_UPDATE]
  }
}


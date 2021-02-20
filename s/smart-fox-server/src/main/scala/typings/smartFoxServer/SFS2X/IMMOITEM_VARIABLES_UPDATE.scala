package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.MMOItem
import typings.smartFoxServer.SFS2X.Entities.MMORoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMMOITEM_VARIABLES_UPDATE extends StObject {
  
  var changedVars: js.Array[String] = js.native
  
  var mmoItem: MMOItem = js.native
  
  var room: MMORoom = js.native
}
object IMMOITEM_VARIABLES_UPDATE {
  
  @scala.inline
  def apply(changedVars: js.Array[String], mmoItem: MMOItem, room: MMORoom): IMMOITEM_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars.asInstanceOf[js.Any], mmoItem = mmoItem.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMMOITEM_VARIABLES_UPDATE]
  }
  
  @scala.inline
  implicit class IMMOITEM_VARIABLES_UPDATEMutableBuilder[Self <: IMMOITEM_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedVars(value: js.Array[String]): Self = StObject.set(x, "changedVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedVarsVarargs(value: String*): Self = StObject.set(x, "changedVars", js.Array(value :_*))
    
    @scala.inline
    def setMmoItem(value: MMOItem): Self = StObject.set(x, "mmoItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: MMORoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}

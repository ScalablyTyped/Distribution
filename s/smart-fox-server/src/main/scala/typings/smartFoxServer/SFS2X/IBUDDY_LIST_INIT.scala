package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBUDDY_LIST_INIT extends StObject {
  
  var buddyList: js.Array[SFSBuddy] = js.native
  
  var myVariables: js.Array[SFSBuddyVariable] = js.native
}
object IBUDDY_LIST_INIT {
  
  @scala.inline
  def apply(buddyList: js.Array[SFSBuddy], myVariables: js.Array[SFSBuddyVariable]): IBUDDY_LIST_INIT = {
    val __obj = js.Dynamic.literal(buddyList = buddyList.asInstanceOf[js.Any], myVariables = myVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_LIST_INIT]
  }
  
  @scala.inline
  implicit class IBUDDY_LIST_INITMutableBuilder[Self <: IBUDDY_LIST_INIT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuddyList(value: js.Array[SFSBuddy]): Self = StObject.set(x, "buddyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuddyListVarargs(value: SFSBuddy*): Self = StObject.set(x, "buddyList", js.Array(value :_*))
    
    @scala.inline
    def setMyVariables(value: js.Array[SFSBuddyVariable]): Self = StObject.set(x, "myVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMyVariablesVarargs(value: SFSBuddyVariable*): Self = StObject.set(x, "myVariables", js.Array(value :_*))
  }
}

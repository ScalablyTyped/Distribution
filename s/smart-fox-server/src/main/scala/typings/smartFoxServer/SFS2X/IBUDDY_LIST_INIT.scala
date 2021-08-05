package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBUDDY_LIST_INIT extends StObject {
  
  var buddyList: js.Array[SFSBuddy]
  
  var myVariables: js.Array[SFSBuddyVariable]
}
object IBUDDY_LIST_INIT {
  
  inline def apply(buddyList: js.Array[SFSBuddy], myVariables: js.Array[SFSBuddyVariable]): IBUDDY_LIST_INIT = {
    val __obj = js.Dynamic.literal(buddyList = buddyList.asInstanceOf[js.Any], myVariables = myVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_LIST_INIT]
  }
  
  extension [Self <: IBUDDY_LIST_INIT](x: Self) {
    
    inline def setBuddyList(value: js.Array[SFSBuddy]): Self = StObject.set(x, "buddyList", value.asInstanceOf[js.Any])
    
    inline def setBuddyListVarargs(value: SFSBuddy*): Self = StObject.set(x, "buddyList", js.Array(value :_*))
    
    inline def setMyVariables(value: js.Array[SFSBuddyVariable]): Self = StObject.set(x, "myVariables", value.asInstanceOf[js.Any])
    
    inline def setMyVariablesVarargs(value: SFSBuddyVariable*): Self = StObject.set(x, "myVariables", js.Array(value :_*))
  }
}

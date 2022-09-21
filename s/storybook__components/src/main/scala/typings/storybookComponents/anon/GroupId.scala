package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupId extends StObject {
  
  var groupId: js.UndefOr[js.Symbol] = js.undefined
}
object GroupId {
  
  inline def apply(): GroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupId]
  }
  
  extension [Self <: GroupId](x: Self) {
    
    inline def setGroupId(value: js.Symbol): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
  }
}

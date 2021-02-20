package typings.screeps

import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait POWER_CLASS extends StObject {
  
  var OPERATOR: operator = js.native
}
object POWER_CLASS {
  
  @scala.inline
  def apply(OPERATOR: operator): POWER_CLASS = {
    val __obj = js.Dynamic.literal(OPERATOR = OPERATOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[POWER_CLASS]
  }
  
  @scala.inline
  implicit class POWER_CLASSMutableBuilder[Self <: POWER_CLASS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOPERATOR(value: operator): Self = StObject.set(x, "OPERATOR", value.asInstanceOf[js.Any])
  }
}

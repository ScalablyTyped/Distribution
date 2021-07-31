package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTablePointInTimeRecovery extends StObject {
  
  var enabled: Boolean
}
object GetTablePointInTimeRecovery {
  
  @scala.inline
  def apply(enabled: Boolean): GetTablePointInTimeRecovery = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTablePointInTimeRecovery]
  }
  
  @scala.inline
  implicit class GetTablePointInTimeRecoveryMutableBuilder[Self <: GetTablePointInTimeRecovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}

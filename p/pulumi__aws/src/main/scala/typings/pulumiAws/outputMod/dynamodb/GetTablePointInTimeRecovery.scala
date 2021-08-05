package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTablePointInTimeRecovery extends StObject {
  
  var enabled: Boolean
}
object GetTablePointInTimeRecovery {
  
  inline def apply(enabled: Boolean): GetTablePointInTimeRecovery = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTablePointInTimeRecovery]
  }
  
  extension [Self <: GetTablePointInTimeRecovery](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}

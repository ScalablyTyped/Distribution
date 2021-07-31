package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TablePointInTimeRecovery extends StObject {
  
  /**
    * Indicates whether ttl is enabled (true) or disabled (false).
    */
  var enabled: Boolean
}
object TablePointInTimeRecovery {
  
  @scala.inline
  def apply(enabled: Boolean): TablePointInTimeRecovery = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablePointInTimeRecovery]
  }
  
  @scala.inline
  implicit class TablePointInTimeRecoveryMutableBuilder[Self <: TablePointInTimeRecovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}

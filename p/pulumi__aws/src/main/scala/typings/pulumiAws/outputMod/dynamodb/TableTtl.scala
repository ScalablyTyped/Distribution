package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableTtl extends StObject {
  
  /**
    * The name of the table attribute to store the TTL timestamp in.
    */
  var attributeName: String
  
  /**
    * Indicates whether ttl is enabled (true) or disabled (false).
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object TableTtl {
  
  inline def apply(attributeName: String): TableTtl = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTtl]
  }
  
  extension [Self <: TableTtl](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}

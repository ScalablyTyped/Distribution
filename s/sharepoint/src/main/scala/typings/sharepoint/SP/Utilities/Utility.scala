package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Utility extends StObject {
  
  var lAYOUTS_LATESTVERSION_RELATIVE_URL: String
  
  var lAYOUTS_LATESTVERSION_URL: String
}
object Utility {
  
  inline def apply(lAYOUTS_LATESTVERSION_RELATIVE_URL: String, lAYOUTS_LATESTVERSION_URL: String): Utility = {
    val __obj = js.Dynamic.literal(lAYOUTS_LATESTVERSION_RELATIVE_URL = lAYOUTS_LATESTVERSION_RELATIVE_URL.asInstanceOf[js.Any], lAYOUTS_LATESTVERSION_URL = lAYOUTS_LATESTVERSION_URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Utility] (val x: Self) extends AnyVal {
    
    inline def setLAYOUTS_LATESTVERSION_RELATIVE_URL(value: String): Self = StObject.set(x, "lAYOUTS_LATESTVERSION_RELATIVE_URL", value.asInstanceOf[js.Any])
    
    inline def setLAYOUTS_LATESTVERSION_URL(value: String): Self = StObject.set(x, "lAYOUTS_LATESTVERSION_URL", value.asInstanceOf[js.Any])
  }
}

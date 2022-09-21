package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3 extends StObject {
  
  var bucket: String
  
  var event: String
  
  var existing: js.UndefOr[Boolean] = js.undefined
  
  var rules: js.UndefOr[js.Array[S3Rule]] = js.undefined
}
object S3 {
  
  inline def apply(bucket: String, event: String): S3 = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
  
  extension [Self <: S3](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setExisting(value: Boolean): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
    
    inline def setExistingUndefined: Self = StObject.set(x, "existing", js.undefined)
    
    inline def setRules(value: js.Array[S3Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: S3Rule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}

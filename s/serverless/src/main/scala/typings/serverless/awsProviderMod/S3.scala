package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3 extends StObject {
  
  var bucket: String
  
  var event: String
  
  var existing: js.UndefOr[Boolean] = js.undefined
  
  var rules: js.Array[S3Rule]
}
object S3 {
  
  @scala.inline
  def apply(bucket: String, event: String, rules: js.Array[S3Rule]): S3 = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
  
  @scala.inline
  implicit class S3MutableBuilder[Self <: S3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExisting(value: Boolean): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingUndefined: Self = StObject.set(x, "existing", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[S3Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: S3Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}

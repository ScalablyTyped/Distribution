package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedrivePolicy extends StObject {
  
  var deadLetterTargetArn: js.UndefOr[String] = js.native
  
  var deadLetterTargetImport: js.UndefOr[DeadLetterTargetImport] = js.native
  
  var deadLetterTargetRef: js.UndefOr[String] = js.native
}
object RedrivePolicy {
  
  @scala.inline
  def apply(): RedrivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedrivePolicy]
  }
  
  @scala.inline
  implicit class RedrivePolicyMutableBuilder[Self <: RedrivePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadLetterTargetArn(value: String): Self = StObject.set(x, "deadLetterTargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterTargetArnUndefined: Self = StObject.set(x, "deadLetterTargetArn", js.undefined)
    
    @scala.inline
    def setDeadLetterTargetImport(value: DeadLetterTargetImport): Self = StObject.set(x, "deadLetterTargetImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterTargetImportUndefined: Self = StObject.set(x, "deadLetterTargetImport", js.undefined)
    
    @scala.inline
    def setDeadLetterTargetRef(value: String): Self = StObject.set(x, "deadLetterTargetRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterTargetRefUndefined: Self = StObject.set(x, "deadLetterTargetRef", js.undefined)
  }
}

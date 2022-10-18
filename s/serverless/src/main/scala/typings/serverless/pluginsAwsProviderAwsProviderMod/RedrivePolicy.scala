package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedrivePolicy extends StObject {
  
  var deadLetterTargetArn: js.UndefOr[String] = js.undefined
  
  var deadLetterTargetImport: js.UndefOr[DeadLetterTargetImport] = js.undefined
  
  var deadLetterTargetRef: js.UndefOr[String] = js.undefined
}
object RedrivePolicy {
  
  inline def apply(): RedrivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedrivePolicy]
  }
  
  extension [Self <: RedrivePolicy](x: Self) {
    
    inline def setDeadLetterTargetArn(value: String): Self = StObject.set(x, "deadLetterTargetArn", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterTargetArnUndefined: Self = StObject.set(x, "deadLetterTargetArn", js.undefined)
    
    inline def setDeadLetterTargetImport(value: DeadLetterTargetImport): Self = StObject.set(x, "deadLetterTargetImport", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterTargetImportUndefined: Self = StObject.set(x, "deadLetterTargetImport", js.undefined)
    
    inline def setDeadLetterTargetRef(value: String): Self = StObject.set(x, "deadLetterTargetRef", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterTargetRefUndefined: Self = StObject.set(x, "deadLetterTargetRef", js.undefined)
  }
}

package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeadLetterTargetImport extends StObject {
  
  var arn: String = js.native
  
  var url: String = js.native
}
object DeadLetterTargetImport {
  
  @scala.inline
  def apply(arn: String, url: String): DeadLetterTargetImport = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeadLetterTargetImport]
  }
  
  @scala.inline
  implicit class DeadLetterTargetImportMutableBuilder[Self <: DeadLetterTargetImport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

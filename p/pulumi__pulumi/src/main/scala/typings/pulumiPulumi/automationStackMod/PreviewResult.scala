package typings.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewResult extends StObject {
  
  var stderr: String = js.native
  
  var stdout: String = js.native
  
  var summary: UpdateSummary = js.native
}
object PreviewResult {
  
  @scala.inline
  def apply(stderr: String, stdout: String, summary: UpdateSummary): PreviewResult = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewResult]
  }
  
  @scala.inline
  implicit class PreviewResultMutableBuilder[Self <: PreviewResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: UpdateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}

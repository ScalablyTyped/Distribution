package typings.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpResult extends StObject {
  
  var outputs: OutputMap
  
  var stderr: String
  
  var stdout: String
  
  var summary: UpdateSummary
}
object UpResult {
  
  inline def apply(outputs: OutputMap, stderr: String, stdout: String, summary: UpdateSummary): UpResult = {
    val __obj = js.Dynamic.literal(outputs = outputs.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpResult]
  }
  
  extension [Self <: UpResult](x: Self) {
    
    inline def setOutputs(value: OutputMap): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: UpdateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}

package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import typings.snyk.distLibTypesMod.IacFileInDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidIssues extends StObject {
  
  var invalidIssues: js.Array[IacFileInDirectory]
  
  var validatedResult: IacFileScanResult
}
object InvalidIssues {
  
  inline def apply(invalidIssues: js.Array[IacFileInDirectory], validatedResult: IacFileScanResult): InvalidIssues = {
    val __obj = js.Dynamic.literal(invalidIssues = invalidIssues.asInstanceOf[js.Any], validatedResult = validatedResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidIssues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidIssues] (val x: Self) extends AnyVal {
    
    inline def setInvalidIssues(value: js.Array[IacFileInDirectory]): Self = StObject.set(x, "invalidIssues", value.asInstanceOf[js.Any])
    
    inline def setInvalidIssuesVarargs(value: IacFileInDirectory*): Self = StObject.set(x, "invalidIssues", js.Array(value*))
    
    inline def setValidatedResult(value: IacFileScanResult): Self = StObject.set(x, "validatedResult", value.asInstanceOf[js.Any])
  }
}

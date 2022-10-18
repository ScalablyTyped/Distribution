package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerIssue extends StObject {
  
  var dockerBaseImage: js.UndefOr[Any] = js.undefined
  
  var dockerfileInstruction: js.UndefOr[Any] = js.undefined
  
  var nearestFixedInVersion: js.UndefOr[String] = js.undefined
}
object DockerIssue {
  
  inline def apply(): DockerIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DockerIssue]
  }
  
  extension [Self <: DockerIssue](x: Self) {
    
    inline def setDockerBaseImage(value: Any): Self = StObject.set(x, "dockerBaseImage", value.asInstanceOf[js.Any])
    
    inline def setDockerBaseImageUndefined: Self = StObject.set(x, "dockerBaseImage", js.undefined)
    
    inline def setDockerfileInstruction(value: Any): Self = StObject.set(x, "dockerfileInstruction", value.asInstanceOf[js.Any])
    
    inline def setDockerfileInstructionUndefined: Self = StObject.set(x, "dockerfileInstruction", js.undefined)
    
    inline def setNearestFixedInVersion(value: String): Self = StObject.set(x, "nearestFixedInVersion", value.asInstanceOf[js.Any])
    
    inline def setNearestFixedInVersionUndefined: Self = StObject.set(x, "nearestFixedInVersion", js.undefined)
  }
}

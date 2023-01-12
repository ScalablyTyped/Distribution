package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.server

import typings.schematicsAngular.schematicsAngularStrings.closeProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseProject
  extends StObject
     with TypingInstallerRequestWithProjectName {
  
  val kind: closeProject
}
object CloseProject {
  
  inline def apply(projectName: String): CloseProject = {
    val __obj = js.Dynamic.literal(kind = "closeProject", projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseProject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseProject] (val x: Self) extends AnyVal {
    
    inline def setKind(value: closeProject): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}

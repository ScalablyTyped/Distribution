package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypingInstallerRequestWithProjectName extends StObject {
  
  val projectName: String
}
object TypingInstallerRequestWithProjectName {
  
  inline def apply(projectName: String): TypingInstallerRequestWithProjectName = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingInstallerRequestWithProjectName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypingInstallerRequestWithProjectName] (val x: Self) extends AnyVal {
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}

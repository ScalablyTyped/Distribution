package typings.snyk

import typings.snyk.anon.PickTestResultprojectName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestUtilsMod {
  
  @JSImport("snyk/dist/cli/commands/test/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathWithOptionalProjectName(currPath: String, testResult: PickTestResultprojectName): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathWithOptionalProjectName")(currPath.asInstanceOf[js.Any], testResult.asInstanceOf[js.Any])).asInstanceOf[String]
}

package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileData
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionYamlParserMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/yaml-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/yaml-parser", "InvalidJsonFileError")
  @js.native
  open class InvalidJsonFileError protected () extends CustomError {
    def this(filename: String) = this()
    
    var filename: String = js.native
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/yaml-parser", "InvalidYamlFileError")
  @js.native
  open class InvalidYamlFileError protected () extends CustomError {
    def this(filename: String) = this()
    
    var filename: String = js.native
  }
  
  inline def parseYAMLOrJSONFileData(fileData: IacFileData): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseYAMLOrJSONFileData")(fileData.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}

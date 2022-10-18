package typings.snyk

import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionParsersTerraformFileParserMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/parsers/terraform-file-parser", "FailedToParseTerraformFileError")
  @js.native
  open class FailedToParseTerraformFileError protected () extends CustomError {
    def this(filename: String) = this()
    
    var filename: String = js.native
  }
}

package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileData
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileParsed
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.ParsingResults
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionFileParserMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/file-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/file-parser", "UnsupportedFileTypeError")
  @js.native
  open class UnsupportedFileTypeError protected () extends CustomError {
    def this(fileType: String) = this()
  }
  
  inline def parseFiles(filesData: js.Array[IacFileData]): js.Promise[ParsingResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(filesData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsingResults]]
  inline def parseFiles(filesData: js.Array[IacFileData], options: IaCTestFlags): js.Promise[ParsingResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(filesData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParsingResults]]
  
  inline def parseNonTerraformFiles(filesData: js.Array[IacFileData], options: IaCTestFlags): ParsingResults = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNonTerraformFiles")(filesData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsingResults]
  
  inline def parseTerraformFiles(filesData: js.Array[IacFileData]): ParsingResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTerraformFiles")(filesData.asInstanceOf[js.Any]).asInstanceOf[ParsingResults]
  
  inline def tryParseIacFile(fileData: IacFileData): js.Array[IacFileParsed] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParseIacFile")(fileData.asInstanceOf[js.Any]).asInstanceOf[js.Array[IacFileParsed]]
  inline def tryParseIacFile(fileData: IacFileData, options: IaCTestFlags): js.Array[IacFileParsed] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParseIacFile")(fileData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IacFileParsed]]
}

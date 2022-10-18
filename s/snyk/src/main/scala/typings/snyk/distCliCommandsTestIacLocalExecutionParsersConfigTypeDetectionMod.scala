package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileData
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileParsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionParsersConfigTypeDetectionMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/parsers/config-type-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/parsers/config-type-detection", "REQUIRED_ARM_FIELDS")
  @js.native
  val REQUIRED_ARM_FIELDS: js.Array[String] = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/parsers/config-type-detection", "REQUIRED_CLOUDFORMATION_FIELDS")
  @js.native
  val REQUIRED_CLOUDFORMATION_FIELDS: js.Array[String] = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/parsers/config-type-detection", "REQUIRED_K8S_FIELDS")
  @js.native
  val REQUIRED_K8S_FIELDS: js.Array[String] = js.native
  
  inline def checkRequiredFieldsMatch(parsedDocument: Any, requiredFields: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkRequiredFieldsMatch")(parsedDocument.asInstanceOf[js.Any], requiredFields.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def detectConfigType(fileData: IacFileData, parsedIacFiles: js.Array[Any]): js.Array[IacFileParsed] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectConfigType")(fileData.asInstanceOf[js.Any], parsedIacFiles.asInstanceOf[js.Any])).asInstanceOf[js.Array[IacFileParsed]]
}

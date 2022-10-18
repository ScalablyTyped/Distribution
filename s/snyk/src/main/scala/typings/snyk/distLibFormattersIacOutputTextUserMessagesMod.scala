package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextUserMessagesMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/user-messages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/user-messages", "customRulesMessage")
  @js.native
  val customRulesMessage: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/user-messages", "customRulesReportMessage")
  @js.native
  val customRulesReportMessage: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/user-messages", "iacTestTitle")
  @js.native
  val iacTestTitle: String = js.native
  
  inline def shouldLogUserMessages(options: IaCTestFlags): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldLogUserMessages")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/user-messages", "spinnerMessage")
  @js.native
  val spinnerMessage: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/user-messages", "spinnerSuccessMessage")
  @js.native
  val spinnerSuccessMessage: String = js.native
}

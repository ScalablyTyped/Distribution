package typings.snyk

import typings.snyk.distLibFormattersIacOutputTextTypesMod.IaCTestFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextFailuresMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/failures", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/failures", "failuresTipOutput")
  @js.native
  val failuresTipOutput: String = js.native
  
  inline def formatFailuresList(testFailures: js.Array[IaCTestFailure]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFailuresList")(testFailures.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatIacTestFailures(testFailures: js.Array[IaCTestFailure]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIacTestFailures")(testFailures.asInstanceOf[js.Any]).asInstanceOf[String]
}

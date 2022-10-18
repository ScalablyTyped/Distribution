package typings.snyk

import typings.snyk.distLibFormattersIacOutputTextTypesMod.IaCTestFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextFailuresListMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/failures/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatFailuresList(testFailures: js.Array[IaCTestFailure]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFailuresList")(testFailures.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatIacTestFailures(testFailures: js.Array[IaCTestFailure]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIacTestFailures")(testFailures.asInstanceOf[js.Any]).asInstanceOf[String]
}

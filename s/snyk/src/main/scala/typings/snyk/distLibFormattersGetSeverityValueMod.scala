package typings.snyk

import typings.snyk.distLibSnykTestCommonMod.SEVERITY
import typings.snyk.snykStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersGetSeverityValueMod {
  
  @JSImport("snyk/dist/lib/formatters/get-severity-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSeverityValue(severity: SEVERITY): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityValue")(severity.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSeverityValue_none(severity: none): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityValue")(severity.asInstanceOf[js.Any]).asInstanceOf[Double]
}

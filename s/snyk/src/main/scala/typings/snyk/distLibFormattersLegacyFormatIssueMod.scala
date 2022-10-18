package typings.snyk

import typings.snyk.distLibSnykTestLegacyMod.GroupedVuln
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersLegacyFormatIssueMod {
  
  @JSImport("snyk/dist/lib/formatters/legacy-format-issue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatIssues(vuln: GroupedVuln, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssues")(vuln.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def titleCaseText(text: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCaseText")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
}

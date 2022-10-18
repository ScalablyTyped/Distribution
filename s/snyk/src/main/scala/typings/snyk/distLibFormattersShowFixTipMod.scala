package typings.snyk

import typings.snyk.distLibSnykTestLegacyMod.TestResult
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.SupportedProjectTypes
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersShowFixTipMod {
  
  @JSImport("snyk/dist/lib/formatters/show-fix-tip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def showFixTip(projectType: SupportedProjectTypes, res: TestResult, options: TestOptions & Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("showFixTip")(projectType.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}

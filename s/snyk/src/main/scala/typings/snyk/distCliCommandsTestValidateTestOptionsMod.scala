package typings.snyk

import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestValidateTestOptionsMod {
  
  @JSImport("snyk/dist/cli/commands/test/validate-test-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateTestOptions(options: TestOptions & Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTestOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

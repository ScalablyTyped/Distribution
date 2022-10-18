package typings.snyk

import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestSetDefaultTestOptionsMod {
  
  @JSImport("snyk/dist/cli/commands/test/set-default-test-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setDefaultTestOptions[CommandOptions](options: Options & CommandOptions): Options & TestOptions & CommandOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTestOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Options & TestOptions & CommandOptions]
}

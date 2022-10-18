package typings.snyk

import typings.snyk.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsProcessCommandArgsMod {
  
  @JSImport("snyk/dist/cli/commands/process-command-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processCommandArgs[CommandOptions](args: Any*): Options[CommandOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("processCommandArgs")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Options[CommandOptions]]
}

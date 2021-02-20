package typings.pulumiPulumi

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationErrorsMod {
  
  @JSImport("@pulumi/pulumi/x/automation/errors", "CommandError")
  @js.native
  class CommandError () extends Error {
    
    var commandResult: js.Any = js.native
  }
  
  @JSImport("@pulumi/pulumi/x/automation/errors", "ConcurrentUpdateError")
  @js.native
  class ConcurrentUpdateError () extends CommandError
  
  @JSImport("@pulumi/pulumi/x/automation/errors", "StackAlreadyExistsError")
  @js.native
  class StackAlreadyExistsError () extends CommandError
  
  @JSImport("@pulumi/pulumi/x/automation/errors", "StackNotFoundError")
  @js.native
  class StackNotFoundError () extends CommandError
}

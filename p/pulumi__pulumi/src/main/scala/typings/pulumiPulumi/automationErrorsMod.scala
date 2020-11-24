package typings.pulumiPulumi

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/x/automation/errors", JSImport.Namespace)
@js.native
object automationErrorsMod extends js.Object {
  
  @js.native
  class CommandError () extends Error {
    
    var commandResult: js.Any = js.native
  }
  
  @js.native
  class ConcurrentUpdateError () extends CommandError
  
  @js.native
  class StackAlreadyExistsError () extends CommandError
  
  @js.native
  class StackNotFoundError () extends CommandError
}

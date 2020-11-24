package typings.pulumiPulumi.localWorkspaceMod

import typings.pulumiPulumi.workspaceMod.PulumiFn
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineProgramArgs extends js.Object {
  
  /**
    * The inline (in process) Pulumi program to use with Update and Preview operations.
    */
  def program(): js.Promise[(Record[String, _]) | Unit] = js.native
  /**
    * The inline (in process) Pulumi program to use with Update and Preview operations.
    */
  @JSName("program")
  var program_Original: PulumiFn = js.native
  
  /**
    * The name of the associated project
    */
  var projectName: String = js.native
  
  /**
    * The name of the associated Stack
    */
  var stackName: String = js.native
}

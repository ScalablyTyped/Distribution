package typings.pulumiPulumi.rpcMod

import typings.pulumiPulumi.outputMod.Inputs
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/runtime/rpc", "serializeProperties")
@js.native
object serializeProperties extends js.Object {
  
  def apply(label: String, props: Inputs): js.Promise[Record[String, _]] = js.native
}

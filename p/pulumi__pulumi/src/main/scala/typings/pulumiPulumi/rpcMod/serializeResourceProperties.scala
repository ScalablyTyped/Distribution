package typings.pulumiPulumi.rpcMod

import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.resourceMod.Resource
import typings.std.Map
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/runtime/rpc", "serializeResourceProperties")
@js.native
object serializeResourceProperties extends js.Object {
  
  def apply(label: String, props: Inputs): js.Promise[js.Tuple2[Record[String, _], Map[String, Set[Resource]]]] = js.native
}

package typings.pulumiPulumi.rpcMod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.Resource
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/runtime/rpc", "serializeProperty")
@js.native
object serializeProperty extends js.Object {
  
  def apply(ctx: String, prop: Input[_], dependentResources: Set[Resource]): js.Promise[_] = js.native
}

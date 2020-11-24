package typings.pulumiAws.mod.route53

import typings.pulumiAws.getDelegationSetMod.GetDelegationSetArgs
import typings.pulumiAws.getDelegationSetMod.GetDelegationSetResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "route53.getDelegationSet")
@js.native
object getDelegationSet extends js.Object {
  
  def apply(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] = js.native
  def apply(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] = js.native
}

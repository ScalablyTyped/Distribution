package typings.atPulumiAws.wafMod

import typings.atPulumiAws.wafGetWebAclMod.GetWebAclArgs
import typings.atPulumiAws.wafGetWebAclMod.GetWebAclResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "getWebAcl")
@js.native
object getWebAcl extends js.Object {
  def apply(args: GetWebAclArgs): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
  def apply(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
}


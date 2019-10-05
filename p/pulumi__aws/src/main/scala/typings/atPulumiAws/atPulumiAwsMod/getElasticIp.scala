package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.getElasticIpMod.GetElasticIpArgs
import typings.atPulumiAws.getElasticIpMod.GetElasticIpResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getElasticIp")
@js.native
object getElasticIp extends js.Object {
  def apply(): js.Promise[GetElasticIpResult] with GetElasticIpResult = js.native
  def apply(args: GetElasticIpArgs): js.Promise[GetElasticIpResult] with GetElasticIpResult = js.native
  def apply(args: GetElasticIpArgs, opts: InvokeOptions): js.Promise[GetElasticIpResult] with GetElasticIpResult = js.native
}


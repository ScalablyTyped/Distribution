package typings.atPulumiAws.atPulumiAwsMod.ec2

import typings.atPulumiAws.ec2GetRouteTablesMod.GetRouteTablesArgs
import typings.atPulumiAws.ec2GetRouteTablesMod.GetRouteTablesResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getRouteTables")
@js.native
object getRouteTables extends js.Object {
  def apply(): js.Promise[GetRouteTablesResult] with GetRouteTablesResult = js.native
  def apply(args: GetRouteTablesArgs): js.Promise[GetRouteTablesResult] with GetRouteTablesResult = js.native
  def apply(args: GetRouteTablesArgs, opts: InvokeOptions): js.Promise[GetRouteTablesResult] with GetRouteTablesResult = js.native
}


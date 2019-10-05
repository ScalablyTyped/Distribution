package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.getAvailabilityZoneMod.GetAvailabilityZoneArgs
import typings.atPulumiAws.getAvailabilityZoneMod.GetAvailabilityZoneResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAvailabilityZone")
@js.native
object getAvailabilityZone extends js.Object {
  def apply(): js.Promise[GetAvailabilityZoneResult] with GetAvailabilityZoneResult = js.native
  def apply(args: GetAvailabilityZoneArgs): js.Promise[GetAvailabilityZoneResult] with GetAvailabilityZoneResult = js.native
  def apply(args: GetAvailabilityZoneArgs, opts: InvokeOptions): js.Promise[GetAvailabilityZoneResult] with GetAvailabilityZoneResult = js.native
}


package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.getAvailabilityZonesMod.GetAvailabilityZonesArgs
import typings.atPulumiAws.getAvailabilityZonesMod.GetAvailabilityZonesResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAvailabilityZones")
@js.native
object getAvailabilityZones extends js.Object {
  def apply(): js.Promise[GetAvailabilityZonesResult] with GetAvailabilityZonesResult = js.native
  def apply(args: GetAvailabilityZonesArgs): js.Promise[GetAvailabilityZonesResult] with GetAvailabilityZonesResult = js.native
  def apply(args: GetAvailabilityZonesArgs, opts: InvokeOptions): js.Promise[GetAvailabilityZonesResult] with GetAvailabilityZonesResult = js.native
}


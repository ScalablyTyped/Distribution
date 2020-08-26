package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsArgs
import typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getInstanceTypeOfferings")
@js.native
object getInstanceTypeOfferings extends js.Object {
  def apply(): js.Promise[GetInstanceTypeOfferingsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingsResult] = js.native
  def apply(args: GetInstanceTypeOfferingsArgs): js.Promise[GetInstanceTypeOfferingsResult] = js.native
  def apply(args: GetInstanceTypeOfferingsArgs, opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingsResult] = js.native
}


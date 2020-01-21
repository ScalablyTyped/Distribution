package typings.pulumiAws.lambdaMixinsMod

import typings.pulumiAws.lambdaFunctionMod.Function
import typings.pulumiAws.permissionMod.Permission
import typings.pulumiPulumi.mod.ComponentResource
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/lambdaMixins", "EventSubscription")
@js.native
class EventSubscription protected ()
  extends ComponentResource[js.Any] {
  def this(`type`: String, name: String) = this()
  def this(`type`: String, name: String, opts: ComponentResourceOptions) = this()
  var func: Function = js.native
  var permission: Permission = js.native
}


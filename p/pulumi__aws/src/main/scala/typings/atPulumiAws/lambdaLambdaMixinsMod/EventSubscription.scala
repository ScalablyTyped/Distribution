package typings.atPulumiAws.lambdaLambdaMixinsMod

import typings.atPulumiAws.lambdaFunctionMod.Function
import typings.atPulumiAws.lambdaPermissionMod.Permission
import typings.atPulumiPulumi.atPulumiPulumiMod.ComponentResource
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/lambdaMixins", "EventSubscription")
@js.native
class EventSubscription protected () extends ComponentResource {
  def this(`type`: String, name: String) = this()
  def this(`type`: String, name: String, opts: ComponentResourceOptions) = this()
  var func: Function = js.native
  var permission: Permission = js.native
}


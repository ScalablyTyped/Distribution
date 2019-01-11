package typings
package atPulumiAwsLib.lambdaLambdaMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/lambdaMixins", "EventSubscription")
@js.native
class EventSubscription protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.ComponentResource {
  def this(`type`: java.lang.String, name: java.lang.String) = this()
  def this(`type`: java.lang.String, name: java.lang.String, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  var func: atPulumiAwsLib.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  var permission: atPulumiAwsLib.lambdaPermissionMod.Permission = js.native
}


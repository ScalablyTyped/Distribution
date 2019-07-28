package typings.atPulumiAws.iotMod

import typings.atPulumiAws.iotGetEndpointMod.GetEndpointArgs
import typings.atPulumiAws.iotGetEndpointMod.GetEndpointResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getEndpoint(): js.Promise[GetEndpointResult] with GetEndpointResult = js.native
  def getEndpoint(args: GetEndpointArgs): js.Promise[GetEndpointResult] with GetEndpointResult = js.native
  def getEndpoint(args: GetEndpointArgs, opts: InvokeOptions): js.Promise[GetEndpointResult] with GetEndpointResult = js.native
}


package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/experimental/api", "API")
@js.native
class API protected ()
  extends atPulumiPulumiLib.pulumiMod.ComponentResource {
  def this(name: java.lang.String, args: APIArgs) = this()
  def this(name: java.lang.String, args: APIArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  var deployment: atPulumiAwsLib.awsMod.apigatewayNs.Deployment = js.native
  var restAPI: atPulumiAwsLib.awsMod.apigatewayNs.RestApi = js.native
  var stage: atPulumiAwsLib.awsMod.apigatewayNs.Stage = js.native
  var url: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}


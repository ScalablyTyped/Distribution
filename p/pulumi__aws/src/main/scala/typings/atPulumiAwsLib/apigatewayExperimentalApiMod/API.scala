package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/experimental/api", "API")
@js.native
class API protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.ComponentResource {
  def this(name: java.lang.String, args: APIArgs) = this()
  def this(name: java.lang.String, args: APIArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  var deployment: atPulumiAwsLib.atPulumiAwsMod.apigatewayNs.Deployment = js.native
  var restAPI: atPulumiAwsLib.atPulumiAwsMod.apigatewayNs.RestApi = js.native
  var stage: atPulumiAwsLib.atPulumiAwsMod.apigatewayNs.Stage = js.native
  var url: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}


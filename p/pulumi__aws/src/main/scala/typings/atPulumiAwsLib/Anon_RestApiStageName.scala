package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RestApiStageName extends js.Object {
  var restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  var stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_RestApiStageName {
  @scala.inline
  def apply(
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi],
    stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_RestApiStageName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RestApiStageName]
  }
}


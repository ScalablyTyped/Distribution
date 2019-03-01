package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RestApi extends js.Object {
  var restApi: atPulumiAwsLib.apigatewayRestApiMod.RestApi
  var stageName: java.lang.String
}

object Anon_RestApi {
  @scala.inline
  def apply(restApi: atPulumiAwsLib.apigatewayRestApiMod.RestApi, stageName: java.lang.String): Anon_RestApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restApi")(restApi)
    __obj.updateDynamic("stageName")(stageName)
    __obj.asInstanceOf[Anon_RestApi]
  }
}


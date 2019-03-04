package typings
package atPulumiAwsLib.apigatewayBasePathMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePathMappingArgs extends js.Object {
  /**
    * Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
    */
  val basePath: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The already-registered domain name to connect the API to.
    */
  val domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The id of the API to connect.
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  /**
    * The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
    */
  val stageName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object BasePathMappingArgs {
  @scala.inline
  def apply(
    domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi],
    basePath: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): BasePathMappingArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathMappingArgs]
  }
}


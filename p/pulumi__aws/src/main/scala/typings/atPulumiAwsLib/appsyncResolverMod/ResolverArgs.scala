package typings
package atPulumiAwsLib.appsyncResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverArgs extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The DataSource name.
    */
  val dataSource: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The resolver type. Valid values are `UNIT` and `PIPELINE`.
    */
  val kind: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The PipelineConfig. A `pipeline_config` block is documented below.
    */
  val pipelineConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FunctionsArray]] = js.undefined
  /**
    * The request mapping template for this resolver.
    */
  val requestTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The response mapping template for this resolver.
    */
  val responseTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ResolverArgs {
  @scala.inline
  def apply(
    apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    field: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    requestTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    responseTemplate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dataSource: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kind: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    pipelineConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FunctionsArray] = null
  ): ResolverArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], requestTemplate = requestTemplate.asInstanceOf[js.Any], responseTemplate = responseTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pipelineConfig != null) __obj.updateDynamic("pipelineConfig")(pipelineConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverArgs]
  }
}


package typings.atPulumiAws.appsyncResolverMod

import typings.atPulumiAws.Anon_FunctionsArray
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverArgs extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: Input[String]
  /**
    * The DataSource name.
    */
  val dataSource: js.UndefOr[Input[String]] = js.undefined
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: Input[String]
  /**
    * The resolver type. Valid values are `UNIT` and `PIPELINE`.
    */
  val kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * The PipelineConfig. A `pipeline_config` block is documented below.
    */
  val pipelineConfig: js.UndefOr[Input[Anon_FunctionsArray]] = js.undefined
  /**
    * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
    */
  val requestTemplate: Input[String]
  /**
    * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
    */
  val responseTemplate: Input[String]
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: Input[String]
}

object ResolverArgs {
  @scala.inline
  def apply(
    apiId: Input[String],
    field: Input[String],
    requestTemplate: Input[String],
    responseTemplate: Input[String],
    `type`: Input[String],
    dataSource: Input[String] = null,
    kind: Input[String] = null,
    pipelineConfig: Input[Anon_FunctionsArray] = null
  ): ResolverArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], requestTemplate = requestTemplate.asInstanceOf[js.Any], responseTemplate = responseTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pipelineConfig != null) __obj.updateDynamic("pipelineConfig")(pipelineConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverArgs]
  }
}


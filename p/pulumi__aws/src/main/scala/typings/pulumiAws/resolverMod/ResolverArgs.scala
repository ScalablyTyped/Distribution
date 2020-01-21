package typings.pulumiAws.resolverMod

import typings.pulumiAws.inputMod.appsync.ResolverPipelineConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverArgs extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: Input[String] = js.native
  /**
    * The DataSource name.
    */
  val dataSource: js.UndefOr[Input[String]] = js.native
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: Input[String] = js.native
  /**
    * The resolver type. Valid values are `UNIT` and `PIPELINE`.
    */
  val kind: js.UndefOr[Input[String]] = js.native
  /**
    * The PipelineConfig. A `pipelineConfig` block is documented below.
    */
  val pipelineConfig: js.UndefOr[Input[ResolverPipelineConfig]] = js.native
  /**
    * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
    */
  val requestTemplate: Input[String] = js.native
  /**
    * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
    */
  val responseTemplate: Input[String] = js.native
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: Input[String] = js.native
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
    pipelineConfig: Input[ResolverPipelineConfig] = null
  ): ResolverArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], requestTemplate = requestTemplate.asInstanceOf[js.Any], responseTemplate = responseTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pipelineConfig != null) __obj.updateDynamic("pipelineConfig")(pipelineConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverArgs]
  }
}


package typings.atPulumiAws.appsyncResolverMod

import typings.atPulumiAws.Anon_FunctionsArray
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverState extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The DataSource name.
    */
  val dataSource: js.UndefOr[Input[String]] = js.undefined
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: js.UndefOr[Input[String]] = js.undefined
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
  val requestTemplate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
    */
  val responseTemplate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: js.UndefOr[Input[String]] = js.undefined
}

object ResolverState {
  @scala.inline
  def apply(
    apiId: Input[String] = null,
    arn: Input[String] = null,
    dataSource: Input[String] = null,
    field: Input[String] = null,
    kind: Input[String] = null,
    pipelineConfig: Input[Anon_FunctionsArray] = null,
    requestTemplate: Input[String] = null,
    responseTemplate: Input[String] = null,
    `type`: Input[String] = null
  ): ResolverState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pipelineConfig != null) __obj.updateDynamic("pipelineConfig")(pipelineConfig.asInstanceOf[js.Any])
    if (requestTemplate != null) __obj.updateDynamic("requestTemplate")(requestTemplate.asInstanceOf[js.Any])
    if (responseTemplate != null) __obj.updateDynamic("responseTemplate")(responseTemplate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverState]
  }
}


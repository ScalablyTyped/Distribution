package typings.pulumiAws.resolverMod

import typings.pulumiAws.inputMod.appsync.ResolverCachingConfig
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
    * The CachingConfig.
    */
  val cachingConfig: js.UndefOr[Input[ResolverCachingConfig]] = js.native
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
    * The PipelineConfig.
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
    `type`: Input[String]
  ): ResolverArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], requestTemplate = requestTemplate.asInstanceOf[js.Any], responseTemplate = responseTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverArgs]
  }
  @scala.inline
  implicit class ResolverArgsOps[Self <: ResolverArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: Input[String]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestTemplate(value: Input[String]): Self = this.set("requestTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseTemplate(value: Input[String]): Self = this.set("responseTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCachingConfig(value: Input[ResolverCachingConfig]): Self = this.set("cachingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachingConfig: Self = this.set("cachingConfig", js.undefined)
    @scala.inline
    def setDataSource(value: Input[String]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setKind(value: Input[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPipelineConfig(value: Input[ResolverPipelineConfig]): Self = this.set("pipelineConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineConfig: Self = this.set("pipelineConfig", js.undefined)
  }
  
}


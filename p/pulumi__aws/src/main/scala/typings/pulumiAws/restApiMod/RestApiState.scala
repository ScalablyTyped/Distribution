package typings.pulumiAws.restApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigateway.RestApiEndpointConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestApiState extends js.Object {
  /**
    * The source of the API key for requests. Valid values are HEADER (default) and AUTHORIZER.
    */
  val apiKeySource: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  val binaryMediaTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * An OpenAPI specification that defines the set of routes and integrations to create as part of the REST API.
    */
  val body: js.UndefOr[Input[String]] = js.native
  /**
    * The creation date of the REST API
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the REST API
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument defining API endpoint configuration including endpoint type. Defined below.
    */
  val endpointConfiguration: js.UndefOr[Input[RestApiEndpointConfiguration]] = js.native
  /**
    * The execution ARN part to be used in `lambdaPermission`'s `sourceArn`
    * when allowing API Gateway to invoke a Lambda function,
    * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
    */
  val executionArn: js.UndefOr[Input[String]] = js.native
  /**
    * Minimum response size to compress for the REST API. Integer between -1 and 10485760 (10MB). Setting a value greater than -1 will enable compression, -1 disables compression (default).
    */
  val minimumCompressionSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the REST API
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * JSON formatted policy document that controls access to the API Gateway.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * The resource ID of the REST API's root
    */
  val rootResourceId: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object RestApiState {
  @scala.inline
  def apply(): RestApiState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApiState]
  }
  @scala.inline
  implicit class RestApiStateOps[Self <: RestApiState] (val x: Self) extends AnyVal {
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
    def setApiKeySource(value: Input[String]): Self = this.set("apiKeySource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKeySource: Self = this.set("apiKeySource", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setBinaryMediaTypesVarargs(value: Input[String]*): Self = this.set("binaryMediaTypes", js.Array(value :_*))
    @scala.inline
    def setBinaryMediaTypes(value: Input[js.Array[Input[String]]]): Self = this.set("binaryMediaTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryMediaTypes: Self = this.set("binaryMediaTypes", js.undefined)
    @scala.inline
    def setBody(value: Input[String]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEndpointConfiguration(value: Input[RestApiEndpointConfiguration]): Self = this.set("endpointConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointConfiguration: Self = this.set("endpointConfiguration", js.undefined)
    @scala.inline
    def setExecutionArn(value: Input[String]): Self = this.set("executionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionArn: Self = this.set("executionArn", js.undefined)
    @scala.inline
    def setMinimumCompressionSize(value: Input[Double]): Self = this.set("minimumCompressionSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumCompressionSize: Self = this.set("minimumCompressionSize", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setRootResourceId(value: Input[String]): Self = this.set("rootResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootResourceId: Self = this.set("rootResourceId", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


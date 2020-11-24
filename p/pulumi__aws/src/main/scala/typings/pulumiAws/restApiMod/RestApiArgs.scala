package typings.pulumiAws.restApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigateway.RestApiEndpointConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestApiArgs extends js.Object {
  
  /**
    * The source of the API key for requests. Valid values are HEADER (default) and AUTHORIZER.
    */
  val apiKeySource: js.UndefOr[Input[String]] = js.native
  
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  val binaryMediaTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * An OpenAPI specification that defines the set of routes and integrations to create as part of the REST API.
    */
  val body: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of the REST API
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Nested argument defining API endpoint configuration including endpoint type. Defined below.
    */
  val endpointConfiguration: js.UndefOr[Input[RestApiEndpointConfiguration]] = js.native
  
  /**
    * Minimum response size to compress for the REST API. Integer between -1 and 10485760 (10MB). Setting a value greater than -1 will enable compression, -1 disables compression (default).
    */
  val minimumCompressionSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The name of the REST API
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * JSON formatted policy document that controls access to the API Gateway. This provider will only perform drift detection of its value when present in a configuration. It is recommended to use the `aws.apigateway.RestApiPolicy` resource instead.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object RestApiArgs {
  
  @scala.inline
  def apply(): RestApiArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApiArgs]
  }
  
  @scala.inline
  implicit class RestApiArgsOps[Self <: RestApiArgs] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEndpointConfiguration(value: Input[RestApiEndpointConfiguration]): Self = this.set("endpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointConfiguration: Self = this.set("endpointConfiguration", js.undefined)
    
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
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

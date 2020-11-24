package typings.pulumiAws.getRestApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.apigateway.GetRestApiEndpointConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRestApiResult extends js.Object {
  
  /**
    * The source of the API key for requests.
    */
  val apiKeySource: String = js.native
  
  /**
    * The ARN of the REST API.
    */
  val arn: String = js.native
  
  /**
    * The list of binary media types supported by the REST API.
    */
  val binaryMediaTypes: js.Array[String] = js.native
  
  /**
    * The description of the REST API.
    */
  val description: String = js.native
  
  /**
    * The endpoint configuration of this RestApi showing the endpoint types of the API.
    */
  val endpointConfigurations: js.Array[GetRestApiEndpointConfiguration] = js.native
  
  /**
    * The execution ARN part to be used in `lambdaPermission`'s `sourceArn` when allowing API Gateway to invoke a Lambda function, e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
    */
  val executionArn: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Minimum response size to compress for the REST API.
    */
  val minimumCompressionSize: Double = js.native
  
  val name: String = js.native
  
  /**
    * JSON formatted policy document that controls access to the API Gateway.
    */
  val policy: String = js.native
  
  /**
    * Set to the ID of the API Gateway Resource on the found REST API where the route matches '/'.
    */
  val rootResourceId: String = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: StringDictionary[String] = js.native
}
object GetRestApiResult {
  
  @scala.inline
  def apply(
    apiKeySource: String,
    arn: String,
    binaryMediaTypes: js.Array[String],
    description: String,
    endpointConfigurations: js.Array[GetRestApiEndpointConfiguration],
    executionArn: String,
    id: String,
    minimumCompressionSize: Double,
    name: String,
    policy: String,
    rootResourceId: String,
    tags: StringDictionary[String]
  ): GetRestApiResult = {
    val __obj = js.Dynamic.literal(apiKeySource = apiKeySource.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], binaryMediaTypes = binaryMediaTypes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endpointConfigurations = endpointConfigurations.asInstanceOf[js.Any], executionArn = executionArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], minimumCompressionSize = minimumCompressionSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], rootResourceId = rootResourceId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestApiResult]
  }
  
  @scala.inline
  implicit class GetRestApiResultOps[Self <: GetRestApiResult] (val x: Self) extends AnyVal {
    
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
    def setApiKeySource(value: String): Self = this.set("apiKeySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryMediaTypesVarargs(value: String*): Self = this.set("binaryMediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setBinaryMediaTypes(value: js.Array[String]): Self = this.set("binaryMediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigurationsVarargs(value: GetRestApiEndpointConfiguration*): Self = this.set("endpointConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setEndpointConfigurations(value: js.Array[GetRestApiEndpointConfiguration]): Self = this.set("endpointConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionArn(value: String): Self = this.set("executionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCompressionSize(value: Double): Self = this.set("minimumCompressionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootResourceId(value: String): Self = this.set("rootResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}

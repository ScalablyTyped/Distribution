package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsFunction extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[Package] = js.undefined
  
  var awsKmsKeyArn: js.UndefOr[String] = js.undefined
  
  var condition: js.UndefOr[String] = js.undefined
  
  var dependsOn: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var destinations: js.UndefOr[Destinations] = js.undefined
  
  var environment: js.UndefOr[Environment] = js.undefined
  
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  
  var handler: String
  
  var layers: js.UndefOr[js.Array[String]] = js.undefined
  
  var memorySize: js.UndefOr[Double | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onError: js.UndefOr[String] = js.undefined
  
  var provisionedConcurrency: js.UndefOr[Double | String] = js.undefined
  
  var reservedConcurrency: js.UndefOr[Double | String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var runtime: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[Tags] = js.undefined
  
  var timeout: js.UndefOr[Double | String] = js.undefined
  
  var tracing: js.UndefOr[String] = js.undefined
  
  var vpc: js.UndefOr[Vpc] = js.undefined
}
object AwsFunction {
  
  @scala.inline
  def apply(handler: String): AwsFunction = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsFunction]
  }
  
  @scala.inline
  implicit class AwsFunctionMutableBuilder[Self <: AwsFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsKmsKeyArn(value: String): Self = StObject.set(x, "awsKmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsKmsKeyArnUndefined: Self = StObject.set(x, "awsKmsKeyArn", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setDependsOn(value: js.Array[String]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: String*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestinations(value: Destinations): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setMemorySize(value: Double | String): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySizeUndefined: Self = StObject.set(x, "memorySize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnError(value: String): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setProvisionedConcurrency(value: Double | String): Self = StObject.set(x, "provisionedConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedConcurrencyUndefined: Self = StObject.set(x, "provisionedConcurrency", js.undefined)
    
    @scala.inline
    def setReservedConcurrency(value: Double | String): Self = StObject.set(x, "reservedConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedConcurrencyUndefined: Self = StObject.set(x, "reservedConcurrency", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTracing(value: String): Self = StObject.set(x, "tracing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingUndefined: Self = StObject.set(x, "tracing", js.undefined)
    
    @scala.inline
    def setVpc(value: Vpc): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
    
    @scala.inline
    def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}

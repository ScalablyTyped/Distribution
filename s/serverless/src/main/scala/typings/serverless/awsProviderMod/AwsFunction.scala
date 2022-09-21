package typings.serverless.awsProviderMod

import typings.serverless.serverlessStrings.Active
import typings.serverless.serverlessStrings.PassThrough
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsFunction extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[Package] = js.undefined
  
  /** @deprecated in favor of `kmsKeyArn` */
  var awsKmsKeyArn: js.UndefOr[String] = js.undefined
  
  var condition: js.UndefOr[String] = js.undefined
  
  var dependsOn: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var destinations: js.UndefOr[Destinations] = js.undefined
  
  var disableLogs: js.UndefOr[Boolean] = js.undefined
  
  var environment: js.UndefOr[Environment] = js.undefined
  
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  
  var fileSystemConfig: js.UndefOr[FileSystemConfig] = js.undefined
  
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  
  var layers: js.UndefOr[js.Array[String | (Record[String, String])]] = js.undefined
  
  var memorySize: js.UndefOr[Double | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onError: js.UndefOr[String] = js.undefined
  
  var provisionedConcurrency: js.UndefOr[Double | String] = js.undefined
  
  var reservedConcurrency: js.UndefOr[Double | String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var runtime: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[Tags] = js.undefined
  
  var timeout: js.UndefOr[Double | String] = js.undefined
  
  var tracing: js.UndefOr[Active | PassThrough | Boolean] = js.undefined
  
  var url: js.UndefOr[Boolean | FunctionUrlConfig] = js.undefined
  
  var vpc: js.UndefOr[String | Vpc] = js.undefined
}
object AwsFunction {
  
  inline def apply(): AwsFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsFunction]
  }
  
  extension [Self <: AwsFunction](x: Self) {
    
    inline def setAwsKmsKeyArn(value: String): Self = StObject.set(x, "awsKmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setAwsKmsKeyArnUndefined: Self = StObject.set(x, "awsKmsKeyArn", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDependsOn(value: js.Array[String]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: String*): Self = StObject.set(x, "dependsOn", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinations(value: Destinations): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDisableLogs(value: Boolean): Self = StObject.set(x, "disableLogs", value.asInstanceOf[js.Any])
    
    inline def setDisableLogsUndefined: Self = StObject.set(x, "disableLogs", js.undefined)
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFileSystemConfig(value: FileSystemConfig): Self = StObject.set(x, "fileSystemConfig", value.asInstanceOf[js.Any])
    
    inline def setFileSystemConfigUndefined: Self = StObject.set(x, "fileSystemConfig", js.undefined)
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setLayers(value: js.Array[String | (Record[String, String])]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: (String | (Record[String, String]))*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setMemorySize(value: Double | String): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeUndefined: Self = StObject.set(x, "memorySize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnError(value: String): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setProvisionedConcurrency(value: Double | String): Self = StObject.set(x, "provisionedConcurrency", value.asInstanceOf[js.Any])
    
    inline def setProvisionedConcurrencyUndefined: Self = StObject.set(x, "provisionedConcurrency", js.undefined)
    
    inline def setReservedConcurrency(value: Double | String): Self = StObject.set(x, "reservedConcurrency", value.asInstanceOf[js.Any])
    
    inline def setReservedConcurrencyUndefined: Self = StObject.set(x, "reservedConcurrency", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeout(value: Double | String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTracing(value: Active | PassThrough | Boolean): Self = StObject.set(x, "tracing", value.asInstanceOf[js.Any])
    
    inline def setTracingUndefined: Self = StObject.set(x, "tracing", js.undefined)
    
    inline def setUrl(value: Boolean | FunctionUrlConfig): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVpc(value: String | Vpc): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
    
    inline def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}

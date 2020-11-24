package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsFunction extends js.Object {
  
  @JSName("package")
  var _package: js.UndefOr[Package] = js.native
  
  var awsKmsKeyArn: js.UndefOr[String] = js.native
  
  var condition: js.UndefOr[String] = js.native
  
  var dependsOn: js.UndefOr[js.Array[String]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var destinations: js.UndefOr[Destinations] = js.native
  
  var environment: js.UndefOr[Environment] = js.native
  
  var events: js.UndefOr[js.Array[Event]] = js.native
  
  var handler: String = js.native
  
  var layers: js.UndefOr[js.Array[String]] = js.native
  
  var memorySize: js.UndefOr[Double | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onError: js.UndefOr[String] = js.native
  
  var provisionedConcurrency: js.UndefOr[Double | String] = js.native
  
  var reservedConcurrency: js.UndefOr[Double | String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var runtime: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[Tags] = js.native
  
  var timeout: js.UndefOr[Double | String] = js.native
  
  var tracing: js.UndefOr[String] = js.native
  
  var vpc: js.UndefOr[Vpc] = js.native
}
object AwsFunction {
  
  @scala.inline
  def apply(handler: String): AwsFunction = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsFunction]
  }
  
  @scala.inline
  implicit class AwsFunctionOps[Self <: AwsFunction] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: String): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: Package): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def setAwsKmsKeyArn(value: String): Self = this.set("awsKmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsKmsKeyArn: Self = this.set("awsKmsKeyArn", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: String*): Self = this.set("dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setDependsOn(value: js.Array[String]): Self = this.set("dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependsOn: Self = this.set("dependsOn", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDestinations(value: Destinations): Self = this.set("destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setMemorySize(value: Double | String): Self = this.set("memorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemorySize: Self = this.set("memorySize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnError(value: String): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setProvisionedConcurrency(value: Double | String): Self = this.set("provisionedConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedConcurrency: Self = this.set("provisionedConcurrency", js.undefined)
    
    @scala.inline
    def setReservedConcurrency(value: Double | String): Self = this.set("reservedConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedConcurrency: Self = this.set("reservedConcurrency", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTracing(value: String): Self = this.set("tracing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracing: Self = this.set("tracing", js.undefined)
    
    @scala.inline
    def setVpc(value: Vpc): Self = this.set("vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpc: Self = this.set("vpc", js.undefined)
  }
}

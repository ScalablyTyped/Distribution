package typings.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.automationConfigMod.ConfigMap
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSummary extends StObject {
  
  var Deployment: js.UndefOr[RawJSON] = js.undefined
  
  var config: ConfigMap
  
  var endTime: Date
  
  var environment: StringDictionary[String]
  
  var kind: UpdateKind
  
  var message: String
  
  var resourceChanges: js.UndefOr[OpMap] = js.undefined
  
  var result: UpdateResult
  
  var startTime: Date
  
  var version: Double
}
object UpdateSummary {
  
  @scala.inline
  def apply(
    config: ConfigMap,
    endTime: Date,
    environment: StringDictionary[String],
    kind: UpdateKind,
    message: String,
    result: UpdateResult,
    startTime: Date,
    version: Double
  ): UpdateSummary = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSummary]
  }
  
  @scala.inline
  implicit class UpdateSummaryMutableBuilder[Self <: UpdateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ConfigMap): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployment(value: RawJSON): Self = StObject.set(x, "Deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentUndefined: Self = StObject.set(x, "Deployment", js.undefined)
    
    @scala.inline
    def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: UpdateKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceChanges(value: OpMap): Self = StObject.set(x, "resourceChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceChangesUndefined: Self = StObject.set(x, "resourceChanges", js.undefined)
    
    @scala.inline
    def setResult(value: UpdateResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

package typings.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.automationConfigMod.ConfigMap
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSummary extends js.Object {
  
  var Deployment: js.UndefOr[RawJSON] = js.native
  
  var config: ConfigMap = js.native
  
  var endTime: Date = js.native
  
  var environment: StringDictionary[String] = js.native
  
  var kind: UpdateKind = js.native
  
  var message: String = js.native
  
  var resourceChanges: js.UndefOr[OpMap] = js.native
  
  var result: UpdateResult = js.native
  
  var startTime: Date = js.native
  
  var version: Double = js.native
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
  implicit class UpdateSummaryOps[Self <: UpdateSummary] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: ConfigMap): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: StringDictionary[String]): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: UpdateKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: UpdateResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployment(value: RawJSON): Self = this.set("Deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployment: Self = this.set("Deployment", js.undefined)
    
    @scala.inline
    def setResourceChanges(value: OpMap): Self = this.set("resourceChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceChanges: Self = this.set("resourceChanges", js.undefined)
  }
}

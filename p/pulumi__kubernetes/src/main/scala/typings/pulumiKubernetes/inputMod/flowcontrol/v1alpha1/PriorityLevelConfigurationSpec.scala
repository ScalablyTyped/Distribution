package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
  */
@js.native
trait PriorityLevelConfigurationSpec extends StObject {
  
  /**
    * `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `"Limited"`.
    */
  var limited: js.UndefOr[Input[LimitedPriorityLevelConfiguration]] = js.native
  
  /**
    * `type` indicates whether this priority level is subject to limitation on request execution.  A value of `"Exempt"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `"Limited"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
    */
  var `type`: Input[String] = js.native
}
object PriorityLevelConfigurationSpec {
  
  @scala.inline
  def apply(`type`: Input[String]): PriorityLevelConfigurationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationSpec]
  }
  
  @scala.inline
  implicit class PriorityLevelConfigurationSpecMutableBuilder[Self <: PriorityLevelConfigurationSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimited(value: Input[LimitedPriorityLevelConfiguration]): Self = StObject.set(x, "limited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitedUndefined: Self = StObject.set(x, "limited", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

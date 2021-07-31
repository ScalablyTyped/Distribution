package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
  */
trait StatefulSetUpdateStrategy extends StObject {
  
  /**
    * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateStatefulSetStrategy]] = js.undefined
  
  /**
    * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object StatefulSetUpdateStrategy {
  
  @scala.inline
  def apply(): StatefulSetUpdateStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSetUpdateStrategy]
  }
  
  @scala.inline
  implicit class StatefulSetUpdateStrategyMutableBuilder[Self <: StatefulSetUpdateStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRollingUpdate(value: Input[RollingUpdateStatefulSetStrategy]): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollingUpdateUndefined: Self = StObject.set(x, "rollingUpdate", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

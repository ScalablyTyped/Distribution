package typings.pulumiKubernetes.outputMod.apps.v1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
  */
@js.native
trait StatefulSetUpdateStrategy extends StObject {
  
  /**
    * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
    */
  var rollingUpdate: RollingUpdateStatefulSetStrategy = js.native
  
  /**
    * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
    */
  var `type`: String = js.native
}
object StatefulSetUpdateStrategy {
  
  @scala.inline
  def apply(rollingUpdate: RollingUpdateStatefulSetStrategy, `type`: String): StatefulSetUpdateStrategy = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetUpdateStrategy]
  }
  
  @scala.inline
  implicit class StatefulSetUpdateStrategyMutableBuilder[Self <: StatefulSetUpdateStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRollingUpdate(value: RollingUpdateStatefulSetStrategy): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

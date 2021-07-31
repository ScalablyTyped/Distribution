package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSetting extends StObject {
  
  /**
    * Name of the setting to manage. Valid values: `containerInsights`.
    */
  var name: String
  
  /**
    * The value to assign to the setting. Value values are `enabled` and `disabled`.
    */
  var value: String
}
object ClusterSetting {
  
  @scala.inline
  def apply(name: String, value: String): ClusterSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSetting]
  }
  
  @scala.inline
  implicit class ClusterSettingMutableBuilder[Self <: ClusterSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

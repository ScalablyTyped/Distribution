package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTargetTarget extends StObject {
  
  var key: String
  
  var values: js.Array[String]
}
object MaintenanceWindowTargetTarget {
  
  @scala.inline
  def apply(key: String, values: js.Array[String]): MaintenanceWindowTargetTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTargetTarget]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTargetTargetMutableBuilder[Self <: MaintenanceWindowTargetTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

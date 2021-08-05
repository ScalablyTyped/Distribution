package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupEc2TagSetEc2TagFilter extends StObject {
  
  /**
    * The key of the tag filter.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the tag filter.
    */
  var value: js.UndefOr[String] = js.undefined
}
object DeploymentGroupEc2TagSetEc2TagFilter {
  
  inline def apply(): DeploymentGroupEc2TagSetEc2TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupEc2TagSetEc2TagFilter]
  }
  
  extension [Self <: DeploymentGroupEc2TagSetEc2TagFilter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

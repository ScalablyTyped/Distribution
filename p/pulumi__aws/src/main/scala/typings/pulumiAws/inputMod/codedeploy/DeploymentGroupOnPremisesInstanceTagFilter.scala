package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupOnPremisesInstanceTagFilter extends StObject {
  
  /**
    * The key of the tag filter.
    */
  var key: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The value of the tag filter.
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}
object DeploymentGroupOnPremisesInstanceTagFilter {
  
  inline def apply(): DeploymentGroupOnPremisesInstanceTagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupOnPremisesInstanceTagFilter]
  }
  
  extension [Self <: DeploymentGroupOnPremisesInstanceTagFilter](x: Self) {
    
    inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

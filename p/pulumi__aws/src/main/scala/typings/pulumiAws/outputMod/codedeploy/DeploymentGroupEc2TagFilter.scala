package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupEc2TagFilter extends StObject {
  
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
object DeploymentGroupEc2TagFilter {
  
  @scala.inline
  def apply(): DeploymentGroupEc2TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupEc2TagFilter]
  }
  
  @scala.inline
  implicit class DeploymentGroupEc2TagFilterMutableBuilder[Self <: DeploymentGroupEc2TagFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

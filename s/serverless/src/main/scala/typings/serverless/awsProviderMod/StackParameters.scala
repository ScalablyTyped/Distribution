package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackParameters extends StObject {
  
  var ParameterKey: String
  
  var ParameterValue: String
}
object StackParameters {
  
  @scala.inline
  def apply(ParameterKey: String, ParameterValue: String): StackParameters = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackParameters]
  }
  
  @scala.inline
  implicit class StackParametersMutableBuilder[Self <: StackParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterKey(value: String): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: String): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
  }
}

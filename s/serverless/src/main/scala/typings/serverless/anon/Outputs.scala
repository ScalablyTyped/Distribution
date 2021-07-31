package typings.serverless.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outputs extends StObject {
  
  var Outputs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var Resources: StringDictionary[js.Any]
}
object Outputs {
  
  @scala.inline
  def apply(Resources: StringDictionary[js.Any]): Outputs = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outputs]
  }
  
  @scala.inline
  implicit class OutputsMutableBuilder[Self <: Outputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputs(value: StringDictionary[js.Any]): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setResources(value: StringDictionary[js.Any]): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
  }
}

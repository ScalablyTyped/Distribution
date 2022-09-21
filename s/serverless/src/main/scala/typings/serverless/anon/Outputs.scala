package typings.serverless.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outputs extends StObject {
  
  var Outputs: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var Resources: StringDictionary[Any]
}
object Outputs {
  
  inline def apply(Resources: StringDictionary[Any]): Outputs = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outputs]
  }
  
  extension [Self <: Outputs](x: Self) {
    
    inline def setOutputs(value: StringDictionary[Any]): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setResources(value: StringDictionary[Any]): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
  }
}

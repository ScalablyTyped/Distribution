package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptDagNodeArg extends StObject {
  
  /**
    * The name of the argument or property.
    */
  var name: String
  
  /**
    * Boolean if the value is used as a parameter. Defaults to `false`.
    */
  var param: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the argument or property.
    */
  var value: String
}
object GetScriptDagNodeArg {
  
  inline def apply(name: String, value: String): GetScriptDagNodeArg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagNodeArg]
  }
  
  extension [Self <: GetScriptDagNodeArg](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParam(value: Boolean): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

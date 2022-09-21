package typings.redisClient.genericTransformersMod

import typings.redisClient.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionListItemReply extends StObject {
  
  var engine: String
  
  var functions: js.Array[Description]
  
  var libraryName: String
}
object FunctionListItemReply {
  
  inline def apply(engine: String, functions: js.Array[Description], libraryName: String): FunctionListItemReply = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], libraryName = libraryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionListItemReply]
  }
  
  extension [Self <: FunctionListItemReply](x: Self) {
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setFunctions(value: js.Array[Description]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsVarargs(value: Description*): Self = StObject.set(x, "functions", js.Array(value*))
    
    inline def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
  }
}

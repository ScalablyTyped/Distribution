package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternExisting extends StObject {
  
  var source: js.Array[String]
}
object PatternExisting {
  
  inline def apply(source: js.Array[String]): PatternExisting = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternExisting]
  }
  
  extension [Self <: PatternExisting](x: Self) {
    
    inline def setSource(value: js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
  }
}

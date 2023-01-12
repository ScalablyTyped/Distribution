package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes extends StObject {
  
  def configurable(key: String): String
  @JSName("configurable")
  var configurable_Original: Configurable
  
  var graph: Graph
}
object Classes {
  
  inline def apply(configurable: Configurable, graph: Graph): Classes = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
    
    inline def setConfigurable(value: Configurable): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setGraph(value: Graph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
  }
}

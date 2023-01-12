package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  var benchmarkIndex: Double
  
  var hostUserAgent: String
  
  var networkUserAgent: String
}
object Environment {
  
  inline def apply(benchmarkIndex: Double, hostUserAgent: String, networkUserAgent: String): Environment = {
    val __obj = js.Dynamic.literal(benchmarkIndex = benchmarkIndex.asInstanceOf[js.Any], hostUserAgent = hostUserAgent.asInstanceOf[js.Any], networkUserAgent = networkUserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    inline def setBenchmarkIndex(value: Double): Self = StObject.set(x, "benchmarkIndex", value.asInstanceOf[js.Any])
    
    inline def setHostUserAgent(value: String): Self = StObject.set(x, "hostUserAgent", value.asInstanceOf[js.Any])
    
    inline def setNetworkUserAgent(value: String): Self = StObject.set(x, "networkUserAgent", value.asInstanceOf[js.Any])
  }
}

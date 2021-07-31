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
  
  @scala.inline
  def apply(benchmarkIndex: Double, hostUserAgent: String, networkUserAgent: String): Environment = {
    val __obj = js.Dynamic.literal(benchmarkIndex = benchmarkIndex.asInstanceOf[js.Any], hostUserAgent = hostUserAgent.asInstanceOf[js.Any], networkUserAgent = networkUserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenchmarkIndex(value: Double): Self = StObject.set(x, "benchmarkIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUserAgent(value: String): Self = StObject.set(x, "hostUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUserAgent(value: String): Self = StObject.set(x, "networkUserAgent", value.asInstanceOf[js.Any])
  }
}

package typings.scBrokerCluster

import typings.scBrokerCluster.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Targets extends StObject {
    
    var targets: js.Array[Client]
    
    var `type`: String
  }
  object Targets {
    
    inline def apply(targets: js.Array[Client], `type`: String): Targets = {
      val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Targets]
    }
    
    extension [Self <: Targets](x: Self) {
      
      inline def setTargets(value: js.Array[Client]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsVarargs(value: Client*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

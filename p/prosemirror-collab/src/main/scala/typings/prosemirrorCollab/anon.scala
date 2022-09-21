package typings.prosemirrorCollab

import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTransform.mod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientID extends StObject {
    
    var clientID: js.UndefOr[Double | String | Null] = js.undefined
    
    var version: js.UndefOr[Double | Null] = js.undefined
  }
  object ClientID {
    
    inline def apply(): ClientID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientID]
    }
    
    extension [Self <: ClientID](x: Self) {
      
      inline def setClientID(value: Double | String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientIDNull: Self = StObject.set(x, "clientID", null)
      
      inline def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait MapSelectionBackward extends StObject {
    
    var mapSelectionBackward: js.UndefOr[Boolean] = js.undefined
  }
  object MapSelectionBackward {
    
    inline def apply(): MapSelectionBackward = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapSelectionBackward]
    }
    
    extension [Self <: MapSelectionBackward](x: Self) {
      
      inline def setMapSelectionBackward(value: Boolean): Self = StObject.set(x, "mapSelectionBackward", value.asInstanceOf[js.Any])
      
      inline def setMapSelectionBackwardUndefined: Self = StObject.set(x, "mapSelectionBackward", js.undefined)
    }
  }
  
  trait Origins extends StObject {
    
    var clientID: Double | String
    
    var origins: js.Array[Transaction]
    
    var steps: js.Array[Step]
    
    var version: Double
  }
  object Origins {
    
    inline def apply(clientID: Double | String, origins: js.Array[Transaction], steps: js.Array[Step], version: Double): Origins = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Origins]
    }
    
    extension [Self <: Origins](x: Self) {
      
      inline def setClientID(value: Double | String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setOrigins(value: js.Array[Transaction]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsVarargs(value: Transaction*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}

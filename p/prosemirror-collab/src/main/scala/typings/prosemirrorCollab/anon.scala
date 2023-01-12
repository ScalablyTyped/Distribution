package typings.prosemirrorCollab

import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTransform.mod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientID extends StObject {
    
    var clientID: Double | String
    
    var origins: js.Array[Transaction]
    
    var steps: js.Array[Step]
    
    var version: Double
  }
  object ClientID {
    
    inline def apply(clientID: Double | String, origins: js.Array[Transaction], steps: js.Array[Step], version: Double): ClientID = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientID] (val x: Self) extends AnyVal {
      
      inline def setClientID(value: Double | String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setOrigins(value: js.Array[Transaction]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsVarargs(value: Transaction*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapSelectionBackward extends StObject {
    
    /**
      When enabled (the default is `false`), if the current
      selection is a [text selection](https://prosemirror.net/docs/ref/#state.TextSelection), its
      sides are mapped with a negative bias for this transaction, so
      that content inserted at the cursor ends up after the cursor.
      Users usually prefer this, but it isn't done by default for
      reasons of backwards compatibility.
      */
    var mapSelectionBackward: js.UndefOr[Boolean] = js.undefined
  }
  object MapSelectionBackward {
    
    inline def apply(): MapSelectionBackward = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapSelectionBackward]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapSelectionBackward] (val x: Self) extends AnyVal {
      
      inline def setMapSelectionBackward(value: Boolean): Self = StObject.set(x, "mapSelectionBackward", value.asInstanceOf[js.Any])
      
      inline def setMapSelectionBackwardUndefined: Self = StObject.set(x, "mapSelectionBackward", js.undefined)
    }
  }
}

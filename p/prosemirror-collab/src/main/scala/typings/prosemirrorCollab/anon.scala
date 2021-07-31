package typings.prosemirrorCollab

import typings.prosemirrorModel.mod.Schema
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
    
    @scala.inline
    def apply(): ClientID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientID]
    }
    
    @scala.inline
    implicit class ClientIDMutableBuilder[Self <: ClientID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientID(value: Double | String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIDNull: Self = StObject.set(x, "clientID", null)
      
      @scala.inline
      def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionNull: Self = StObject.set(x, "version", null)
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait MapSelectionBackward extends StObject {
    
    var mapSelectionBackward: js.UndefOr[Boolean] = js.undefined
  }
  object MapSelectionBackward {
    
    @scala.inline
    def apply(): MapSelectionBackward = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapSelectionBackward]
    }
    
    @scala.inline
    implicit class MapSelectionBackwardMutableBuilder[Self <: MapSelectionBackward] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMapSelectionBackward(value: Boolean): Self = StObject.set(x, "mapSelectionBackward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapSelectionBackwardUndefined: Self = StObject.set(x, "mapSelectionBackward", js.undefined)
    }
  }
  
  trait Origins[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var clientID: Double | String
    
    var origins: js.Array[Transaction[S]]
    
    var steps: js.Array[Step[S]]
    
    var version: Double
  }
  object Origins {
    
    @scala.inline
    def apply[S /* <: Schema[js.Any, js.Any] */](
      clientID: Double | String,
      origins: js.Array[Transaction[S]],
      steps: js.Array[Step[S]],
      version: Double
    ): Origins[S] = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Origins[S]]
    }
    
    @scala.inline
    implicit class OriginsMutableBuilder[Self <: Origins[?], S /* <: Schema[js.Any, js.Any] */] (val x: Self & Origins[S]) extends AnyVal {
      
      @scala.inline
      def setClientID(value: Double | String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigins(value: js.Array[Transaction[S]]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginsVarargs(value: Transaction[S]*): Self = StObject.set(x, "origins", js.Array(value :_*))
      
      @scala.inline
      def setSteps(value: js.Array[Step[S]]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: Step[S]*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}

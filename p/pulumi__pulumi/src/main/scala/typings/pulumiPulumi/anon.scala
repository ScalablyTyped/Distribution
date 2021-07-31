package typings.pulumiPulumi

import typings.pulumiPulumi.outputMod.Inputs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
    
    var state: Record[String, js.Any]
  }
  object Id {
    
    @scala.inline
    def apply(id: String, state: Record[String, js.Any]): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: Record[String, js.Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Init extends StObject {
    
    def init(): js.Promise[Inputs]
  }
  object Init {
    
    @scala.inline
    def apply(init: () => js.Promise[Inputs]): Init = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
      __obj.asInstanceOf[Init]
    }
    
    @scala.inline
    implicit class InitMutableBuilder[Self <: Init] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: () => js.Promise[Inputs]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    }
  }
  
  trait Urn extends StObject {
    
    var urn: String
  }
  object Urn {
    
    @scala.inline
    def apply(urn: String): Urn = {
      val __obj = js.Dynamic.literal(urn = urn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Urn]
    }
    
    @scala.inline
    implicit class UrnMutableBuilder[Self <: Urn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
    }
  }
}

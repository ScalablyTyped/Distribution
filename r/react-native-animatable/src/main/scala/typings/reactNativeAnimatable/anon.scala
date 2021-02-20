package typings.reactNativeAnimatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Finished extends StObject {
    
    var finished: Boolean = js.native
  }
  object Finished {
    
    @scala.inline
    def apply(finished: Boolean): Finished = {
      val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
      __obj.asInstanceOf[Finished]
    }
    
    @scala.inline
    implicit class FinishedMutableBuilder[Self <: Finished] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var style: js.UndefOr[js.Any] = js.native
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

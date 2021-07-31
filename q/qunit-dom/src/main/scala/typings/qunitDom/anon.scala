package typings.qunitDom

import typings.qunitDom.qunitDomBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Any extends StObject {
    
    var any: `true`
  }
  object Any {
    
    @scala.inline
    def apply(): Any = {
      val __obj = js.Dynamic.literal(any = true)
      __obj.asInstanceOf[Any]
    }
    
    @scala.inline
    implicit class AnyMutableBuilder[Self <: Any] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAny(value: `true`): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inverted extends StObject {
    
    var inverted: js.UndefOr[Boolean] = js.undefined
  }
  object Inverted {
    
    @scala.inline
    def apply(): Inverted = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inverted]
    }
    
    @scala.inline
    implicit class InvertedMutableBuilder[Self <: Inverted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    }
  }
}

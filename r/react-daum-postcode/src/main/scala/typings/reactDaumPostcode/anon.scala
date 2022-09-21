package typings.reactDaumPostcode

import typings.reactDaumPostcode.loadPostcodeMod.PostcodeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HasError extends StObject {
    
    var hasError: Boolean
  }
  object HasError {
    
    inline def apply(hasError: Boolean): HasError = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasError]
    }
    
    extension [Self <: HasError](x: Self) {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
  
  trait Load extends StObject {
    
    var _validParam_ : Boolean
    
    def load(fn: js.Function0[Unit]): Unit
    
    var version: String
  }
  object Load {
    
    inline def apply(_validParam_ : Boolean, load: js.Function0[Unit] => Unit, version: String): Load = {
      val __obj = js.Dynamic.literal(_validParam_ = _validParam_.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Load]
    }
    
    extension [Self <: Load](x: Self) {
      
      inline def setLoad(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def set_validParam_(value: Boolean): Self = StObject.set(x, "_validParam_", value.asInstanceOf[js.Any])
    }
  }
  
  trait Postcode extends StObject {
    
    var Postcode: PostcodeConstructor
    
    var postcode: Load
  }
  object Postcode {
    
    inline def apply(Postcode: PostcodeConstructor, postcode: Load): Postcode = {
      val __obj = js.Dynamic.literal(Postcode = Postcode.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Postcode]
    }
    
    extension [Self <: Postcode](x: Self) {
      
      inline def setPostcode(value: PostcodeConstructor): Self = StObject.set(x, "Postcode", value.asInstanceOf[js.Any])
    }
  }
}

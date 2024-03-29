package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeRegistryMod extends Shortcut {
  
  @JSImport("rest/mime/registry", JSImport.Namespace)
  @js.native
  val ^ : Registry = js.native
  
  trait MIMEConverter extends StObject {
    
    def read(value: String): Any | Promise[Any]
    
    def write(value: Any): String | Promise[String]
  }
  object MIMEConverter {
    
    inline def apply(read: String => Any | Promise[Any], write: Any => String | Promise[String]): MIMEConverter = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[MIMEConverter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MIMEConverter] (val x: Self) extends AnyVal {
      
      inline def setRead(value: String => Any | Promise[Any]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setWrite(value: Any => String | Promise[String]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait Registry extends StObject {
    
    def lookup(mimeType: String): Promise[MIMEConverter]
    
    def register(mimeType: String, converter: MIMEConverter): Unit
  }
  object Registry {
    
    inline def apply(lookup: String => Promise[MIMEConverter], register: (String, MIMEConverter) => Unit): Registry = {
      val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[Registry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Registry] (val x: Self) extends AnyVal {
      
      inline def setLookup(value: String => Promise[MIMEConverter]): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setRegister(value: (String, MIMEConverter) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
  
  type _To = Registry
  
  /* This means you don't have to write `^`, but can instead just say `mimeRegistryMod.foo` */
  override def _to: Registry = ^
}

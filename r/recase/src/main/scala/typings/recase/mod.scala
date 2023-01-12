package typings.recase

import typings.recase.anon.Exceptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(opts: Exceptions): Recase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Recase]
  
  trait Recase extends StObject {
    
    def camelCopy(orig: Any): Any
    
    def snakeCopy(orig: Any): Any
  }
  object Recase {
    
    inline def apply(camelCopy: Any => Any, snakeCopy: Any => Any): Recase = {
      val __obj = js.Dynamic.literal(camelCopy = js.Any.fromFunction1(camelCopy), snakeCopy = js.Any.fromFunction1(snakeCopy))
      __obj.asInstanceOf[Recase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Recase] (val x: Self) extends AnyVal {
      
      inline def setCamelCopy(value: Any => Any): Self = StObject.set(x, "camelCopy", js.Any.fromFunction1(value))
      
      inline def setSnakeCopy(value: Any => Any): Self = StObject.set(x, "snakeCopy", js.Any.fromFunction1(value))
    }
  }
}

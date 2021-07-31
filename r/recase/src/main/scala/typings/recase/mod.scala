package typings.recase

import typings.recase.anon.Exceptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(opts: Exceptions): Recase = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Recase]
  
  trait Recase extends StObject {
    
    def camelCopy(orig: js.Any): js.Any
    
    def snakeCopy(orig: js.Any): js.Any
  }
  object Recase {
    
    @scala.inline
    def apply(camelCopy: js.Any => js.Any, snakeCopy: js.Any => js.Any): Recase = {
      val __obj = js.Dynamic.literal(camelCopy = js.Any.fromFunction1(camelCopy), snakeCopy = js.Any.fromFunction1(snakeCopy))
      __obj.asInstanceOf[Recase]
    }
    
    @scala.inline
    implicit class RecaseMutableBuilder[Self <: Recase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamelCopy(value: js.Any => js.Any): Self = StObject.set(x, "camelCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSnakeCopy(value: js.Any => js.Any): Self = StObject.set(x, "snakeCopy", js.Any.fromFunction1(value))
    }
  }
}

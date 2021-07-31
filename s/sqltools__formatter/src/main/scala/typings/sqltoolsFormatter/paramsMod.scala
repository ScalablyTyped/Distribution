package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.typesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paramsMod {
  
  @JSImport("@sqltools/formatter/lib/core/Params", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Params {
    def this(params: js.Object) = this()
    
    /* CompleteClass */
    override def get(hasKeyValue: Token): js.Any = js.native
    
    /* CompleteClass */
    var index: js.Any = js.native
    
    /* CompleteClass */
    var params: js.Object = js.native
  }
  
  trait Params extends StObject {
    
    def get(hasKeyValue: Token): js.Any
    
    var index: js.Any
    
    var params: js.Object
  }
  object Params {
    
    @scala.inline
    def apply(get: Token => js.Any, index: js.Any, params: js.Object): Params = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), index = index.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: Token => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: js.Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}

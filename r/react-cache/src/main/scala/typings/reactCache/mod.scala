package typings.reactCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def unstableCreateResource[Input, Value](fetch: js.Function1[/* input */ Input, js.Thenable[Value]]): Resource[Input, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createResource")(fetch.asInstanceOf[js.Any]).asInstanceOf[Resource[Input, Value]]
  @scala.inline
  def unstableCreateResource[Input, Value](
    fetch: js.Function1[/* input */ Input, js.Thenable[Value]],
    maybeHashInput: js.Function1[/* input */ Input, String | Double]
  ): Resource[Input, Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createResource")(fetch.asInstanceOf[js.Any], maybeHashInput.asInstanceOf[js.Any])).asInstanceOf[Resource[Input, Value]]
  
  trait Resource[Input, Value] extends StObject {
    
    def preload(key: Input): Unit
    
    def read(key: Input): Value
  }
  object Resource {
    
    @scala.inline
    def apply[Input, Value](preload: Input => Unit, read: Input => Value): Resource[Input, Value] = {
      val __obj = js.Dynamic.literal(preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[Resource[Input, Value]]
    }
    
    @scala.inline
    implicit class ResourceMutableBuilder[Self <: Resource[?, ?], Input, Value] (val x: Self & (Resource[Input, Value])) extends AnyVal {
      
      @scala.inline
      def setPreload(value: Input => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRead(value: Input => Value): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    }
  }
}

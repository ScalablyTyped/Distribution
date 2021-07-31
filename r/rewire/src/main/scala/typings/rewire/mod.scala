package typings.rewire

import org.scalablytyped.runtime.StringDictionary
import typings.rewire.mod.RewireInterfaces.RewiredModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a rewired version of the module found at filename. Use rewire() exactly like require().
    */
  @scala.inline
  def apply[T](filename: String): RewiredModule & T = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[RewiredModule & T]
  
  @JSImport("rewire", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object RewireInterfaces {
    
    @js.native
    trait RewiredModule extends StObject {
      
      /**
        * Returns the private variable with the given name.
        */
      def __get__[T](name: String): T = js.native
      
      /**
        * Sets the internal variable name to the given value. Returns a function which can be called to revert the change.
        */
      def __set__(name: String, value: js.Any): js.Function0[Unit] = js.native
      /**
        * Takes all enumerable keys of obj as variable names and sets the values respectively. Returns a function which can be called to revert the change.
        */
      def __set__(obj: StringDictionary[js.Any]): js.Function0[Unit] = js.native
      
      /**
        * Returns a function which - when being called - sets obj, executes the given callback and reverts obj. If callback returns a promise, obj is only reverted after
        * the promise has been resolved or rejected. For your convenience the returned function passes the received promise through.
        */
      def __with__(obj: StringDictionary[js.Any]): js.Function1[/* callback */ js.Function0[js.Any], js.Any] = js.native
    }
  }
}

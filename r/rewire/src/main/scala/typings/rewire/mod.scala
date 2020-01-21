package typings.rewire

import org.scalablytyped.runtime.StringDictionary
import typings.rewire.mod.RewireInterfaces.RewiredModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rewire", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Returns a rewired version of the module found at filename. Use rewire() exactly like require().
    */
  def apply[T](filename: String): RewiredModule with T = js.native
  @js.native
  object RewireInterfaces extends js.Object {
    @js.native
    trait RewiredModule extends js.Object {
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
      def __with__(obj: StringDictionary[js.Any]): js.Function1[/* callback */ js.Function0[_], _] = js.native
    }
    
  }
  
}


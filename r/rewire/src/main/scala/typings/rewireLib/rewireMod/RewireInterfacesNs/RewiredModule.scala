package typings
package rewireLib.rewireMod.RewireInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RewiredModule extends js.Object {
  /**
    * Returns the private variable with the given name.
    */
  def __get__[T](name: java.lang.String): T = js.native
  /**
    * Sets the internal variable name to the given value. Returns a function which can be called to revert the change.
    */
  def __set__(name: java.lang.String, value: js.Any): js.Function0[scala.Unit] = js.native
  /**
    * Takes all enumerable keys of obj as variable names and sets the values respectively. Returns a function which can be called to revert the change.
    */
  def __set__(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Function0[scala.Unit] = js.native
  /**
    * Returns a function which - when being called - sets obj, executes the given callback and reverts obj. If callback returns a promise, obj is only reverted after
    * the promise has been resolved or rejected. For your convenience the returned function passes the received promise through.
    */
  def __with__(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Function1[/* callback */ js.Function0[_], _] = js.native
}


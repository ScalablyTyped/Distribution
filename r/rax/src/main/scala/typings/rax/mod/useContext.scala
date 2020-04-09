package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "useContext")
@js.native
object useContext extends js.Object {
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `Rax.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    */
  def apply[T](context: Context[T]): T = js.native
}


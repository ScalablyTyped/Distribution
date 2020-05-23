package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.FunctionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Function")
@js.native
class Function protected ()
  extends js.Function {
  /**
    * Creates a new function.
    * @param args A list of arguments the function accepts.
    */
  def this(args: java.lang.String*) = this()
}

@JSGlobal("Function")
@js.native
object Function extends TopLevel[FunctionConstructor]


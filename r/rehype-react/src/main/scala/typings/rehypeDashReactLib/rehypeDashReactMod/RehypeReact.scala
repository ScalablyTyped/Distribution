package typings
package rehypeDashReactLib.rehypeDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RehypeReact extends js.Object {
  def Compiler(node: js.Any): js.Any
}

object RehypeReact {
  @scala.inline
  def apply(Compiler: js.Any => js.Any): RehypeReact = {
    val __obj = js.Dynamic.literal(Compiler = js.Any.fromFunction1(Compiler))
  
    __obj.asInstanceOf[RehypeReact]
  }
}


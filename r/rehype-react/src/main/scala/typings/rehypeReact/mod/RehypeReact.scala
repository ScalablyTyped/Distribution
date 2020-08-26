package typings.rehypeReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RehypeReact extends js.Object {
  def Compiler(node: js.Any): js.Any = js.native
}

object RehypeReact {
  @scala.inline
  def apply(Compiler: js.Any => js.Any): RehypeReact = {
    val __obj = js.Dynamic.literal(Compiler = js.Any.fromFunction1(Compiler))
    __obj.asInstanceOf[RehypeReact]
  }
  @scala.inline
  implicit class RehypeReactOps[Self <: RehypeReact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompiler(value: js.Any => js.Any): Self = this.set("Compiler", js.Any.fromFunction1(value))
  }
  
}


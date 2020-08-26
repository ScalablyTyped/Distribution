package typings.pulumiQuery.interfacesMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolConstructor extends js.Object {
  val asyncIterator: js.Symbol = js.native
}

object SymbolConstructor {
  @scala.inline
  def apply(asyncIterator: js.Symbol): SymbolConstructor = {
    val __obj = js.Dynamic.literal(asyncIterator = asyncIterator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolConstructor]
  }
  @scala.inline
  implicit class SymbolConstructorOps[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
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
    def setAsyncIterator(value: js.Symbol): Self = this.set("asyncIterator", value.asInstanceOf[js.Any])
  }
  
}


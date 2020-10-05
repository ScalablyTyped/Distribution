package typings.std

import typings.std.stdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IteratorYieldResult[TYield]
  extends IteratorResult[TYield, js.Any] {
  var done: js.UndefOr[`false`] = js.native
  var value: TYield = js.native
}

object IteratorYieldResult {
  @scala.inline
  def apply[TYield](value: TYield): IteratorYieldResult[TYield] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorYieldResult[TYield]]
  }
  @scala.inline
  implicit class IteratorYieldResultOps[Self <: IteratorYieldResult[_], TYield] (val x: Self with IteratorYieldResult[TYield]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: TYield): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDone(value: `false`): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
  }
  
}


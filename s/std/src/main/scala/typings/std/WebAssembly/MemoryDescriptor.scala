package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryDescriptor extends js.Object {
  var initial: Double = js.native
  var maximum: js.UndefOr[Double] = js.native
}

object MemoryDescriptor {
  @scala.inline
  def apply(initial: Double): MemoryDescriptor = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryDescriptor]
  }
  @scala.inline
  implicit class MemoryDescriptorOps[Self <: MemoryDescriptor] (val x: Self) extends AnyVal {
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
    def setInitial(value: Double): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
  }
  
}


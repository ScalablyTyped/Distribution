package typings.std.WebAssembly

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Memory extends _ExportValue {
  val buffer: ArrayBuffer = js.native
  def grow(delta: Double): Double = js.native
}

object Memory {
  @scala.inline
  def apply(buffer: ArrayBuffer, grow: Double => Double): Memory = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
    __obj.asInstanceOf[Memory]
  }
  @scala.inline
  implicit class MemoryOps[Self <: Memory] (val x: Self) extends AnyVal {
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
    def setBuffer(value: ArrayBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrow(value: Double => Double): Self = this.set("grow", js.Any.fromFunction1(value))
  }
  
}


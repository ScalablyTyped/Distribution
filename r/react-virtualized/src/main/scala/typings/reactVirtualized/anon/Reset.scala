package typings.reactVirtualized.anon

import typings.reactVirtualized.esMasonryMod.resetParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reset extends js.Object {
  
  def reset(params: resetParams): Unit = js.native
}
object Reset {
  
  @scala.inline
  def apply(reset: resetParams => Unit): Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset))
    __obj.asInstanceOf[Reset]
  }
  
  @scala.inline
  implicit class ResetOps[Self <: Reset] (val x: Self) extends AnyVal {
    
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
    def setReset(value: resetParams => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
  }
}

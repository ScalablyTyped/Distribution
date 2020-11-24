package typings.sentiment.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apply extends js.Object {
  
  @JSName("apply")
  def apply(tokens: js.Array[String], cursor: Double, tokenScore: Double): Double = js.native
}
object Apply {
  
  @scala.inline
  def apply(apply: (js.Array[String], Double, Double) => Double): Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply))
    __obj.asInstanceOf[Apply]
  }
  
  @scala.inline
  implicit class ApplyOps[Self <: Apply] (val x: Self) extends AnyVal {
    
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
    def setApply(value: (js.Array[String], Double, Double) => Double): Self = this.set("apply", js.Any.fromFunction3(value))
  }
}

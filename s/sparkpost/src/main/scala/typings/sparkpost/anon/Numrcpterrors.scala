package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Numrcpterrors extends js.Object {
  
  var num_rcpt_errors: js.UndefOr[Double] = js.native
}
object Numrcpterrors {
  
  @scala.inline
  def apply(): Numrcpterrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Numrcpterrors]
  }
  
  @scala.inline
  implicit class NumrcpterrorsOps[Self <: Numrcpterrors] (val x: Self) extends AnyVal {
    
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
    def setNum_rcpt_errors(value: Double): Self = this.set("num_rcpt_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum_rcpt_errors: Self = this.set("num_rcpt_errors", js.undefined)
  }
}

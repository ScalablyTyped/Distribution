package typings.stackUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackLineData extends StackData {
  
  var evalColumn: js.UndefOr[Double] = js.native
  
  var evalFile: js.UndefOr[String] = js.native
  
  var evalLine: js.UndefOr[Double] = js.native
}
object StackLineData {
  
  @scala.inline
  def apply(): StackLineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackLineData]
  }
  
  @scala.inline
  implicit class StackLineDataOps[Self <: StackLineData] (val x: Self) extends AnyVal {
    
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
    def setEvalColumn(value: Double): Self = this.set("evalColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvalColumn: Self = this.set("evalColumn", js.undefined)
    
    @scala.inline
    def setEvalFile(value: String): Self = this.set("evalFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvalFile: Self = this.set("evalFile", js.undefined)
    
    @scala.inline
    def setEvalLine(value: Double): Self = this.set("evalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvalLine: Self = this.set("evalLine", js.undefined)
  }
}

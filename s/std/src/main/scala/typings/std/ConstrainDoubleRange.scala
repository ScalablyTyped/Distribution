package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainDoubleRange extends DoubleRange {
  
  var exact: js.UndefOr[Double] = js.native
  
  var ideal: js.UndefOr[Double] = js.native
}
object ConstrainDoubleRange {
  
  @scala.inline
  def apply(): ConstrainDoubleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainDoubleRange]
  }
  
  @scala.inline
  implicit class ConstrainDoubleRangeOps[Self <: ConstrainDoubleRange] (val x: Self) extends AnyVal {
    
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
    def setExact(value: Double): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setIdeal(value: Double): Self = this.set("ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdeal: Self = this.set("ideal", js.undefined)
  }
}

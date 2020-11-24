package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dim extends js.Object {
  
  var dim: js.UndefOr[Double] = js.native
  
  var maxHistory: js.UndefOr[Double] = js.native
}
object Dim {
  
  @scala.inline
  def apply(): Dim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dim]
  }
  
  @scala.inline
  implicit class DimOps[Self <: Dim] (val x: Self) extends AnyVal {
    
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
    def setDim(value: Double): Self = this.set("dim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDim: Self = this.set("dim", js.undefined)
    
    @scala.inline
    def setMaxHistory(value: Double): Self = this.set("maxHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHistory: Self = this.set("maxHistory", js.undefined)
  }
}

package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieData extends js.Object {
  
  var dataSets: js.UndefOr[js.Array[PieDataset]] = js.native
}
object PieData {
  
  @scala.inline
  def apply(): PieData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieData]
  }
  
  @scala.inline
  implicit class PieDataOps[Self <: PieData] (val x: Self) extends AnyVal {
    
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
    def setDataSetsVarargs(value: PieDataset*): Self = this.set("dataSets", js.Array(value :_*))
    
    @scala.inline
    def setDataSets(value: js.Array[PieDataset]): Self = this.set("dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSets: Self = this.set("dataSets", js.undefined)
  }
}

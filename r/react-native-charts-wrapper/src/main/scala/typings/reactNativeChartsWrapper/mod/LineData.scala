package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineData extends js.Object {
  
  var dataSets: js.UndefOr[js.Array[LineDataset]] = js.native
}
object LineData {
  
  @scala.inline
  def apply(): LineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineData]
  }
  
  @scala.inline
  implicit class LineDataOps[Self <: LineData] (val x: Self) extends AnyVal {
    
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
    def setDataSetsVarargs(value: LineDataset*): Self = this.set("dataSets", js.Array(value :_*))
    
    @scala.inline
    def setDataSets(value: js.Array[LineDataset]): Self = this.set("dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSets: Self = this.set("dataSets", js.undefined)
  }
}

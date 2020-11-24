package typings.reactSvgRadarChart.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartProps extends js.Object {
  
  var captions: StringDictionary[String] = js.native
  
  var data: js.Array[ChartData] = js.native
  
  var options: js.UndefOr[ChartOptionsProps] = js.native
  
  var size: Double = js.native
}
object ChartProps {
  
  @scala.inline
  def apply(captions: StringDictionary[String], data: js.Array[ChartData], size: Double): ChartProps = {
    val __obj = js.Dynamic.literal(captions = captions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
  
  @scala.inline
  implicit class ChartPropsOps[Self <: ChartProps] (val x: Self) extends AnyVal {
    
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
    def setCaptions(value: StringDictionary[String]): Self = this.set("captions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: ChartData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ChartData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ChartOptionsProps): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}

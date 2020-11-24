package typings.recharts.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipPayload extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var dataKey: js.UndefOr[DataKey] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var formatter: js.UndefOr[TooltipFormatter] = js.native
  
  var name: String = js.native
  
  var payload: js.UndefOr[js.Any] = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var value: String | Double | (js.Array[String | Double]) = js.native
}
object TooltipPayload {
  
  @scala.inline
  def apply(name: String, value: String | Double | (js.Array[String | Double])): TooltipPayload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipPayload]
  }
  
  @scala.inline
  implicit class TooltipPayloadOps[Self <: TooltipPayload] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | Double | (js.Array[String | Double])): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = this.set("dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKey(value: DataKey): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataKey: Self = this.set("dataKey", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => ReactNode
    ): Self = this.set("formatter", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}

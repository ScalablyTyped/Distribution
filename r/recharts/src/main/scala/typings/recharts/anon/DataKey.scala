package typings.recharts.anon

import typings.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataKey extends js.Object {
  
  var dataKey: String | Double | RechartsFunction = js.native
  
  var valueAccessor: js.UndefOr[scala.Nothing] = js.native
}
object DataKey {
  
  @scala.inline
  def apply(dataKey: String | Double | RechartsFunction): DataKey = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataKey]
  }
  
  @scala.inline
  implicit class DataKeyOps[Self <: DataKey] (val x: Self) extends AnyVal {
    
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
    def setDataKeyFunction1(value: /* repeated */ js.Any => Unit): Self = this.set("dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKey(value: String | Double | RechartsFunction): Self = this.set("dataKey", value.asInstanceOf[js.Any])
  }
}

package typings.storybookReactNative.storyListViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var data: js.Array[_] = js.native
  
  var originalData: js.Array[_] = js.native
}
object State {
  
  @scala.inline
  def apply(data: js.Array[_], originalData: js.Array[_]): State = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalData = originalData.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDataVarargs(value: js.Any*): Self = this.set("originalData", js.Array(value :_*))
    
    @scala.inline
    def setOriginalData(value: js.Array[_]): Self = this.set("originalData", value.asInstanceOf[js.Any])
  }
}

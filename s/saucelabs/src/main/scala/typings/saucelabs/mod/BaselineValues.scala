package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaselineValues
  extends /* key */ StringDictionary[js.Any] {
  
  var datetime: js.UndefOr[String] = js.native
  
  var job_id: js.UndefOr[String] = js.native
  
  var real_value: js.UndefOr[Double] = js.native
}
object BaselineValues {
  
  @scala.inline
  def apply(): BaselineValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineValues]
  }
  
  @scala.inline
  implicit class BaselineValuesOps[Self <: BaselineValues] (val x: Self) extends AnyVal {
    
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
    def setDatetime(value: String): Self = this.set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_id: Self = this.set("job_id", js.undefined)
    
    @scala.inline
    def setReal_value(value: Double): Self = this.set("real_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReal_value: Self = this.set("real_value", js.undefined)
  }
}

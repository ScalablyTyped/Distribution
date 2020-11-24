package typings.smartystreetsJavascriptSdk.mod.usZipcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait County extends js.Object {
  
  var countyFips: js.Any = js.native
  
  var countyName: String = js.native
  
  var state: String = js.native
  
  var stateAbbreviation: String = js.native
}
object County {
  
  @scala.inline
  def apply(countyFips: js.Any, countyName: String, state: String, stateAbbreviation: String): County = {
    val __obj = js.Dynamic.literal(countyFips = countyFips.asInstanceOf[js.Any], countyName = countyName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateAbbreviation = stateAbbreviation.asInstanceOf[js.Any])
    __obj.asInstanceOf[County]
  }
  
  @scala.inline
  implicit class CountyOps[Self <: County] (val x: Self) extends AnyVal {
    
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
    def setCountyFips(value: js.Any): Self = this.set("countyFips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountyName(value: String): Self = this.set("countyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateAbbreviation(value: String): Self = this.set("stateAbbreviation", value.asInstanceOf[js.Any])
  }
}

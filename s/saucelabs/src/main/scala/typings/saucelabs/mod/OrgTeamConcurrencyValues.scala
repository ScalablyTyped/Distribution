package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgTeamConcurrencyValues
  extends /* key */ StringDictionary[js.Any] {
  
  var allowed: js.UndefOr[ConcurrencyValues] = js.native
  
  var current: js.UndefOr[ConcurrencyValues] = js.native
}
object OrgTeamConcurrencyValues {
  
  @scala.inline
  def apply(): OrgTeamConcurrencyValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgTeamConcurrencyValues]
  }
  
  @scala.inline
  implicit class OrgTeamConcurrencyValuesOps[Self <: OrgTeamConcurrencyValues] (val x: Self) extends AnyVal {
    
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
    def setAllowed(value: ConcurrencyValues): Self = this.set("allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed: Self = this.set("allowed", js.undefined)
    
    @scala.inline
    def setCurrent(value: ConcurrencyValues): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
  }
}

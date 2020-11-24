package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenRealmBehaviorConfiguration extends js.Object {
  
  val timeOut: js.UndefOr[Double] = js.native
  
  val timeOutBehavior: js.UndefOr[OpenRealmTimeOutBehavior] = js.native
  
  val `type`: OpenRealmBehaviorType = js.native
}
object OpenRealmBehaviorConfiguration {
  
  @scala.inline
  def apply(`type`: OpenRealmBehaviorType): OpenRealmBehaviorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenRealmBehaviorConfiguration]
  }
  
  @scala.inline
  implicit class OpenRealmBehaviorConfigurationOps[Self <: OpenRealmBehaviorConfiguration] (val x: Self) extends AnyVal {
    
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
    def setType(value: OpenRealmBehaviorType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOut(value: Double): Self = this.set("timeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOut: Self = this.set("timeOut", js.undefined)
    
    @scala.inline
    def setTimeOutBehavior(value: OpenRealmTimeOutBehavior): Self = this.set("timeOutBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOutBehavior: Self = this.set("timeOutBehavior", js.undefined)
  }
}

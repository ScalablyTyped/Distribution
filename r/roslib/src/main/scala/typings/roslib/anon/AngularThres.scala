package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngularThres extends js.Object {
  
  var angularThres: js.UndefOr[Double] = js.native
  
  var fixedFrame: js.UndefOr[java.lang.String] = js.native
  
  var rate: js.UndefOr[Double] = js.native
  
  var repubServiceName: js.UndefOr[java.lang.String] = js.native
  
  var ros: typings.roslib.mod.Ros = js.native
  
  var serverName: js.UndefOr[java.lang.String] = js.native
  
  var topicTimeout: js.UndefOr[Double] = js.native
  
  var transThres: js.UndefOr[Double] = js.native
  
  var updateDelay: js.UndefOr[Double] = js.native
}
object AngularThres {
  
  @scala.inline
  def apply(ros: typings.roslib.mod.Ros): AngularThres = {
    val __obj = js.Dynamic.literal(ros = ros.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularThres]
  }
  
  @scala.inline
  implicit class AngularThresOps[Self <: AngularThres] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRos(value: typings.roslib.mod.Ros): Self = this.set("ros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularThres(value: Double): Self = this.set("angularThres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularThres: Self = this.set("angularThres", js.undefined)
    
    @scala.inline
    def setFixedFrame(value: java.lang.String): Self = this.set("fixedFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedFrame: Self = this.set("fixedFrame", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setRepubServiceName(value: java.lang.String): Self = this.set("repubServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepubServiceName: Self = this.set("repubServiceName", js.undefined)
    
    @scala.inline
    def setServerName(value: java.lang.String): Self = this.set("serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("serverName", js.undefined)
    
    @scala.inline
    def setTopicTimeout(value: Double): Self = this.set("topicTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicTimeout: Self = this.set("topicTimeout", js.undefined)
    
    @scala.inline
    def setTransThres(value: Double): Self = this.set("transThres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransThres: Self = this.set("transThres", js.undefined)
    
    @scala.inline
    def setUpdateDelay(value: Double): Self = this.set("updateDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDelay: Self = this.set("updateDelay", js.undefined)
  }
}

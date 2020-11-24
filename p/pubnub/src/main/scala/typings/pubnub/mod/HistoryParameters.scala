package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryParameters extends js.Object {
  
  var channel: String = js.native
  
  var count: Double = js.native
  
   // timetoken
  var end: js.UndefOr[String | Double] = js.native
  
   // timetoken
  var includeMeta: js.UndefOr[Boolean] = js.native
  
  var includeTimetoken: js.UndefOr[Boolean] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var start: js.UndefOr[String | Double] = js.native
  
  var stringifiedTimeToken: js.UndefOr[Boolean] = js.native
}
object HistoryParameters {
  
  @scala.inline
  def apply(channel: String, count: Double): HistoryParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryParameters]
  }
  
  @scala.inline
  implicit class HistoryParametersOps[Self <: HistoryParameters] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: String | Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setIncludeMeta(value: Boolean): Self = this.set("includeMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeMeta: Self = this.set("includeMeta", js.undefined)
    
    @scala.inline
    def setIncludeTimetoken(value: Boolean): Self = this.set("includeTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTimetoken: Self = this.set("includeTimetoken", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setStart(value: String | Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStringifiedTimeToken(value: Boolean): Self = this.set("stringifiedTimeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringifiedTimeToken: Self = this.set("stringifiedTimeToken", js.undefined)
  }
}

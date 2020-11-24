package typings.segmentAnalytics.SegmentAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Generic options object with integrations
@js.native
trait SegmentOpts extends js.Object {
  
  var anonymousId: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[js.Object] = js.native
  
  var integrations: js.UndefOr[js.Any] = js.native
}
object SegmentOpts {
  
  @scala.inline
  def apply(): SegmentOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentOpts]
  }
  
  @scala.inline
  implicit class SegmentOptsOps[Self <: SegmentOpts] (val x: Self) extends AnyVal {
    
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
    def setAnonymousId(value: String): Self = this.set("anonymousId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymousId: Self = this.set("anonymousId", js.undefined)
    
    @scala.inline
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setIntegrations(value: js.Any): Self = this.set("integrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrations: Self = this.set("integrations", js.undefined)
  }
}

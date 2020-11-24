package typings.sentryUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalEventProcessors extends js.Object {
  
  var globalEventProcessors: js.Any = js.native
  
  var hub: js.Any = js.native
  
  var logger: js.Any = js.native
}
object GlobalEventProcessors {
  
  @scala.inline
  def apply(globalEventProcessors: js.Any, hub: js.Any, logger: js.Any): GlobalEventProcessors = {
    val __obj = js.Dynamic.literal(globalEventProcessors = globalEventProcessors.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalEventProcessors]
  }
  
  @scala.inline
  implicit class GlobalEventProcessorsOps[Self <: GlobalEventProcessors] (val x: Self) extends AnyVal {
    
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
    def setGlobalEventProcessors(value: js.Any): Self = this.set("globalEventProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHub(value: js.Any): Self = this.set("hub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
  }
}

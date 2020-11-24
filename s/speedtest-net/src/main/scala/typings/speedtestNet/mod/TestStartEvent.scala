package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.testStart
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This contains information about the test to be run. */
@js.native
trait TestStartEvent
  extends BaseEvent
     with SpeedTestEvent {
  
  var interface: InterfaceData = js.native
  
  var isp: String = js.native
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double = js.native
  
  var server: ServerData = js.native
  
  var timestamp: Date = js.native
  
  @JSName("type")
  var type_TestStartEvent: testStart = js.native
}
object TestStartEvent {
  
  @scala.inline
  def apply(
    interface: InterfaceData,
    isp: String,
    progress: Double,
    server: ServerData,
    timestamp: Date,
    `type`: testStart
  ): TestStartEvent = {
    val __obj = js.Dynamic.literal(interface = interface.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestStartEvent]
  }
  
  @scala.inline
  implicit class TestStartEventOps[Self <: TestStartEvent] (val x: Self) extends AnyVal {
    
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
    def setInterface(value: InterfaceData): Self = this.set("interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsp(value: String): Self = this.set("isp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: ServerData): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: testStart): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

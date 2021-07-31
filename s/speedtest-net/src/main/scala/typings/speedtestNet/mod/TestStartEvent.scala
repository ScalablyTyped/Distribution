package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.testStart
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This contains information about the test to be run. */
trait TestStartEvent
  extends StObject
     with BaseEvent
     with SpeedTestEvent {
  
  var interface: InterfaceData
  
  var isp: String
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double
  
  var server: ServerData
  
  var timestamp: Date
  
  @JSName("type")
  var type_TestStartEvent: testStart
}
object TestStartEvent {
  
  @scala.inline
  def apply(interface: InterfaceData, isp: String, progress: Double, server: ServerData, timestamp: Date): TestStartEvent = {
    val __obj = js.Dynamic.literal(interface = interface.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("testStart")
    __obj.asInstanceOf[TestStartEvent]
  }
  
  @scala.inline
  implicit class TestStartEventMutableBuilder[Self <: TestStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterface(value: InterfaceData): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsp(value: String): Self = StObject.set(x, "isp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: ServerData): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: testStart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

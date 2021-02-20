package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is only sent when the `verbosity` is 2 or greater. It contains
  * a bunch of information about the test.
  */
@js.native
trait ConfigEvent
  extends BaseEvent
     with SpeedTestEvent {
  
  var app: AppData = js.native
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double = js.native
  
  var servers: js.Array[ServerData] = js.native
  
  var suite: SuiteData = js.native
  
  @JSName("type")
  var type_ConfigEvent: config = js.native
}
object ConfigEvent {
  
  @scala.inline
  def apply(app: AppData, progress: Double, servers: js.Array[ServerData], suite: SuiteData, `type`: config): ConfigEvent = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], servers = servers.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigEvent]
  }
  
  @scala.inline
  implicit class ConfigEventMutableBuilder[Self <: ConfigEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: AppData): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServers(value: js.Array[ServerData]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServersVarargs(value: ServerData*): Self = StObject.set(x, "servers", js.Array(value :_*))
    
    @scala.inline
    def setSuite(value: SuiteData): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: config): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

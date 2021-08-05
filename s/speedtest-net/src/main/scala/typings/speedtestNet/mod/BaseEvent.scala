package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.config
import typings.speedtestNet.speedtestNetStrings.download
import typings.speedtestNet.speedtestNetStrings.log
import typings.speedtestNet.speedtestNetStrings.ping
import typings.speedtestNet.speedtestNetStrings.result
import typings.speedtestNet.speedtestNetStrings.testStart
import typings.speedtestNet.speedtestNetStrings.upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseEvent extends StObject {
  
  var `type`: config | log | testStart | ping | download | upload | result
}
object BaseEvent {
  
  inline def apply(`type`: config | log | testStart | ping | download | upload | result): BaseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent]
  }
  
  extension [Self <: BaseEvent](x: Self) {
    
    inline def setType(value: config | log | testStart | ping | download | upload | result): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

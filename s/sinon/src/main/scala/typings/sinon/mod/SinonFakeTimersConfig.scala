package typings.sinon.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonFakeTimersConfig extends StObject {
  
  var now: Double | Date
  
  var shouldAdvanceTime: Boolean
  
  var toFake: js.Array[String]
}
object SinonFakeTimersConfig {
  
  @scala.inline
  def apply(now: Double | Date, shouldAdvanceTime: Boolean, toFake: js.Array[String]): SinonFakeTimersConfig = {
    val __obj = js.Dynamic.literal(now = now.asInstanceOf[js.Any], shouldAdvanceTime = shouldAdvanceTime.asInstanceOf[js.Any], toFake = toFake.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonFakeTimersConfig]
  }
  
  @scala.inline
  implicit class SinonFakeTimersConfigMutableBuilder[Self <: SinonFakeTimersConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNow(value: Double | Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldAdvanceTime(value: Boolean): Self = StObject.set(x, "shouldAdvanceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFake(value: js.Array[String]): Self = StObject.set(x, "toFake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFakeVarargs(value: String*): Self = StObject.set(x, "toFake", js.Array(value :_*))
  }
}

package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends StObject {
  
  var logLevel: js.UndefOr[String] = js.native
  
  var rtmPort: js.UndefOr[Double] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setRtmPort(value: Double): Self = StObject.set(x, "rtmPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtmPortUndefined: Self = StObject.set(x, "rtmPort", js.undefined)
  }
}

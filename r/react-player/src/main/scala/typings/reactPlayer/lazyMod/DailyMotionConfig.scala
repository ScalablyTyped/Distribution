package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DailyMotionConfig extends StObject {
  
  var params: js.UndefOr[js.Object] = js.native
}
object DailyMotionConfig {
  
  @scala.inline
  def apply(): DailyMotionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailyMotionConfig]
  }
  
  @scala.inline
  implicit class DailyMotionConfigMutableBuilder[Self <: DailyMotionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}

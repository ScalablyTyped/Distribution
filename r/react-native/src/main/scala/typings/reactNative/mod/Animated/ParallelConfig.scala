package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelConfig extends StObject {
  
  var stopTogether: js.UndefOr[Boolean] = js.native
}
object ParallelConfig {
  
  @scala.inline
  def apply(): ParallelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelConfig]
  }
  
  @scala.inline
  implicit class ParallelConfigMutableBuilder[Self <: ParallelConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStopTogether(value: Boolean): Self = StObject.set(x, "stopTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTogetherUndefined: Self = StObject.set(x, "stopTogether", js.undefined)
  }
}

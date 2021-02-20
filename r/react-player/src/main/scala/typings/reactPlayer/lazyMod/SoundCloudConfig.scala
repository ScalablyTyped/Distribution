package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoundCloudConfig extends StObject {
  
  var options: js.UndefOr[js.Object] = js.native
}
object SoundCloudConfig {
  
  @scala.inline
  def apply(): SoundCloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoundCloudConfig]
  }
  
  @scala.inline
  implicit class SoundCloudConfigMutableBuilder[Self <: SoundCloudConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}

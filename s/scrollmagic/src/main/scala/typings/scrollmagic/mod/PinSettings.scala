package typings.scrollmagic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinSettings extends StObject {
  
  var pushFollowers: js.UndefOr[Boolean] = js.native
  
  var spacerClass: js.UndefOr[String] = js.native
}
object PinSettings {
  
  @scala.inline
  def apply(): PinSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinSettings]
  }
  
  @scala.inline
  implicit class PinSettingsMutableBuilder[Self <: PinSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushFollowers(value: Boolean): Self = StObject.set(x, "pushFollowers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushFollowersUndefined: Self = StObject.set(x, "pushFollowers", js.undefined)
    
    @scala.inline
    def setSpacerClass(value: String): Self = StObject.set(x, "spacerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacerClassUndefined: Self = StObject.set(x, "spacerClass", js.undefined)
  }
}

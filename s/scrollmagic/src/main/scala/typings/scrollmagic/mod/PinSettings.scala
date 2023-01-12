package typings.scrollmagic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinSettings extends StObject {
  
  var pushFollowers: js.UndefOr[Boolean] = js.undefined
  
  var spacerClass: js.UndefOr[String] = js.undefined
}
object PinSettings {
  
  inline def apply(): PinSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinSettings] (val x: Self) extends AnyVal {
    
    inline def setPushFollowers(value: Boolean): Self = StObject.set(x, "pushFollowers", value.asInstanceOf[js.Any])
    
    inline def setPushFollowersUndefined: Self = StObject.set(x, "pushFollowers", js.undefined)
    
    inline def setSpacerClass(value: String): Self = StObject.set(x, "spacerClass", value.asInstanceOf[js.Any])
    
    inline def setSpacerClassUndefined: Self = StObject.set(x, "spacerClass", js.undefined)
  }
}

package typings.sentryBrowser.anon

import typings.sentryBrowser.typesProfilingJsSelfProfilingMod.RawThreadCpuProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile extends StObject {
  
  var profile: js.UndefOr[RawThreadCpuProfile] = js.undefined
}
object Profile {
  
  inline def apply(): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
    
    inline def setProfile(value: RawThreadCpuProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}

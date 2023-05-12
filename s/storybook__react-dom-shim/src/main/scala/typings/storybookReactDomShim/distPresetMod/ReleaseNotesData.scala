package typings.storybookReactDomShim.distPresetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseNotesData extends StObject {
  
  var currentVersion: String
  
  var showOnFirstLaunch: Boolean
  
  var success: Boolean
}
object ReleaseNotesData {
  
  inline def apply(currentVersion: String, showOnFirstLaunch: Boolean, success: Boolean): ReleaseNotesData = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], showOnFirstLaunch = showOnFirstLaunch.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseNotesData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseNotesData] (val x: Self) extends AnyVal {
    
    inline def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setShowOnFirstLaunch(value: Boolean): Self = StObject.set(x, "showOnFirstLaunch", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}

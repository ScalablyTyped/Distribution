package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIStat
  extends /* key */ StringDictionary[js.Any] {
  
  var platform: String = js.native
  
  var platform_version: js.UndefOr[String] = js.native
}
object CIStat {
  
  @scala.inline
  def apply(platform: String): CIStat = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIStat]
  }
  
  @scala.inline
  implicit class CIStatMutableBuilder[Self <: CIStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform_version(value: String): Self = StObject.set(x, "platform_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform_versionUndefined: Self = StObject.set(x, "platform_version", js.undefined)
  }
}

package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class CIStatOps[Self <: CIStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform_version(value: String): Self = this.set("platform_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform_version: Self = this.set("platform_version", js.undefined)
  }
}

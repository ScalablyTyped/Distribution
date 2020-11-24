package typings.reactNativeEasyUpgrade.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasNewVersion extends js.Object {
  
  var hasNewVersion: Boolean = js.native
  
  var latestVersion: String = js.native
  
  var localVersion: String = js.native
  
  var lookupInfo: Dictkey = js.native
  
  var trackViewUrl: String = js.native
}
object HasNewVersion {
  
  @scala.inline
  def apply(
    hasNewVersion: Boolean,
    latestVersion: String,
    localVersion: String,
    lookupInfo: Dictkey,
    trackViewUrl: String
  ): HasNewVersion = {
    val __obj = js.Dynamic.literal(hasNewVersion = hasNewVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], localVersion = localVersion.asInstanceOf[js.Any], lookupInfo = lookupInfo.asInstanceOf[js.Any], trackViewUrl = trackViewUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasNewVersion]
  }
  
  @scala.inline
  implicit class HasNewVersionOps[Self <: HasNewVersion] (val x: Self) extends AnyVal {
    
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
    def setHasNewVersion(value: Boolean): Self = this.set("hasNewVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersion(value: String): Self = this.set("latestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalVersion(value: String): Self = this.set("localVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupInfo(value: Dictkey): Self = this.set("lookupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackViewUrl(value: String): Self = this.set("trackViewUrl", value.asInstanceOf[js.Any])
  }
}

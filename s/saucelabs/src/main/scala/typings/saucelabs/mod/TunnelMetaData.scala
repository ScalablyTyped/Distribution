package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TunnelMetaData
  extends /* key */ StringDictionary[js.Any] {
  
  var build: js.UndefOr[String] = js.native
  
  var command: js.UndefOr[String] = js.native
  
  var git_version: js.UndefOr[String] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var nofile_limit: js.UndefOr[Double] = js.native
  
  var platform: js.UndefOr[String] = js.native
  
  var release: js.UndefOr[String] = js.native
}
object TunnelMetaData {
  
  @scala.inline
  def apply(): TunnelMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelMetaData]
  }
  
  @scala.inline
  implicit class TunnelMetaDataOps[Self <: TunnelMetaData] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setGit_version(value: String): Self = this.set("git_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGit_version: Self = this.set("git_version", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setNofile_limit(value: Double): Self = this.set("nofile_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNofile_limit: Self = this.set("nofile_limit", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
  }
}

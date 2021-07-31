package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TunnelMetaData
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var build: js.UndefOr[String] = js.undefined
  
  var command: js.UndefOr[String] = js.undefined
  
  var git_version: js.UndefOr[String] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var nofile_limit: js.UndefOr[Double] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var release: js.UndefOr[String] = js.undefined
}
object TunnelMetaData {
  
  @scala.inline
  def apply(): TunnelMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelMetaData]
  }
  
  @scala.inline
  implicit class TunnelMetaDataMutableBuilder[Self <: TunnelMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setGit_version(value: String): Self = StObject.set(x, "git_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_versionUndefined: Self = StObject.set(x, "git_version", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setNofile_limit(value: Double): Self = StObject.set(x, "nofile_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNofile_limitUndefined: Self = StObject.set(x, "nofile_limit", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
  }
}

package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TunnelMetaData
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var build: js.UndefOr[String] = js.undefined
  
  var command: js.UndefOr[String] = js.undefined
  
  var git_version: js.UndefOr[String] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var nofile_limit: js.UndefOr[Double] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var release: js.UndefOr[String] = js.undefined
}
object TunnelMetaData {
  
  inline def apply(): TunnelMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TunnelMetaData] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setGit_version(value: String): Self = StObject.set(x, "git_version", value.asInstanceOf[js.Any])
    
    inline def setGit_versionUndefined: Self = StObject.set(x, "git_version", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setNofile_limit(value: Double): Self = StObject.set(x, "nofile_limit", value.asInstanceOf[js.Any])
    
    inline def setNofile_limitUndefined: Self = StObject.set(x, "nofile_limit", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
  }
}

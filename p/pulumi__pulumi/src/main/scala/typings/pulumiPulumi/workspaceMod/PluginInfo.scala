package typings.pulumiPulumi.workspaceMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginInfo extends js.Object {
  
  var installTime: Date = js.native
  
  var kind: PluginKind = js.native
  
  var lastUsedTime: Date = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  var serverURL: String = js.native
  
  var size: Double = js.native
  
  var version: js.UndefOr[String] = js.native
}
object PluginInfo {
  
  @scala.inline
  def apply(
    installTime: Date,
    kind: PluginKind,
    lastUsedTime: Date,
    name: String,
    path: String,
    serverURL: String,
    size: Double
  ): PluginInfo = {
    val __obj = js.Dynamic.literal(installTime = installTime.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUsedTime = lastUsedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serverURL = serverURL.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInfo]
  }
  
  @scala.inline
  implicit class PluginInfoOps[Self <: PluginInfo] (val x: Self) extends AnyVal {
    
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
    def setInstallTime(value: Date): Self = this.set("installTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: PluginKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUsedTime(value: Date): Self = this.set("lastUsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerURL(value: String): Self = this.set("serverURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}

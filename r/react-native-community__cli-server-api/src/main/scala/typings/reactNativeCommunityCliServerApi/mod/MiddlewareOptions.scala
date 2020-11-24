package typings.reactNativeCommunityCliServerApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareOptions extends js.Object {
  
  var host: js.UndefOr[String] = js.native
  
  var port: Double = js.native
  
  var watchFolders: js.Array[String] = js.native
}
object MiddlewareOptions {
  
  @scala.inline
  def apply(port: Double, watchFolders: js.Array[String]): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
  
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchFoldersVarargs(value: String*): Self = this.set("watchFolders", js.Array(value :_*))
    
    @scala.inline
    def setWatchFolders(value: js.Array[String]): Self = this.set("watchFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
  }
}

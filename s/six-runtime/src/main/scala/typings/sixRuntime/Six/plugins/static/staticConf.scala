package typings.sixRuntime.Six.plugins.static

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait staticConf extends js.Object {
  
  var cacheConf: typings.sixRuntime.Six.plugins.static.cacheConf = js.native
  
  var rootPath: String = js.native
}
object staticConf {
  
  @scala.inline
  def apply(cacheConf: cacheConf, rootPath: String): staticConf = {
    val __obj = js.Dynamic.literal(cacheConf = cacheConf.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[staticConf]
  }
  
  @scala.inline
  implicit class staticConfOps[Self <: staticConf] (val x: Self) extends AnyVal {
    
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
    def setCacheConf(value: cacheConf): Self = this.set("cacheConf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootPath(value: String): Self = this.set("rootPath", value.asInstanceOf[js.Any])
  }
}

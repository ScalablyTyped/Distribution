package typings.rest.mimeMod

import typings.rest.registryMod.Registry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var accept: js.UndefOr[String] = js.native
  
  var mime: js.UndefOr[String] = js.native
  
  var permissive: js.UndefOr[Boolean] = js.native
  
  var registry: js.UndefOr[Registry] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    
    @scala.inline
    def setPermissive(value: Boolean): Self = this.set("permissive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissive: Self = this.set("permissive", js.undefined)
    
    @scala.inline
    def setRegistry(value: Registry): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
  }
}

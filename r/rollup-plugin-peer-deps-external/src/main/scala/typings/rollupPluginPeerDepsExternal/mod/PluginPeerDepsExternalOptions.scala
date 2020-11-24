package typings.rollupPluginPeerDepsExternal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginPeerDepsExternalOptions extends js.Object {
  
  var includeDependencies: js.UndefOr[Boolean] = js.native
  
  var packageJsonPath: js.UndefOr[String] = js.native
}
object PluginPeerDepsExternalOptions {
  
  @scala.inline
  def apply(): PluginPeerDepsExternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginPeerDepsExternalOptions]
  }
  
  @scala.inline
  implicit class PluginPeerDepsExternalOptionsOps[Self <: PluginPeerDepsExternalOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeDependencies(value: Boolean): Self = this.set("includeDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDependencies: Self = this.set("includeDependencies", js.undefined)
    
    @scala.inline
    def setPackageJsonPath(value: String): Self = this.set("packageJsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageJsonPath: Self = this.set("packageJsonPath", js.undefined)
  }
}

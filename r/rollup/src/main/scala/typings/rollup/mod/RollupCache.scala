package typings.rollup.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupCache extends js.Object {
  
  var modules: js.Array[ModuleJSON] = js.native
  
  var plugins: js.UndefOr[Record[String, SerializablePluginCache]] = js.native
}
object RollupCache {
  
  @scala.inline
  def apply(modules: js.Array[ModuleJSON]): RollupCache = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupCache]
  }
  
  @scala.inline
  implicit class RollupCacheOps[Self <: RollupCache] (val x: Self) extends AnyVal {
    
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
    def setModulesVarargs(value: ModuleJSON*): Self = this.set("modules", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: js.Array[ModuleJSON]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: Record[String, SerializablePluginCache]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
}

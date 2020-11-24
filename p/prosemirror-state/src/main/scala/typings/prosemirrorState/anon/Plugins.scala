package typings.prosemirrorState.anon

import typings.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugins[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.native
  
  var schema: js.UndefOr[S | Null] = js.native
}
object Plugins {
  
  @scala.inline
  def apply[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */](): Plugins[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugins[S]]
  }
  
  @scala.inline
  implicit class PluginsOps[Self <: Plugins[_], S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] (val x: Self with Plugins[S]) extends AnyVal {
    
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
    def setPluginsVarargs(value: (Plugin[js.Any, S])*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin[_, S]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPluginsNull: Self = this.set("plugins", null)
    
    @scala.inline
    def setSchema(value: S): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSchemaNull: Self = this.set("schema", null)
  }
}

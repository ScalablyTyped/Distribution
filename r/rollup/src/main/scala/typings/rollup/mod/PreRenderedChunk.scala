package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.rollupStrings.chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreRenderedChunk extends js.Object {
  
  var exports: js.Array[String] = js.native
  
  var facadeModuleId: String | Null = js.native
  
  var isDynamicEntry: Boolean = js.native
  
  var isEntry: Boolean = js.native
  
  var isImplicitEntry: Boolean = js.native
  
  var modules: StringDictionary[RenderedModule] = js.native
  
  var name: String = js.native
  
  var `type`: chunk = js.native
}
object PreRenderedChunk {
  
  @scala.inline
  def apply(
    exports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    isImplicitEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String,
    `type`: chunk
  ): PreRenderedChunk = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isImplicitEntry = isImplicitEntry.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreRenderedChunk]
  }
  
  @scala.inline
  implicit class PreRenderedChunkOps[Self <: PreRenderedChunk] (val x: Self) extends AnyVal {
    
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
    def setExportsVarargs(value: String*): Self = this.set("exports", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: js.Array[String]): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDynamicEntry(value: Boolean): Self = this.set("isDynamicEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEntry(value: Boolean): Self = this.set("isEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImplicitEntry(value: Boolean): Self = this.set("isImplicitEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: StringDictionary[RenderedModule]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chunk): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacadeModuleId(value: String): Self = this.set("facadeModuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacadeModuleIdNull: Self = this.set("facadeModuleId", null)
  }
}

package typings.rollup.anon

import typings.rollup.mod.DecodedSourceMapOrMissing
import typings.rollup.rollupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mappings extends DecodedSourceMapOrMissing {
  
  var mappings: js.UndefOr[scala.Nothing] = js.native
  
  var missing: `true` = js.native
  
  var plugin: String = js.native
}
object Mappings {
  
  @scala.inline
  def apply(missing: `true`, plugin: String): Mappings = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mappings]
  }
  
  @scala.inline
  implicit class MappingsOps[Self <: Mappings] (val x: Self) extends AnyVal {
    
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
    def setMissing(value: `true`): Self = this.set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
  }
}

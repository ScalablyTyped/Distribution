package typings.scrivito.anon

import typings.scrivito.mod.Obj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreloadDump extends js.Object {
  
  var preloadDump: js.Any = js.native
  
  var result: Obj = js.native
}
object PreloadDump {
  
  @scala.inline
  def apply(preloadDump: js.Any, result: Obj): PreloadDump = {
    val __obj = js.Dynamic.literal(preloadDump = preloadDump.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadDump]
  }
  
  @scala.inline
  implicit class PreloadDumpOps[Self <: PreloadDump] (val x: Self) extends AnyVal {
    
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
    def setPreloadDump(value: js.Any): Self = this.set("preloadDump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Obj): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}

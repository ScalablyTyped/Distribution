package typings.resolvePackagePath.anon

import typings.std.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MODULEENTRY extends js.Object {
  
  var MODULE_ENTRY: Cache = js.native
  
  var PATH: Cache = js.native
  
  var REAL_DIRECTORY_PATH: Cache = js.native
  
  var REAL_FILE_PATH: Cache = js.native
}
object MODULEENTRY {
  
  @scala.inline
  def apply(MODULE_ENTRY: Cache, PATH: Cache, REAL_DIRECTORY_PATH: Cache, REAL_FILE_PATH: Cache): MODULEENTRY = {
    val __obj = js.Dynamic.literal(MODULE_ENTRY = MODULE_ENTRY.asInstanceOf[js.Any], PATH = PATH.asInstanceOf[js.Any], REAL_DIRECTORY_PATH = REAL_DIRECTORY_PATH.asInstanceOf[js.Any], REAL_FILE_PATH = REAL_FILE_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[MODULEENTRY]
  }
  
  @scala.inline
  implicit class MODULEENTRYOps[Self <: MODULEENTRY] (val x: Self) extends AnyVal {
    
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
    def setMODULE_ENTRY(value: Cache): Self = this.set("MODULE_ENTRY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPATH(value: Cache): Self = this.set("PATH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREAL_DIRECTORY_PATH(value: Cache): Self = this.set("REAL_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREAL_FILE_PATH(value: Cache): Self = this.set("REAL_FILE_PATH", value.asInstanceOf[js.Any])
  }
}

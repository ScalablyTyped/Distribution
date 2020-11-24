package typings.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Io extends js.Object {
  
  var cancelled_write_bytes: String = js.native
  
  var rchar: String = js.native
  
  var read_bytes: String = js.native
  
  var syscr: String = js.native
  
  var syscw: String = js.native
  
  var wchar: String = js.native
  
  var write_bytes: String = js.native
}
object Io {
  
  @scala.inline
  def apply(
    cancelled_write_bytes: String,
    rchar: String,
    read_bytes: String,
    syscr: String,
    syscw: String,
    wchar: String,
    write_bytes: String
  ): Io = {
    val __obj = js.Dynamic.literal(cancelled_write_bytes = cancelled_write_bytes.asInstanceOf[js.Any], rchar = rchar.asInstanceOf[js.Any], read_bytes = read_bytes.asInstanceOf[js.Any], syscr = syscr.asInstanceOf[js.Any], syscw = syscw.asInstanceOf[js.Any], wchar = wchar.asInstanceOf[js.Any], write_bytes = write_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Io]
  }
  
  @scala.inline
  implicit class IoOps[Self <: Io] (val x: Self) extends AnyVal {
    
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
    def setCancelled_write_bytes(value: String): Self = this.set("cancelled_write_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRchar(value: String): Self = this.set("rchar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead_bytes(value: String): Self = this.set("read_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyscr(value: String): Self = this.set("syscr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyscw(value: String): Self = this.set("syscw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWchar(value: String): Self = this.set("wchar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite_bytes(value: String): Self = this.set("write_bytes", value.asInstanceOf[js.Any])
  }
}

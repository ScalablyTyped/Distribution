package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryStat extends StObject {
  
  var data: String = js.native
  
  var dt: String = js.native
  
  var lib: String = js.native
  
  var resident: String = js.native
  
  var share: String = js.native
  
  var size: String = js.native
  
  var text: String = js.native
}
object MemoryStat {
  
  @scala.inline
  def apply(data: String, dt: String, lib: String, resident: String, share: String, size: String, text: String): MemoryStat = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any], resident = resident.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStat]
  }
  
  @scala.inline
  implicit class MemoryStatMutableBuilder[Self <: MemoryStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDt(value: String): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLib(value: String): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResident(value: String): Self = StObject.set(x, "resident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare(value: String): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}

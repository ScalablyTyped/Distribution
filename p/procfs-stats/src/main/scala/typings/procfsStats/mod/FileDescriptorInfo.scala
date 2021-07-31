package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDescriptorInfo extends StObject {
  
  var flags: String
  
  var pos: String
}
object FileDescriptorInfo {
  
  @scala.inline
  def apply(flags: String, pos: String): FileDescriptorInfo = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptorInfo]
  }
  
  @scala.inline
  implicit class FileDescriptorInfoMutableBuilder[Self <: FileDescriptorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}

package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileDescriptor extends StObject {
  
  var fd: js.UndefOr[String] = js.native
  
  var info: FileDescriptorInfo = js.native
  
  var path: String = js.native
  
  var stat: FileDescriptorStat | Boolean = js.native
}
object FileDescriptor {
  
  @scala.inline
  def apply(info: FileDescriptorInfo, path: String, stat: FileDescriptorStat | Boolean): FileDescriptor = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptor]
  }
  
  @scala.inline
  implicit class FileDescriptorMutableBuilder[Self <: FileDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
    
    @scala.inline
    def setInfo(value: FileDescriptorInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: FileDescriptorStat | Boolean): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
  }
}

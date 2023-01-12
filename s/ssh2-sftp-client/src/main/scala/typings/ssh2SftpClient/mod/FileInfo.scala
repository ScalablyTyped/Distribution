package typings.ssh2SftpClient.mod

import typings.ssh2SftpClient.anon.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInfo extends StObject {
  
  var accessTime: Double
  
  var group: Double
  
  var modifyTime: Double
  
  var name: String
  
  var owner: Double
  
  var rights: Group
  
  var size: Double
  
  var `type`: FileInfoType
}
object FileInfo {
  
  inline def apply(
    accessTime: Double,
    group: Double,
    modifyTime: Double,
    name: String,
    owner: Double,
    rights: Group,
    size: Double,
    `type`: FileInfoType
  ): FileInfo = {
    val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], modifyTime = modifyTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
    
    inline def setAccessTime(value: Double): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setModifyTime(value: Double): Self = StObject.set(x, "modifyTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Double): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRights(value: Group): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: FileInfoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

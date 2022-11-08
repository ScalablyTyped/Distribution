package typings.ssh2SftpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileStats extends StObject {
  
  var accessTime: Double
  
  var gid: Double
  
  var isBlockDevice: Boolean
  
  var isCharacterDevice: Boolean
  
  var isDirectory: Boolean
  
  var isFIFO: Boolean
  
  var isFile: Boolean
  
  var isSocket: Boolean
  
  var isSymbolicLink: Boolean
  
  var mode: Double
  
  var modifyTime: Double
  
  var size: Double
  
  var uid: Double
}
object FileStats {
  
  inline def apply(
    accessTime: Double,
    gid: Double,
    isBlockDevice: Boolean,
    isCharacterDevice: Boolean,
    isDirectory: Boolean,
    isFIFO: Boolean,
    isFile: Boolean,
    isSocket: Boolean,
    isSymbolicLink: Boolean,
    mode: Double,
    modifyTime: Double,
    size: Double,
    uid: Double
  ): FileStats = {
    val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], isBlockDevice = isBlockDevice.asInstanceOf[js.Any], isCharacterDevice = isCharacterDevice.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFIFO = isFIFO.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isSocket = isSocket.asInstanceOf[js.Any], isSymbolicLink = isSymbolicLink.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], modifyTime = modifyTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStats]
  }
  
  extension [Self <: FileStats](x: Self) {
    
    inline def setAccessTime(value: Double): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setIsBlockDevice(value: Boolean): Self = StObject.set(x, "isBlockDevice", value.asInstanceOf[js.Any])
    
    inline def setIsCharacterDevice(value: Boolean): Self = StObject.set(x, "isCharacterDevice", value.asInstanceOf[js.Any])
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setIsFIFO(value: Boolean): Self = StObject.set(x, "isFIFO", value.asInstanceOf[js.Any])
    
    inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
    
    inline def setIsSocket(value: Boolean): Self = StObject.set(x, "isSocket", value.asInstanceOf[js.Any])
    
    inline def setIsSymbolicLink(value: Boolean): Self = StObject.set(x, "isSymbolicLink", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModifyTime(value: Double): Self = StObject.set(x, "modifyTime", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}

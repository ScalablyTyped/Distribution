package typings.procfsStats.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDescriptorStat extends StObject {
  
  var atime: Date
  
  var blksize: Double
  
  var blocks: Double
  
  var ctime: Date
  
  var dev: Double
  
  var gid: Double
  
  var ino: Double
  
  var mode: Double
  
  var mtime: Date
  
  var nlink: Double
  
  var rdev: Double
  
  var size: Double
  
  var uid: Double
}
object FileDescriptorStat {
  
  inline def apply(
    atime: Date,
    blksize: Double,
    blocks: Double,
    ctime: Date,
    dev: Double,
    gid: Double,
    ino: Double,
    mode: Double,
    mtime: Date,
    nlink: Double,
    rdev: Double,
    size: Double,
    uid: Double
  ): FileDescriptorStat = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptorStat]
  }
  
  extension [Self <: FileDescriptorStat](x: Self) {
    
    inline def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    inline def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
    
    inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
    
    inline def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}

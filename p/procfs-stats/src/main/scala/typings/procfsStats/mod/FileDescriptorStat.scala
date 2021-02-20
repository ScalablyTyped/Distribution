package typings.procfsStats.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileDescriptorStat extends StObject {
  
  var atime: Date = js.native
  
  var blksize: Double = js.native
  
  var blocks: Double = js.native
  
  var ctime: Date = js.native
  
  var dev: Double = js.native
  
  var gid: Double = js.native
  
  var ino: Double = js.native
  
  var mode: Double = js.native
  
  var mtime: Date = js.native
  
  var nlink: Double = js.native
  
  var rdev: Double = js.native
  
  var size: Double = js.native
  
  var uid: Double = js.native
}
object FileDescriptorStat {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FileDescriptorStatMutableBuilder[Self <: FileDescriptorStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}

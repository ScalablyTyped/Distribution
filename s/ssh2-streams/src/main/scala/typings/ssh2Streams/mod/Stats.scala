package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats
  extends StObject
     with Attributes {
  
  def isBlockDevice(): Boolean
  
  def isCharacterDevice(): Boolean
  
  def isDirectory(): Boolean
  
  def isFIFO(): Boolean
  
  def isFile(): Boolean
  
  def isSocket(): Boolean
  
  def isSymbolicLink(): Boolean
}
object Stats {
  
  inline def apply(
    atime: Double,
    gid: Double,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: Double,
    mtime: Double,
    size: Double,
    uid: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setIsBlockDevice(value: () => Boolean): Self = StObject.set(x, "isBlockDevice", js.Any.fromFunction0(value))
    
    inline def setIsCharacterDevice(value: () => Boolean): Self = StObject.set(x, "isCharacterDevice", js.Any.fromFunction0(value))
    
    inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    inline def setIsFIFO(value: () => Boolean): Self = StObject.set(x, "isFIFO", js.Any.fromFunction0(value))
    
    inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    
    inline def setIsSocket(value: () => Boolean): Self = StObject.set(x, "isSocket", js.Any.fromFunction0(value))
    
    inline def setIsSymbolicLink(value: () => Boolean): Self = StObject.set(x, "isSymbolicLink", js.Any.fromFunction0(value))
  }
}

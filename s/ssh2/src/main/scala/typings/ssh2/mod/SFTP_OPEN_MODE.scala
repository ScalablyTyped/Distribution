package typings.ssh2.mod

import typings.ssh2Streams.mod.SFTPStream.OPEN_MODE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2", "SFTP_OPEN_MODE")
@js.native
object SFTP_OPEN_MODE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OPEN_MODE & Double] = js.native
  
  /* 0x00000004 */ val APPEND: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.APPEND & Double = js.native
  
  /* 0x00000008 */ val CREAT: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.CREAT & Double = js.native
  
  /* 0x00000020 */ val EXCL: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.EXCL & Double = js.native
  
  /* 0x00000001 */ val READ: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.READ & Double = js.native
  
  /* 0x00000010 */ val TRUNC: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.TRUNC & Double = js.native
  
  /* 0x00000002 */ val WRITE: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.WRITE & Double = js.native
}

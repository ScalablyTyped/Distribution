package typings.ssh2.mod

import typings.ssh2Streams.mod.SFTPStream.STATUS_CODE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2", "SFTP_STATUS_CODE")
@js.native
object SFTP_STATUS_CODE extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[STATUS_CODE with Double] = js.native
  
  /* 5 */ val BAD_MESSAGE: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.BAD_MESSAGE with Double = js.native
  
  /* 7 */ val CONNECTION_LOST: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.CONNECTION_LOST with Double = js.native
  
  /* 1 */ val EOF: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.EOF with Double = js.native
  
  /* 4 */ val FAILURE: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.FAILURE with Double = js.native
  
  /* 6 */ val NO_CONNECTION: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.NO_CONNECTION with Double = js.native
  
  /* 2 */ val NO_SUCH_FILE: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.NO_SUCH_FILE with Double = js.native
  
  /* 0 */ val OK: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.OK with Double = js.native
  
  /* 8 */ val OP_UNSUPPORTED: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.OP_UNSUPPORTED with Double = js.native
  
  /* 3 */ val PERMISSION_DENIED: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.PERMISSION_DENIED with Double = js.native
}

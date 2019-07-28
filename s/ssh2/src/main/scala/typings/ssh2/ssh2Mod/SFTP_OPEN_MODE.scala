package typings.ssh2.ssh2Mod

import typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2", "SFTP_OPEN_MODE")
@js.native
object SFTP_OPEN_MODE extends js.Object {
  /* 0x00000004 */ val APPEND: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.APPEND with Double = js.native
  /* 0x00000008 */ val CREAT: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.CREAT with Double = js.native
  /* 0x00000020 */ val EXCL: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.EXCL with Double = js.native
  /* 0x00000001 */ val READ: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.READ with Double = js.native
  /* 0x00000010 */ val TRUNC: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.TRUNC with Double = js.native
  /* 0x00000002 */ val WRITE: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.WRITE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OPEN_MODE with Double] = js.native
}


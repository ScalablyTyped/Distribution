package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE
import typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2-streams", "SFTPStream")
@js.native
object SFTPStreamNs extends js.Object {
  @js.native
  sealed trait OPEN_MODE extends js.Object
  
  @js.native
  sealed trait STATUS_CODE extends js.Object
  
  @js.native
  object OPEN_MODE extends js.Object {
    @js.native
    sealed trait APPEND extends OPEN_MODE
    
    @js.native
    sealed trait CREAT extends OPEN_MODE
    
    @js.native
    sealed trait EXCL extends OPEN_MODE
    
    @js.native
    sealed trait READ extends OPEN_MODE
    
    @js.native
    sealed trait TRUNC extends OPEN_MODE
    
    @js.native
    sealed trait WRITE extends OPEN_MODE
    
    /* 0x00000004 */ val APPEND: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.APPEND with Double = js.native
    /* 0x00000008 */ val CREAT: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.CREAT with Double = js.native
    /* 0x00000020 */ val EXCL: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.EXCL with Double = js.native
    /* 0x00000001 */ val READ: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.READ with Double = js.native
    /* 0x00000010 */ val TRUNC: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.TRUNC with Double = js.native
    /* 0x00000002 */ val WRITE: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE.WRITE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OPEN_MODE with Double] = js.native
  }
  
  @js.native
  object STATUS_CODE extends js.Object {
    @js.native
    sealed trait BAD_MESSAGE extends STATUS_CODE
    
    @js.native
    sealed trait CONNECTION_LOST extends STATUS_CODE
    
    @js.native
    sealed trait EOF extends STATUS_CODE
    
    @js.native
    sealed trait FAILURE extends STATUS_CODE
    
    @js.native
    sealed trait NO_CONNECTION extends STATUS_CODE
    
    @js.native
    sealed trait NO_SUCH_FILE extends STATUS_CODE
    
    @js.native
    sealed trait OK extends STATUS_CODE
    
    @js.native
    sealed trait OP_UNSUPPORTED extends STATUS_CODE
    
    @js.native
    sealed trait PERMISSION_DENIED extends STATUS_CODE
    
    /* 5 */ val BAD_MESSAGE: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE.BAD_MESSAGE with Double = js.native
    /* 7 */ val CONNECTION_LOST: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE.CONNECTION_LOST with Double = js.native
    /* 1 */ val EOF: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE.EOF with Double = js.native
    /* 4 */ val FAILURE: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE.FAILURE with Double = js.native
    /* 6 */ val NO_CONNECTION: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE.NO_CONNECTION with Double = js.native
    /* 2 */ val NO_SUCH_FILE: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE.NO_SUCH_FILE with Double = js.native
    /* 0 */ val OK: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE.OK with Double = js.native
    /* 8 */ val OP_UNSUPPORTED: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE.OP_UNSUPPORTED with Double = js.native
    /* 3 */ val PERMISSION_DENIED: typings.ssh2DashStreams.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE.PERMISSION_DENIED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[STATUS_CODE with Double] = js.native
  }
  
}


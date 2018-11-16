package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

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
    sealed trait APPEND
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE
    
    @js.native
    sealed trait CREAT
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE
    
    @js.native
    sealed trait EXCL
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE
    
    @js.native
    sealed trait READ
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE
    
    @js.native
    sealed trait TRUNC
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE
    
    @js.native
    sealed trait WRITE
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE
    
    /* 0x00000004 */ val APPEND: APPEND with scala.Double = js.native
    /* 0x00000008 */ val CREAT: CREAT with scala.Double = js.native
    /* 0x00000020 */ val EXCL: EXCL with scala.Double = js.native
    /* 0x00000001 */ val READ: READ with scala.Double = js.native
    /* 0x00000010 */ val TRUNC: TRUNC with scala.Double = js.native
    /* 0x00000002 */ val WRITE: WRITE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE with scala.Double] = js.native
  }
  
  @js.native
  object STATUS_CODE extends js.Object {
    @js.native
    sealed trait BAD_MESSAGE
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
    
    @js.native
    sealed trait CONNECTION_LOST
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
    
    @js.native
    sealed trait EOF
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
    
    @js.native
    sealed trait FAILURE
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
    
    @js.native
    sealed trait NO_CONNECTION
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
    
    @js.native
    sealed trait NO_SUCH_FILE
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
    
    @js.native
    sealed trait OK
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
    
    @js.native
    sealed trait OP_UNSUPPORTED
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
    
    /* 5 */ val BAD_MESSAGE: BAD_MESSAGE with scala.Double = js.native
    /* 7 */ val CONNECTION_LOST: CONNECTION_LOST with scala.Double = js.native
    /* 1 */ val EOF: EOF with scala.Double = js.native
    /* 4 */ val FAILURE: FAILURE with scala.Double = js.native
    /* 6 */ val NO_CONNECTION: NO_CONNECTION with scala.Double = js.native
    /* 2 */ val NO_SUCH_FILE: NO_SUCH_FILE with scala.Double = js.native
    /* 0 */ val OK: OK with scala.Double = js.native
    /* 8 */ val OP_UNSUPPORTED: OP_UNSUPPORTED with scala.Double = js.native
    /* 3 */ val PERMISSION_DENIED: PERMISSION_DENIED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE with scala.Double] = js.native
  }
  
}


package typings
package promiseDashSftpLib.promiseDashSftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERROR_CODES extends js.Object

@JSImport("promise-sftp", "ERROR_CODES")
@js.native
object ERROR_CODES extends js.Object {
  @js.native
  sealed trait BAD_MESSAGE
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_CONFLICT
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_REFUSED
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait CANNOT_DELETE
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait CONNECTION_LOST
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait DELETE_PENDING
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait DIR_NOT_EMPTY
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait EOF
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait FAILURE
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait FILE_ALREADY_EXISTS
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait FILE_CORRUPT
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait FILE_IS_A_DIRECTORY
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait GROUP_INVALID
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait INVALID_FILENAME
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait INVALID_HANDLE
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait INVALID_PARAMETER
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait LINK_LOOP
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait LOCK_CONFLICT
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait NOT_A_DIRECTORY
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait NO_CONNECTION
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait NO_MATCHING_BYTE_RANGE_LOCK
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait NO_MEDIA
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait NO_SPACE_ON_FILESYSTEM
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait NO_SUCH_FILE
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait NO_SUCH_PATH
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait OK
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait OP_UNSUPPORTED
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait OWNER_INVALID
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait PERMISSION_DENIED
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait QUOTA_EXCEEDED
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait UNKNOWN_PRINCIPAL
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  @js.native
  sealed trait WRITE_PROTECT
    extends promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES
  
  /* 5 */ val BAD_MESSAGE: BAD_MESSAGE with scala.Double = js.native
  /* 25 */ val BYTE_RANGE_LOCK_CONFLICT: BYTE_RANGE_LOCK_CONFLICT with scala.Double = js.native
  /* 26 */ val BYTE_RANGE_LOCK_REFUSED: BYTE_RANGE_LOCK_REFUSED with scala.Double = js.native
  /* 22 */ val CANNOT_DELETE: CANNOT_DELETE with scala.Double = js.native
  /* 7 */ val CONNECTION_LOST: CONNECTION_LOST with scala.Double = js.native
  /* 27 */ val DELETE_PENDING: DELETE_PENDING with scala.Double = js.native
  /* 18 */ val DIR_NOT_EMPTY: DIR_NOT_EMPTY with scala.Double = js.native
  /* 1 */ val EOF: EOF with scala.Double = js.native
  /* 4 */ val FAILURE: FAILURE with scala.Double = js.native
  /* 11 */ val FILE_ALREADY_EXISTS: FILE_ALREADY_EXISTS with scala.Double = js.native
  /* 28 */ val FILE_CORRUPT: FILE_CORRUPT with scala.Double = js.native
  /* 24 */ val FILE_IS_A_DIRECTORY: FILE_IS_A_DIRECTORY with scala.Double = js.native
  /* 30 */ val GROUP_INVALID: GROUP_INVALID with scala.Double = js.native
  /* 20 */ val INVALID_FILENAME: INVALID_FILENAME with scala.Double = js.native
  /* 9 */ val INVALID_HANDLE: INVALID_HANDLE with scala.Double = js.native
  /* 23 */ val INVALID_PARAMETER: INVALID_PARAMETER with scala.Double = js.native
  /* 21 */ val LINK_LOOP: LINK_LOOP with scala.Double = js.native
  /* 17 */ val LOCK_CONFLICT: LOCK_CONFLICT with scala.Double = js.native
  /* 19 */ val NOT_A_DIRECTORY: NOT_A_DIRECTORY with scala.Double = js.native
  /* 6 */ val NO_CONNECTION: NO_CONNECTION with scala.Double = js.native
  /* 31 */ val NO_MATCHING_BYTE_RANGE_LOCK: NO_MATCHING_BYTE_RANGE_LOCK with scala.Double = js.native
  /* 13 */ val NO_MEDIA: NO_MEDIA with scala.Double = js.native
  /* 14 */ val NO_SPACE_ON_FILESYSTEM: NO_SPACE_ON_FILESYSTEM with scala.Double = js.native
  /* 2 */ val NO_SUCH_FILE: NO_SUCH_FILE with scala.Double = js.native
  /* 10 */ val NO_SUCH_PATH: NO_SUCH_PATH with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 8 */ val OP_UNSUPPORTED: OP_UNSUPPORTED with scala.Double = js.native
  /* 29 */ val OWNER_INVALID: OWNER_INVALID with scala.Double = js.native
  /* 3 */ val PERMISSION_DENIED: PERMISSION_DENIED with scala.Double = js.native
  /* 15 */ val QUOTA_EXCEEDED: QUOTA_EXCEEDED with scala.Double = js.native
  /* 16 */ val UNKNOWN_PRINCIPAL: UNKNOWN_PRINCIPAL with scala.Double = js.native
  /* 12 */ val WRITE_PROTECT: WRITE_PROTECT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES with scala.Double] = js.native
}


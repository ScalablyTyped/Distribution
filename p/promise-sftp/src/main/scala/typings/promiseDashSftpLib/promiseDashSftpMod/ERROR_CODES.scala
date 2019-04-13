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
  
  val BAD_MESSAGE: BAD_MESSAGE with java.lang.String = js.native
  val BYTE_RANGE_LOCK_CONFLICT: BYTE_RANGE_LOCK_CONFLICT with java.lang.String = js.native
  val BYTE_RANGE_LOCK_REFUSED: BYTE_RANGE_LOCK_REFUSED with java.lang.String = js.native
  val CANNOT_DELETE: CANNOT_DELETE with java.lang.String = js.native
  val CONNECTION_LOST: CONNECTION_LOST with java.lang.String = js.native
  val DELETE_PENDING: DELETE_PENDING with java.lang.String = js.native
  val DIR_NOT_EMPTY: DIR_NOT_EMPTY with java.lang.String = js.native
  val EOF: EOF with java.lang.String = js.native
  val FAILURE: FAILURE with java.lang.String = js.native
  val FILE_ALREADY_EXISTS: FILE_ALREADY_EXISTS with java.lang.String = js.native
  val FILE_CORRUPT: FILE_CORRUPT with java.lang.String = js.native
  val FILE_IS_A_DIRECTORY: FILE_IS_A_DIRECTORY with java.lang.String = js.native
  val GROUP_INVALID: GROUP_INVALID with java.lang.String = js.native
  val INVALID_FILENAME: INVALID_FILENAME with java.lang.String = js.native
  val INVALID_HANDLE: INVALID_HANDLE with java.lang.String = js.native
  val INVALID_PARAMETER: INVALID_PARAMETER with java.lang.String = js.native
  val LINK_LOOP: LINK_LOOP with java.lang.String = js.native
  val LOCK_CONFLICT: LOCK_CONFLICT with java.lang.String = js.native
  val NOT_A_DIRECTORY: NOT_A_DIRECTORY with java.lang.String = js.native
  val NO_CONNECTION: NO_CONNECTION with java.lang.String = js.native
  val NO_MATCHING_BYTE_RANGE_LOCK: NO_MATCHING_BYTE_RANGE_LOCK with java.lang.String = js.native
  val NO_MEDIA: NO_MEDIA with java.lang.String = js.native
  val NO_SPACE_ON_FILESYSTEM: NO_SPACE_ON_FILESYSTEM with java.lang.String = js.native
  val NO_SUCH_FILE: NO_SUCH_FILE with java.lang.String = js.native
  val NO_SUCH_PATH: NO_SUCH_PATH with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val OP_UNSUPPORTED: OP_UNSUPPORTED with java.lang.String = js.native
  val OWNER_INVALID: OWNER_INVALID with java.lang.String = js.native
  val PERMISSION_DENIED: PERMISSION_DENIED with java.lang.String = js.native
  val QUOTA_EXCEEDED: QUOTA_EXCEEDED with java.lang.String = js.native
  val UNKNOWN_PRINCIPAL: UNKNOWN_PRINCIPAL with java.lang.String = js.native
  val WRITE_PROTECT: WRITE_PROTECT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[promiseDashSftpLib.promiseDashSftpMod.ERROR_CODES with java.lang.String] = js.native
}


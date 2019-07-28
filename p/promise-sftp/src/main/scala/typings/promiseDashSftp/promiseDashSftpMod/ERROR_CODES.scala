package typings.promiseDashSftp.promiseDashSftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERROR_CODES extends js.Object

@JSImport("promise-sftp", "ERROR_CODES")
@js.native
object ERROR_CODES extends js.Object {
  @js.native
  sealed trait BAD_MESSAGE extends ERROR_CODES
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_CONFLICT extends ERROR_CODES
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_REFUSED extends ERROR_CODES
  
  @js.native
  sealed trait CANNOT_DELETE extends ERROR_CODES
  
  @js.native
  sealed trait CONNECTION_LOST extends ERROR_CODES
  
  @js.native
  sealed trait DELETE_PENDING extends ERROR_CODES
  
  @js.native
  sealed trait DIR_NOT_EMPTY extends ERROR_CODES
  
  @js.native
  sealed trait EOF extends ERROR_CODES
  
  @js.native
  sealed trait FAILURE extends ERROR_CODES
  
  @js.native
  sealed trait FILE_ALREADY_EXISTS extends ERROR_CODES
  
  @js.native
  sealed trait FILE_CORRUPT extends ERROR_CODES
  
  @js.native
  sealed trait FILE_IS_A_DIRECTORY extends ERROR_CODES
  
  @js.native
  sealed trait GROUP_INVALID extends ERROR_CODES
  
  @js.native
  sealed trait INVALID_FILENAME extends ERROR_CODES
  
  @js.native
  sealed trait INVALID_HANDLE extends ERROR_CODES
  
  @js.native
  sealed trait INVALID_PARAMETER extends ERROR_CODES
  
  @js.native
  sealed trait LINK_LOOP extends ERROR_CODES
  
  @js.native
  sealed trait LOCK_CONFLICT extends ERROR_CODES
  
  @js.native
  sealed trait NOT_A_DIRECTORY extends ERROR_CODES
  
  @js.native
  sealed trait NO_CONNECTION extends ERROR_CODES
  
  @js.native
  sealed trait NO_MATCHING_BYTE_RANGE_LOCK extends ERROR_CODES
  
  @js.native
  sealed trait NO_MEDIA extends ERROR_CODES
  
  @js.native
  sealed trait NO_SPACE_ON_FILESYSTEM extends ERROR_CODES
  
  @js.native
  sealed trait NO_SUCH_FILE extends ERROR_CODES
  
  @js.native
  sealed trait NO_SUCH_PATH extends ERROR_CODES
  
  @js.native
  sealed trait OK extends ERROR_CODES
  
  @js.native
  sealed trait OP_UNSUPPORTED extends ERROR_CODES
  
  @js.native
  sealed trait OWNER_INVALID extends ERROR_CODES
  
  @js.native
  sealed trait PERMISSION_DENIED extends ERROR_CODES
  
  @js.native
  sealed trait QUOTA_EXCEEDED extends ERROR_CODES
  
  @js.native
  sealed trait UNKNOWN_PRINCIPAL extends ERROR_CODES
  
  @js.native
  sealed trait WRITE_PROTECT extends ERROR_CODES
  
  /* 5 */ val BAD_MESSAGE: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.BAD_MESSAGE with Double = js.native
  /* 25 */ val BYTE_RANGE_LOCK_CONFLICT: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.BYTE_RANGE_LOCK_CONFLICT with Double = js.native
  /* 26 */ val BYTE_RANGE_LOCK_REFUSED: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.BYTE_RANGE_LOCK_REFUSED with Double = js.native
  /* 22 */ val CANNOT_DELETE: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.CANNOT_DELETE with Double = js.native
  /* 7 */ val CONNECTION_LOST: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.CONNECTION_LOST with Double = js.native
  /* 27 */ val DELETE_PENDING: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.DELETE_PENDING with Double = js.native
  /* 18 */ val DIR_NOT_EMPTY: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.DIR_NOT_EMPTY with Double = js.native
  /* 1 */ val EOF: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.EOF with Double = js.native
  /* 4 */ val FAILURE: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.FAILURE with Double = js.native
  /* 11 */ val FILE_ALREADY_EXISTS: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.FILE_ALREADY_EXISTS with Double = js.native
  /* 28 */ val FILE_CORRUPT: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.FILE_CORRUPT with Double = js.native
  /* 24 */ val FILE_IS_A_DIRECTORY: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.FILE_IS_A_DIRECTORY with Double = js.native
  /* 30 */ val GROUP_INVALID: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.GROUP_INVALID with Double = js.native
  /* 20 */ val INVALID_FILENAME: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.INVALID_FILENAME with Double = js.native
  /* 9 */ val INVALID_HANDLE: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.INVALID_HANDLE with Double = js.native
  /* 23 */ val INVALID_PARAMETER: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.INVALID_PARAMETER with Double = js.native
  /* 21 */ val LINK_LOOP: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.LINK_LOOP with Double = js.native
  /* 17 */ val LOCK_CONFLICT: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.LOCK_CONFLICT with Double = js.native
  /* 19 */ val NOT_A_DIRECTORY: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.NOT_A_DIRECTORY with Double = js.native
  /* 6 */ val NO_CONNECTION: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.NO_CONNECTION with Double = js.native
  /* 31 */ val NO_MATCHING_BYTE_RANGE_LOCK: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.NO_MATCHING_BYTE_RANGE_LOCK with Double = js.native
  /* 13 */ val NO_MEDIA: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.NO_MEDIA with Double = js.native
  /* 14 */ val NO_SPACE_ON_FILESYSTEM: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.NO_SPACE_ON_FILESYSTEM with Double = js.native
  /* 2 */ val NO_SUCH_FILE: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.NO_SUCH_FILE with Double = js.native
  /* 10 */ val NO_SUCH_PATH: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.NO_SUCH_PATH with Double = js.native
  /* 0 */ val OK: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.OK with Double = js.native
  /* 8 */ val OP_UNSUPPORTED: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.OP_UNSUPPORTED with Double = js.native
  /* 29 */ val OWNER_INVALID: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.OWNER_INVALID with Double = js.native
  /* 3 */ val PERMISSION_DENIED: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.PERMISSION_DENIED with Double = js.native
  /* 15 */ val QUOTA_EXCEEDED: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.QUOTA_EXCEEDED with Double = js.native
  /* 16 */ val UNKNOWN_PRINCIPAL: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.UNKNOWN_PRINCIPAL with Double = js.native
  /* 12 */ val WRITE_PROTECT: typings.promiseDashSftp.promiseDashSftpMod.ERROR_CODES.WRITE_PROTECT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERROR_CODES with Double] = js.native
}


package typings.promiseSftp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_CODES extends StObject
@JSImport("promise-sftp", "ERROR_CODES")
@js.native
object ERROR_CODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERROR_CODES with Double] = js.native
  
  @js.native
  sealed trait BAD_MESSAGE extends ERROR_CODES
  /* 5 */ val BAD_MESSAGE: typings.promiseSftp.mod.ERROR_CODES.BAD_MESSAGE with Double = js.native
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_CONFLICT extends ERROR_CODES
  /* 25 */ val BYTE_RANGE_LOCK_CONFLICT: typings.promiseSftp.mod.ERROR_CODES.BYTE_RANGE_LOCK_CONFLICT with Double = js.native
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_REFUSED extends ERROR_CODES
  /* 26 */ val BYTE_RANGE_LOCK_REFUSED: typings.promiseSftp.mod.ERROR_CODES.BYTE_RANGE_LOCK_REFUSED with Double = js.native
  
  @js.native
  sealed trait CANNOT_DELETE extends ERROR_CODES
  /* 22 */ val CANNOT_DELETE: typings.promiseSftp.mod.ERROR_CODES.CANNOT_DELETE with Double = js.native
  
  @js.native
  sealed trait CONNECTION_LOST extends ERROR_CODES
  /* 7 */ val CONNECTION_LOST: typings.promiseSftp.mod.ERROR_CODES.CONNECTION_LOST with Double = js.native
  
  @js.native
  sealed trait DELETE_PENDING extends ERROR_CODES
  /* 27 */ val DELETE_PENDING: typings.promiseSftp.mod.ERROR_CODES.DELETE_PENDING with Double = js.native
  
  @js.native
  sealed trait DIR_NOT_EMPTY extends ERROR_CODES
  /* 18 */ val DIR_NOT_EMPTY: typings.promiseSftp.mod.ERROR_CODES.DIR_NOT_EMPTY with Double = js.native
  
  @js.native
  sealed trait EOF extends ERROR_CODES
  /* 1 */ val EOF: typings.promiseSftp.mod.ERROR_CODES.EOF with Double = js.native
  
  @js.native
  sealed trait FAILURE extends ERROR_CODES
  /* 4 */ val FAILURE: typings.promiseSftp.mod.ERROR_CODES.FAILURE with Double = js.native
  
  @js.native
  sealed trait FILE_ALREADY_EXISTS extends ERROR_CODES
  /* 11 */ val FILE_ALREADY_EXISTS: typings.promiseSftp.mod.ERROR_CODES.FILE_ALREADY_EXISTS with Double = js.native
  
  @js.native
  sealed trait FILE_CORRUPT extends ERROR_CODES
  /* 28 */ val FILE_CORRUPT: typings.promiseSftp.mod.ERROR_CODES.FILE_CORRUPT with Double = js.native
  
  @js.native
  sealed trait FILE_IS_A_DIRECTORY extends ERROR_CODES
  /* 24 */ val FILE_IS_A_DIRECTORY: typings.promiseSftp.mod.ERROR_CODES.FILE_IS_A_DIRECTORY with Double = js.native
  
  @js.native
  sealed trait GROUP_INVALID extends ERROR_CODES
  /* 30 */ val GROUP_INVALID: typings.promiseSftp.mod.ERROR_CODES.GROUP_INVALID with Double = js.native
  
  @js.native
  sealed trait INVALID_FILENAME extends ERROR_CODES
  /* 20 */ val INVALID_FILENAME: typings.promiseSftp.mod.ERROR_CODES.INVALID_FILENAME with Double = js.native
  
  @js.native
  sealed trait INVALID_HANDLE extends ERROR_CODES
  /* 9 */ val INVALID_HANDLE: typings.promiseSftp.mod.ERROR_CODES.INVALID_HANDLE with Double = js.native
  
  @js.native
  sealed trait INVALID_PARAMETER extends ERROR_CODES
  /* 23 */ val INVALID_PARAMETER: typings.promiseSftp.mod.ERROR_CODES.INVALID_PARAMETER with Double = js.native
  
  @js.native
  sealed trait LINK_LOOP extends ERROR_CODES
  /* 21 */ val LINK_LOOP: typings.promiseSftp.mod.ERROR_CODES.LINK_LOOP with Double = js.native
  
  @js.native
  sealed trait LOCK_CONFLICT extends ERROR_CODES
  /* 17 */ val LOCK_CONFLICT: typings.promiseSftp.mod.ERROR_CODES.LOCK_CONFLICT with Double = js.native
  
  @js.native
  sealed trait NOT_A_DIRECTORY extends ERROR_CODES
  /* 19 */ val NOT_A_DIRECTORY: typings.promiseSftp.mod.ERROR_CODES.NOT_A_DIRECTORY with Double = js.native
  
  @js.native
  sealed trait NO_CONNECTION extends ERROR_CODES
  /* 6 */ val NO_CONNECTION: typings.promiseSftp.mod.ERROR_CODES.NO_CONNECTION with Double = js.native
  
  @js.native
  sealed trait NO_MATCHING_BYTE_RANGE_LOCK extends ERROR_CODES
  /* 31 */ val NO_MATCHING_BYTE_RANGE_LOCK: typings.promiseSftp.mod.ERROR_CODES.NO_MATCHING_BYTE_RANGE_LOCK with Double = js.native
  
  @js.native
  sealed trait NO_MEDIA extends ERROR_CODES
  /* 13 */ val NO_MEDIA: typings.promiseSftp.mod.ERROR_CODES.NO_MEDIA with Double = js.native
  
  @js.native
  sealed trait NO_SPACE_ON_FILESYSTEM extends ERROR_CODES
  /* 14 */ val NO_SPACE_ON_FILESYSTEM: typings.promiseSftp.mod.ERROR_CODES.NO_SPACE_ON_FILESYSTEM with Double = js.native
  
  @js.native
  sealed trait NO_SUCH_FILE extends ERROR_CODES
  /* 2 */ val NO_SUCH_FILE: typings.promiseSftp.mod.ERROR_CODES.NO_SUCH_FILE with Double = js.native
  
  @js.native
  sealed trait NO_SUCH_PATH extends ERROR_CODES
  /* 10 */ val NO_SUCH_PATH: typings.promiseSftp.mod.ERROR_CODES.NO_SUCH_PATH with Double = js.native
  
  @js.native
  sealed trait OK extends ERROR_CODES
  /* 0 */ val OK: typings.promiseSftp.mod.ERROR_CODES.OK with Double = js.native
  
  @js.native
  sealed trait OP_UNSUPPORTED extends ERROR_CODES
  /* 8 */ val OP_UNSUPPORTED: typings.promiseSftp.mod.ERROR_CODES.OP_UNSUPPORTED with Double = js.native
  
  @js.native
  sealed trait OWNER_INVALID extends ERROR_CODES
  /* 29 */ val OWNER_INVALID: typings.promiseSftp.mod.ERROR_CODES.OWNER_INVALID with Double = js.native
  
  @js.native
  sealed trait PERMISSION_DENIED extends ERROR_CODES
  /* 3 */ val PERMISSION_DENIED: typings.promiseSftp.mod.ERROR_CODES.PERMISSION_DENIED with Double = js.native
  
  @js.native
  sealed trait QUOTA_EXCEEDED extends ERROR_CODES
  /* 15 */ val QUOTA_EXCEEDED: typings.promiseSftp.mod.ERROR_CODES.QUOTA_EXCEEDED with Double = js.native
  
  @js.native
  sealed trait UNKNOWN_PRINCIPAL extends ERROR_CODES
  /* 16 */ val UNKNOWN_PRINCIPAL: typings.promiseSftp.mod.ERROR_CODES.UNKNOWN_PRINCIPAL with Double = js.native
  
  @js.native
  sealed trait WRITE_PROTECT extends ERROR_CODES
  /* 12 */ val WRITE_PROTECT: typings.promiseSftp.mod.ERROR_CODES.WRITE_PROTECT with Double = js.native
}

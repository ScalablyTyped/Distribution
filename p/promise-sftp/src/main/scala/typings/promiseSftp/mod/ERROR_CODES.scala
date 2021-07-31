package typings.promiseSftp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_CODES extends StObject
@JSImport("promise-sftp", "ERROR_CODES")
@js.native
object ERROR_CODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERROR_CODES & Double] = js.native
  
  @js.native
  sealed trait BAD_MESSAGE
    extends StObject
       with ERROR_CODES
  /* 5 */ val BAD_MESSAGE: typings.promiseSftp.mod.ERROR_CODES.BAD_MESSAGE & Double = js.native
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_CONFLICT
    extends StObject
       with ERROR_CODES
  /* 25 */ val BYTE_RANGE_LOCK_CONFLICT: typings.promiseSftp.mod.ERROR_CODES.BYTE_RANGE_LOCK_CONFLICT & Double = js.native
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_REFUSED
    extends StObject
       with ERROR_CODES
  /* 26 */ val BYTE_RANGE_LOCK_REFUSED: typings.promiseSftp.mod.ERROR_CODES.BYTE_RANGE_LOCK_REFUSED & Double = js.native
  
  @js.native
  sealed trait CANNOT_DELETE
    extends StObject
       with ERROR_CODES
  /* 22 */ val CANNOT_DELETE: typings.promiseSftp.mod.ERROR_CODES.CANNOT_DELETE & Double = js.native
  
  @js.native
  sealed trait CONNECTION_LOST
    extends StObject
       with ERROR_CODES
  /* 7 */ val CONNECTION_LOST: typings.promiseSftp.mod.ERROR_CODES.CONNECTION_LOST & Double = js.native
  
  @js.native
  sealed trait DELETE_PENDING
    extends StObject
       with ERROR_CODES
  /* 27 */ val DELETE_PENDING: typings.promiseSftp.mod.ERROR_CODES.DELETE_PENDING & Double = js.native
  
  @js.native
  sealed trait DIR_NOT_EMPTY
    extends StObject
       with ERROR_CODES
  /* 18 */ val DIR_NOT_EMPTY: typings.promiseSftp.mod.ERROR_CODES.DIR_NOT_EMPTY & Double = js.native
  
  @js.native
  sealed trait EOF
    extends StObject
       with ERROR_CODES
  /* 1 */ val EOF: typings.promiseSftp.mod.ERROR_CODES.EOF & Double = js.native
  
  @js.native
  sealed trait FAILURE
    extends StObject
       with ERROR_CODES
  /* 4 */ val FAILURE: typings.promiseSftp.mod.ERROR_CODES.FAILURE & Double = js.native
  
  @js.native
  sealed trait FILE_ALREADY_EXISTS
    extends StObject
       with ERROR_CODES
  /* 11 */ val FILE_ALREADY_EXISTS: typings.promiseSftp.mod.ERROR_CODES.FILE_ALREADY_EXISTS & Double = js.native
  
  @js.native
  sealed trait FILE_CORRUPT
    extends StObject
       with ERROR_CODES
  /* 28 */ val FILE_CORRUPT: typings.promiseSftp.mod.ERROR_CODES.FILE_CORRUPT & Double = js.native
  
  @js.native
  sealed trait FILE_IS_A_DIRECTORY
    extends StObject
       with ERROR_CODES
  /* 24 */ val FILE_IS_A_DIRECTORY: typings.promiseSftp.mod.ERROR_CODES.FILE_IS_A_DIRECTORY & Double = js.native
  
  @js.native
  sealed trait GROUP_INVALID
    extends StObject
       with ERROR_CODES
  /* 30 */ val GROUP_INVALID: typings.promiseSftp.mod.ERROR_CODES.GROUP_INVALID & Double = js.native
  
  @js.native
  sealed trait INVALID_FILENAME
    extends StObject
       with ERROR_CODES
  /* 20 */ val INVALID_FILENAME: typings.promiseSftp.mod.ERROR_CODES.INVALID_FILENAME & Double = js.native
  
  @js.native
  sealed trait INVALID_HANDLE
    extends StObject
       with ERROR_CODES
  /* 9 */ val INVALID_HANDLE: typings.promiseSftp.mod.ERROR_CODES.INVALID_HANDLE & Double = js.native
  
  @js.native
  sealed trait INVALID_PARAMETER
    extends StObject
       with ERROR_CODES
  /* 23 */ val INVALID_PARAMETER: typings.promiseSftp.mod.ERROR_CODES.INVALID_PARAMETER & Double = js.native
  
  @js.native
  sealed trait LINK_LOOP
    extends StObject
       with ERROR_CODES
  /* 21 */ val LINK_LOOP: typings.promiseSftp.mod.ERROR_CODES.LINK_LOOP & Double = js.native
  
  @js.native
  sealed trait LOCK_CONFLICT
    extends StObject
       with ERROR_CODES
  /* 17 */ val LOCK_CONFLICT: typings.promiseSftp.mod.ERROR_CODES.LOCK_CONFLICT & Double = js.native
  
  @js.native
  sealed trait NOT_A_DIRECTORY
    extends StObject
       with ERROR_CODES
  /* 19 */ val NOT_A_DIRECTORY: typings.promiseSftp.mod.ERROR_CODES.NOT_A_DIRECTORY & Double = js.native
  
  @js.native
  sealed trait NO_CONNECTION
    extends StObject
       with ERROR_CODES
  /* 6 */ val NO_CONNECTION: typings.promiseSftp.mod.ERROR_CODES.NO_CONNECTION & Double = js.native
  
  @js.native
  sealed trait NO_MATCHING_BYTE_RANGE_LOCK
    extends StObject
       with ERROR_CODES
  /* 31 */ val NO_MATCHING_BYTE_RANGE_LOCK: typings.promiseSftp.mod.ERROR_CODES.NO_MATCHING_BYTE_RANGE_LOCK & Double = js.native
  
  @js.native
  sealed trait NO_MEDIA
    extends StObject
       with ERROR_CODES
  /* 13 */ val NO_MEDIA: typings.promiseSftp.mod.ERROR_CODES.NO_MEDIA & Double = js.native
  
  @js.native
  sealed trait NO_SPACE_ON_FILESYSTEM
    extends StObject
       with ERROR_CODES
  /* 14 */ val NO_SPACE_ON_FILESYSTEM: typings.promiseSftp.mod.ERROR_CODES.NO_SPACE_ON_FILESYSTEM & Double = js.native
  
  @js.native
  sealed trait NO_SUCH_FILE
    extends StObject
       with ERROR_CODES
  /* 2 */ val NO_SUCH_FILE: typings.promiseSftp.mod.ERROR_CODES.NO_SUCH_FILE & Double = js.native
  
  @js.native
  sealed trait NO_SUCH_PATH
    extends StObject
       with ERROR_CODES
  /* 10 */ val NO_SUCH_PATH: typings.promiseSftp.mod.ERROR_CODES.NO_SUCH_PATH & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with ERROR_CODES
  /* 0 */ val OK: typings.promiseSftp.mod.ERROR_CODES.OK & Double = js.native
  
  @js.native
  sealed trait OP_UNSUPPORTED
    extends StObject
       with ERROR_CODES
  /* 8 */ val OP_UNSUPPORTED: typings.promiseSftp.mod.ERROR_CODES.OP_UNSUPPORTED & Double = js.native
  
  @js.native
  sealed trait OWNER_INVALID
    extends StObject
       with ERROR_CODES
  /* 29 */ val OWNER_INVALID: typings.promiseSftp.mod.ERROR_CODES.OWNER_INVALID & Double = js.native
  
  @js.native
  sealed trait PERMISSION_DENIED
    extends StObject
       with ERROR_CODES
  /* 3 */ val PERMISSION_DENIED: typings.promiseSftp.mod.ERROR_CODES.PERMISSION_DENIED & Double = js.native
  
  @js.native
  sealed trait QUOTA_EXCEEDED
    extends StObject
       with ERROR_CODES
  /* 15 */ val QUOTA_EXCEEDED: typings.promiseSftp.mod.ERROR_CODES.QUOTA_EXCEEDED & Double = js.native
  
  @js.native
  sealed trait UNKNOWN_PRINCIPAL
    extends StObject
       with ERROR_CODES
  /* 16 */ val UNKNOWN_PRINCIPAL: typings.promiseSftp.mod.ERROR_CODES.UNKNOWN_PRINCIPAL & Double = js.native
  
  @js.native
  sealed trait WRITE_PROTECT
    extends StObject
       with ERROR_CODES
  /* 12 */ val WRITE_PROTECT: typings.promiseSftp.mod.ERROR_CODES.WRITE_PROTECT & Double = js.native
}

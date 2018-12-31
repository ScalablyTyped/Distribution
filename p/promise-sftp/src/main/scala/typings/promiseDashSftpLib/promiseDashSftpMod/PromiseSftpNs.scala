package typings
package promiseDashSftpLib.promiseDashSftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-sftp", "PromiseSftp")
@js.native
object PromiseSftpNs extends js.Object {
  /** Output of `PromiseSftp#list()` */
  trait DirectoryListing extends js.Object {
    /** The last modified date of the entry. */
    var date: stdLib.Date
    /** The group name or ID that this entry belongs to. *NIX only */
    var group: js.UndefOr[java.lang.String] = js.undefined
    /** The name of the entry. */
    var name: java.lang.String
    /** The user name or ID that this entry belongs to. *NIX only */
    var owner: js.UndefOr[java.lang.String] = js.undefined
    /** The various permissions for this entry. *NIX only */
    var rights: js.UndefOr[promiseDashSftpLib.Anon_Group] = js.undefined
    /** True if the sticky bit is set for this entry */
    var sticky: js.UndefOr[scala.Boolean] = js.undefined
    /** For symlink entries, this is the symlink's target. *NIX only */
    var target: js.UndefOr[java.lang.String] = js.undefined
    /** `d` for directory, `-` for file, and `l` for symlink only on *NIX. */
    var `type`: promiseDashSftpLib.promiseDashSftpLibStrings.d | promiseDashSftpLib.promiseDashSftpLibStrings.`-` | promiseDashSftpLib.promiseDashSftpLibStrings.l
  }
  
  @js.native
  sealed trait ERROR_CODES extends js.Object
  
  /** Options for `PromiseSftp#fast{Get,Put}` */
  trait FastOptions extends js.Object {
    /**
      * Size of each read in bytes
      * @default 32768
      */
    var chunkSize: scala.Double
    /**
      * Number of concurrent reads
      * @default 25
      */
    var concurrency: js.UndefOr[scala.Double] = js.undefined
    /** Called every time a part of a file is transferred */
    var step: js.UndefOr[
        js.Function3[
          /* totalTransferred */ scala.Double, 
          /* chunk */ scala.Double, 
          /* total */ scala.Double, 
          scala.Unit
        ]
      ] = js.undefined
  }
  
  @js.native
  class FtpConnectionError ()
    extends stdLib.Error {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  @js.native
  class FtpReconnectError ()
    extends stdLib.Error {
    def this(disconnectError: java.lang.String) = this()
    def this(disconnectError: stdLib.Error) = this()
    def this(disconnectError: java.lang.String, connectError: java.lang.String) = this()
    def this(disconnectError: java.lang.String, connectError: stdLib.Error) = this()
    def this(disconnectError: stdLib.Error, connectError: java.lang.String) = this()
    def this(disconnectError: stdLib.Error, connectError: stdLib.Error) = this()
    def this(disconnectError: java.lang.String, connectError: java.lang.String, onCwd: scala.Boolean) = this()
    def this(disconnectError: java.lang.String, connectError: stdLib.Error, onCwd: scala.Boolean) = this()
    def this(disconnectError: stdLib.Error, connectError: java.lang.String, onCwd: scala.Boolean) = this()
    def this(disconnectError: stdLib.Error, connectError: stdLib.Error, onCwd: scala.Boolean) = this()
    var connectError: java.lang.String | stdLib.Error = js.native
    var disconnectError: java.lang.String | stdLib.Error = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  @js.native
  sealed trait STATUSES extends js.Object
  
  /** From the [statvfs struct](http://linux.die.net/man/2/statvfs). */
  trait Statvfs extends js.Object {
    /** free blocks for unprivileged users */
    var f_bavail: scala.Double
    /** free blocks */
    var f_bfree: scala.Double
    /** size of fs in f_frsize units */
    var f_blocks: scala.Double
    /** file system block size */
    var f_bsize: scala.Double
    /** free inodes for unprivileged users */
    var f_favail: scala.Double
    /** free inodes */
    var f_ffree: scala.Double
    /** inodes */
    var f_files: scala.Double
    /** mount flags */
    var f_flag: scala.Double
    /** fragment size */
    var f_frsize: scala.Double
    /** file system ID */
    var f_fsid: scala.Double
    /** maximum filename length */
    var f_namemax: scala.Double
  }
  
  @js.native
  object ERROR_CODES extends js.Object {
    @js.native
    sealed trait BAD_MESSAGE
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait BYTE_RANGE_LOCK_CONFLICT
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait BYTE_RANGE_LOCK_REFUSED
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait CANNOT_DELETE
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait CONNECTION_LOST
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait DELETE_PENDING
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait DIR_NOT_EMPTY
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait EOF
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait FAILURE
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait FILE_ALREADY_EXISTS
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait FILE_CORRUPT
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait FILE_IS_A_DIRECTORY
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait GROUP_INVALID
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait INVALID_FILENAME
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait INVALID_HANDLE
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait INVALID_PARAMETER
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait LINK_LOOP
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait LOCK_CONFLICT
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait NOT_A_DIRECTORY
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait NO_CONNECTION
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait NO_MATCHING_BYTE_RANGE_LOCK
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait NO_MEDIA
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait NO_SPACE_ON_FILESYSTEM
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait NO_SUCH_FILE
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait NO_SUCH_PATH
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait OK
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait OP_UNSUPPORTED
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait OWNER_INVALID
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait QUOTA_EXCEEDED
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait UNKNOWN_PRINCIPAL
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
    @js.native
    sealed trait WRITE_PROTECT
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.ERROR_CODES
    
  }
  
  @js.native
  object STATUSES extends js.Object {
    @js.native
    sealed trait CONNECTED
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.STATUSES
    
    @js.native
    sealed trait CONNECTING
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.STATUSES
    
    @js.native
    sealed trait DISCONNECTED
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.STATUSES
    
    @js.native
    sealed trait DISCONNECTING
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.STATUSES
    
    @js.native
    sealed trait LOGGING_OUT
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.STATUSES
    
    @js.native
    sealed trait NOT_YET_CONNECTED
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.STATUSES
    
    @js.native
    sealed trait RECONNECTING
      extends promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.STATUSES
    
    /* "connected" */ val CONNECTED: CONNECTED with java.lang.String = js.native
    /* "connecting" */ val CONNECTING: CONNECTING with java.lang.String = js.native
    /* "disconnected" */ val DISCONNECTED: DISCONNECTED with java.lang.String = js.native
    /* "disconnecting" */ val DISCONNECTING: DISCONNECTING with java.lang.String = js.native
    /* "logging out" */ val LOGGING_OUT: LOGGING_OUT with java.lang.String = js.native
    /* "not yet connected" */ val NOT_YET_CONNECTED: NOT_YET_CONNECTED with java.lang.String = js.native
    /* "reconnecting" */ val RECONNECTING: RECONNECTING with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.STATUSES with java.lang.String
      ] = js.native
  }
  
  /**
    * Options for SftpPromise#connect()
    */
  type Options = ssh2Lib.ssh2Mod.ConnectConfig with promiseDashSftpLib.Anon_ConnTimeout
}


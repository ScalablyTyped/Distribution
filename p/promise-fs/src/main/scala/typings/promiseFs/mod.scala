package typings.promiseFs

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.anon.AutoClose
import typings.node.anon.BaseEncodingOptionsflagOp
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.BaseEncodingOptionsmodeMo
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.BufferBytesWritten
import typings.node.anon.BytesWritten
import typings.node.anon.EmitClose
import typings.node.anon.Encoding
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.Interval
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.Persistent
import typings.node.anon.Recursive
import typings.node.anon.`2`
import typings.node.anon.`3`
import typings.node.fsMod.BaseEncodingOptions
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadSyncOptions
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import typings.node.promisesMod.FileHandle
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.promiseFs.anon.BufferBytesRead
import typings.promiseFs.anon.BufferDataView
import typings.promiseFs.anon.BufferFloat32Array
import typings.promiseFs.anon.BufferFloat64Array
import typings.promiseFs.anon.BufferInt16Array
import typings.promiseFs.anon.BufferInt32Array
import typings.promiseFs.anon.BufferInt8Array
import typings.promiseFs.anon.BufferUint32Array
import typings.promiseFs.anon.BytesRead
import typings.promiseFs.anon.EncodingWithFileTypes
import typings.promiseFs.anon.WithFileTypes
import typings.promiseFs.anon.`0`
import typings.promiseFs.anon.`1`
import typings.promiseFs.anon.`4`
import typings.promiseFs.promiseFsStrings.buffer
import typings.std.DataView
import typings.std.Date
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-fs", "BigIntStats")
  @js.native
  class BigIntStats ()
    extends typings.node.fsMod.BigIntStats
  
  @JSImport("promise-fs", "Dir")
  @js.native
  class Dir ()
    extends typings.node.fsMod.Dir
  
  @JSImport("promise-fs", "Dirent")
  @js.native
  class Dirent ()
    extends typings.node.fsMod.Dirent
  
  @JSImport("promise-fs", "ReadStream")
  @js.native
  class ReadStream ()
    extends typings.node.fsMod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("promise-fs", "Stats")
  @js.native
  class Stats ()
    extends typings.node.fsMod.Stats
  
  @JSImport("promise-fs", "WriteStream")
  @js.native
  class WriteStream ()
    extends typings.node.fsMod.WriteStream {
    def this(opts: WritableOptions) = this()
  }
  
  @JSImport("promise-fs", "access")
  @js.native
  def access(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "access")
  @js.native
  def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "accessSync")
  @js.native
  def accessSync(path: PathLike): Unit = js.native
  @JSImport("promise-fs", "accessSync")
  @js.native
  def accessSync(path: PathLike, mode: Double): Unit = js.native
  
  @JSImport("promise-fs", "appendFile")
  @js.native
  def appendFile(file: Double, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "appendFile")
  @js.native
  def appendFile(file: Double, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "appendFile")
  @js.native
  def appendFile(file: PathLike, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "appendFile")
  @js.native
  def appendFile(file: PathLike, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: Double, data: String): Unit = js.native
  @JSImport("promise-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: Double, data: String, options: WriteFileOptions): Unit = js.native
  @JSImport("promise-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: Double, data: Uint8Array): Unit = js.native
  @JSImport("promise-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: Double, data: Uint8Array, options: WriteFileOptions): Unit = js.native
  @JSImport("promise-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: PathLike, data: String): Unit = js.native
  @JSImport("promise-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  @JSImport("promise-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: PathLike, data: Uint8Array): Unit = js.native
  @JSImport("promise-fs", "appendFileSync")
  @js.native
  def appendFileSync(file: PathLike, data: Uint8Array, options: WriteFileOptions): Unit = js.native
  
  @JSImport("promise-fs", "chmod")
  @js.native
  def chmod(path: PathLike, mode: String): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "chmod")
  @js.native
  def chmod(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "chmodSync")
  @js.native
  def chmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  @JSImport("promise-fs", "chown")
  @js.native
  def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "chownSync")
  @js.native
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("promise-fs", "close")
  @js.native
  def close(fd: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "closeSync")
  @js.native
  def closeSync(fd: Double): Unit = js.native
  
  object constants {
    
    // File Copy Constants
    /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
    @JSImport("promise-fs", "constants.COPYFILE_EXCL")
    @js.native
    val COPYFILE_EXCL: Double = js.native
    
    /**
      * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
      */
    @JSImport("promise-fs", "constants.COPYFILE_FICLONE")
    @js.native
    val COPYFILE_FICLONE: Double = js.native
    
    /**
      * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
      */
    @JSImport("promise-fs", "constants.COPYFILE_FICLONE_FORCE")
    @js.native
    val COPYFILE_FICLONE_FORCE: Double = js.native
    
    // File Access Constants
    /** Constant for fs.access(). File is visible to the calling process. */
    @JSImport("promise-fs", "constants.F_OK")
    @js.native
    val F_OK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
    @JSImport("promise-fs", "constants.O_APPEND")
    @js.native
    val O_APPEND: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
    @JSImport("promise-fs", "constants.O_CREAT")
    @js.native
    val O_CREAT: Double = js.native
    
    /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
    @JSImport("promise-fs", "constants.O_DIRECT")
    @js.native
    val O_DIRECT: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
    @JSImport("promise-fs", "constants.O_DIRECTORY")
    @js.native
    val O_DIRECTORY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
    @JSImport("promise-fs", "constants.O_DSYNC")
    @js.native
    val O_DSYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
    @JSImport("promise-fs", "constants.O_EXCL")
    @js.native
    val O_EXCL: Double = js.native
    
    /**
      * constant for fs.open().
      * Flag indicating reading accesses to the file system will no longer result in
      * an update to the atime information associated with the file.
      * This flag is available on Linux operating systems only.
      */
    @JSImport("promise-fs", "constants.O_NOATIME")
    @js.native
    val O_NOATIME: Double = js.native
    
    /**
      * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
      * opening the path shall not cause that terminal to become the controlling terminal for the process
      * (if the process does not already have one).
      */
    @JSImport("promise-fs", "constants.O_NOCTTY")
    @js.native
    val O_NOCTTY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
    @JSImport("promise-fs", "constants.O_NOFOLLOW")
    @js.native
    val O_NOFOLLOW: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
    @JSImport("promise-fs", "constants.O_NONBLOCK")
    @js.native
    val O_NONBLOCK: Double = js.native
    
    // File Open Constants
    /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
    @JSImport("promise-fs", "constants.O_RDONLY")
    @js.native
    val O_RDONLY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
    @JSImport("promise-fs", "constants.O_RDWR")
    @js.native
    val O_RDWR: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
    @JSImport("promise-fs", "constants.O_SYMLINK")
    @js.native
    val O_SYMLINK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
    @JSImport("promise-fs", "constants.O_SYNC")
    @js.native
    val O_SYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
    @JSImport("promise-fs", "constants.O_TRUNC")
    @js.native
    val O_TRUNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
    @JSImport("promise-fs", "constants.O_WRONLY")
    @js.native
    val O_WRONLY: Double = js.native
    
    /** Constant for fs.access(). File can be read by the calling process. */
    @JSImport("promise-fs", "constants.R_OK")
    @js.native
    val R_OK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
    @JSImport("promise-fs", "constants.S_IFBLK")
    @js.native
    val S_IFBLK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
    @JSImport("promise-fs", "constants.S_IFCHR")
    @js.native
    val S_IFCHR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
    @JSImport("promise-fs", "constants.S_IFDIR")
    @js.native
    val S_IFDIR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
    @JSImport("promise-fs", "constants.S_IFIFO")
    @js.native
    val S_IFIFO: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
    @JSImport("promise-fs", "constants.S_IFLNK")
    @js.native
    val S_IFLNK: Double = js.native
    
    // File Type Constants
    /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
    @JSImport("promise-fs", "constants.S_IFMT")
    @js.native
    val S_IFMT: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
    @JSImport("promise-fs", "constants.S_IFREG")
    @js.native
    val S_IFREG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
    @JSImport("promise-fs", "constants.S_IFSOCK")
    @js.native
    val S_IFSOCK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
    @JSImport("promise-fs", "constants.S_IRGRP")
    @js.native
    val S_IRGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
    @JSImport("promise-fs", "constants.S_IROTH")
    @js.native
    val S_IROTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
    @JSImport("promise-fs", "constants.S_IRUSR")
    @js.native
    val S_IRUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
    @JSImport("promise-fs", "constants.S_IRWXG")
    @js.native
    val S_IRWXG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
    @JSImport("promise-fs", "constants.S_IRWXO")
    @js.native
    val S_IRWXO: Double = js.native
    
    // File Mode Constants
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
    @JSImport("promise-fs", "constants.S_IRWXU")
    @js.native
    val S_IRWXU: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
    @JSImport("promise-fs", "constants.S_IWGRP")
    @js.native
    val S_IWGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
    @JSImport("promise-fs", "constants.S_IWOTH")
    @js.native
    val S_IWOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
    @JSImport("promise-fs", "constants.S_IWUSR")
    @js.native
    val S_IWUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
    @JSImport("promise-fs", "constants.S_IXGRP")
    @js.native
    val S_IXGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
    @JSImport("promise-fs", "constants.S_IXOTH")
    @js.native
    val S_IXOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
    @JSImport("promise-fs", "constants.S_IXUSR")
    @js.native
    val S_IXUSR: Double = js.native
    
    /**
      * When set, a memory file mapping is used to access the file. This flag
      * is available on Windows operating systems only. On other operating systems,
      * this flag is ignored.
      */
    @JSImport("promise-fs", "constants.UV_FS_O_FILEMAP")
    @js.native
    val UV_FS_O_FILEMAP: Double = js.native
    
    /** Constant for fs.access(). File can be written by the calling process. */
    @JSImport("promise-fs", "constants.W_OK")
    @js.native
    val W_OK: Double = js.native
    
    /** Constant for fs.access(). File can be executed by the calling process. */
    @JSImport("promise-fs", "constants.X_OK")
    @js.native
    val X_OK: Double = js.native
  }
  
  @JSImport("promise-fs", "copyFile")
  @js.native
  def copyFile(src: PathLike, dst: PathLike): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "copyFile")
  @js.native
  def copyFile(src: PathLike, dst: PathLike, flags: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "copyFileSync")
  @js.native
  def copyFileSync(src: PathLike, dest: PathLike): Unit = js.native
  @JSImport("promise-fs", "copyFileSync")
  @js.native
  def copyFileSync(src: PathLike, dest: PathLike, flags: Double): Unit = js.native
  
  @JSImport("promise-fs", "createReadStream")
  @js.native
  def createReadStream(path: PathLike): typings.node.fsMod.ReadStream = js.native
  @JSImport("promise-fs", "createReadStream")
  @js.native
  def createReadStream(path: PathLike, options: String): typings.node.fsMod.ReadStream = js.native
  @JSImport("promise-fs", "createReadStream")
  @js.native
  def createReadStream(path: PathLike, options: AutoClose): typings.node.fsMod.ReadStream = js.native
  
  @JSImport("promise-fs", "createWriteStream")
  @js.native
  def createWriteStream(path: PathLike): typings.node.fsMod.WriteStream = js.native
  @JSImport("promise-fs", "createWriteStream")
  @js.native
  def createWriteStream(path: PathLike, options: String): typings.node.fsMod.WriteStream = js.native
  @JSImport("promise-fs", "createWriteStream")
  @js.native
  def createWriteStream(path: PathLike, options: EmitClose): typings.node.fsMod.WriteStream = js.native
  
  @JSImport("promise-fs", "exists")
  @js.native
  def exists(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  
  @JSImport("promise-fs", "existsSync")
  @js.native
  def existsSync(path: PathLike): Boolean = js.native
  
  @JSImport("promise-fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: String): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "fchmodSync")
  @js.native
  def fchmodSync(fd: Double, mode: Mode): Unit = js.native
  
  @JSImport("promise-fs", "fchown")
  @js.native
  def fchown(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "fchownSync")
  @js.native
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("promise-fs", "fdatasync")
  @js.native
  def fdatasync(fd: Double, callback: NoParamCallback): Unit = js.native
  
  @JSImport("promise-fs", "fdatasyncSync")
  @js.native
  def fdatasyncSync(fd: Double): Unit = js.native
  
  @JSImport("promise-fs", "fstat")
  @js.native
  def fstat(fd: Double): js.Promise[typings.node.fsMod.Stats] = js.native
  
  @JSImport("promise-fs", "fstatSync")
  @js.native
  def fstatSync(fd: Double): typings.node.fsMod.Stats = js.native
  
  @JSImport("promise-fs", "fsync")
  @js.native
  def fsync(fd: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "fsyncSync")
  @js.native
  def fsyncSync(fd: Double): Unit = js.native
  
  @JSImport("promise-fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "ftruncate")
  @js.native
  def ftruncate(fd: Double, len: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "ftruncateSync")
  @js.native
  def ftruncateSync(fd: Double): Unit = js.native
  @JSImport("promise-fs", "ftruncateSync")
  @js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  
  @JSImport("promise-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: String, mtime: String): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: String, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: String, mtime: Date): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: String): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Double, mtime: Date): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Date, mtime: String): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Date, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "futimes")
  @js.native
  def futimes(fd: Double, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: String, mtime: String): Unit = js.native
  @JSImport("promise-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: String, mtime: Double): Unit = js.native
  @JSImport("promise-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: String, mtime: Date): Unit = js.native
  @JSImport("promise-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: String): Unit = js.native
  @JSImport("promise-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  @JSImport("promise-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Double, mtime: Date): Unit = js.native
  @JSImport("promise-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Date, mtime: String): Unit = js.native
  @JSImport("promise-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Date, mtime: Double): Unit = js.native
  @JSImport("promise-fs", "futimesSync")
  @js.native
  def futimesSync(fd: Double, atime: Date, mtime: Date): Unit = js.native
  
  @JSImport("promise-fs", "lchmod")
  @js.native
  def lchmod(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = js.native
  
  @JSImport("promise-fs", "lchmodSync")
  @js.native
  def lchmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  @JSImport("promise-fs", "lchown")
  @js.native
  def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "lchownSync")
  @js.native
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("promise-fs", "link")
  @js.native
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "linkSync")
  @js.native
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  
  @JSImport("promise-fs", "lstat")
  @js.native
  def lstat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
  
  @JSImport("promise-fs", "lstatSync")
  @js.native
  def lstatSync(path: PathLike): typings.node.fsMod.Stats = js.native
  
  @JSImport("promise-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: String, mtime: Date, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Double, mtime: Double, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Double, mtime: Date, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Date, mtime: String, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Date, mtime: Double, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Date, mtime: Date, callback: NoParamCallback): Unit = js.native
  
  @JSImport("promise-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  @JSImport("promise-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  @JSImport("promise-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: String, mtime: Date): Unit = js.native
  @JSImport("promise-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  @JSImport("promise-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  @JSImport("promise-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  @JSImport("promise-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Date, mtime: String): Unit = js.native
  @JSImport("promise-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  @JSImport("promise-fs", "lutimesSync")
  @js.native
  def lutimesSync(path: PathLike, atime: Date, mtime: Date): Unit = js.native
  
  @JSImport("promise-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike, options: String): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike, options: Double): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "mkdir")
  @js.native
  def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
  @JSImport("promise-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  @JSImport("promise-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  @JSImport("promise-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  @JSImport("promise-fs", "mkdirSync")
  @js.native
  def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  @JSImport("promise-fs", "mkdirSync")
  @js.native
  def mkdirSync_Unit(path: PathLike): Unit = js.native
  @JSImport("promise-fs", "mkdirSync")
  @js.native
  def mkdirSync_Unit(path: PathLike, options: Mode): Unit = js.native
  
  @JSImport("promise-fs", "mkdtemp")
  @js.native
  def mkdtemp(prefix: String, callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]): Unit = js.native
  @JSImport("promise-fs", "mkdtemp")
  @js.native
  def mkdtemp(
    prefix: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  @JSImport("promise-fs", "mkdtemp")
  @js.native
  def mkdtemp(
    prefix: String,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  @JSImport("promise-fs", "mkdtemp")
  @js.native
  def mkdtemp(
    prefix: String,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  @JSImport("promise-fs", "mkdtemp")
  @js.native
  def mkdtemp(
    prefix: String,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  @JSImport("promise-fs", "mkdtemp")
  @js.native
  def mkdtemp(
    prefix: String,
    options: `2`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("promise-fs", "mkdtemp")
  @js.native
  def mkdtemp(
    prefix: String,
    options: BaseEncodingOptions,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  @JSImport("promise-fs", "mkdtemp")
  @js.native
  def mkdtemp(
    prefix: String,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("promise-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String): String = js.native
  @JSImport("promise-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String, options: String): String | Buffer = js.native
  @JSImport("promise-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String, options: BufferEncoding): String = js.native
  @JSImport("promise-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String, options: BaseEncodingOptions): String = js.native
  @JSImport("promise-fs", "mkdtempSync")
  @js.native
  def mkdtempSync(prefix: String, options: BufferEncodingOption): Buffer = js.native
  @JSImport("promise-fs", "mkdtempSync")
  @js.native
  def mkdtempSync_Union(prefix: String): String | Buffer = js.native
  @JSImport("promise-fs", "mkdtempSync")
  @js.native
  def mkdtempSync_Union(prefix: String, options: BaseEncodingOptions): String | Buffer = js.native
  
  @JSImport("promise-fs", "open")
  @js.native
  def open(path: PathLike, flags: String): js.Promise[Double] = js.native
  @JSImport("promise-fs", "open")
  @js.native
  def open(path: PathLike, flags: String, mode: String): js.Promise[Double] = js.native
  @JSImport("promise-fs", "open")
  @js.native
  def open(path: PathLike, flags: String, mode: Double): js.Promise[Double] = js.native
  @JSImport("promise-fs", "open")
  @js.native
  def open(path: PathLike, flags: Double): js.Promise[Double] = js.native
  @JSImport("promise-fs", "open")
  @js.native
  def open(path: PathLike, flags: Double, mode: String): js.Promise[Double] = js.native
  @JSImport("promise-fs", "open")
  @js.native
  def open(path: PathLike, flags: Double, mode: Double): js.Promise[Double] = js.native
  
  @JSImport("promise-fs", "openSync")
  @js.native
  def openSync(path: PathLike, flags: OpenMode): Double = js.native
  @JSImport("promise-fs", "openSync")
  @js.native
  def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
  
  @JSImport("promise-fs", "opendir")
  @js.native
  def opendir(
    path: String,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]
  ): Unit = js.native
  @JSImport("promise-fs", "opendir")
  @js.native
  def opendir(
    path: String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]
  ): Unit = js.native
  
  @JSImport("promise-fs", "opendirSync")
  @js.native
  def opendirSync(path: String): typings.node.fsMod.Dir = js.native
  @JSImport("promise-fs", "opendirSync")
  @js.native
  def opendirSync(path: String, options: OpenDirOptions): typings.node.fsMod.Dir = js.native
  
  object promises {
    
    /**
      * Asynchronously tests a user's permissions for the file specified by path.
      * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    @JSImport("promise-fs", "promises.access")
    @js.native
    def access(path: PathLike): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.access")
    @js.native
    def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously append data to a file, creating the file if it does not exist.
      * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'a'` is used.
      */
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: Uint8Array): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: PathLike, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: Uint8Array): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.appendFile")
    @js.native
    def appendFile(path: FileHandle, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous chmod(2) - Change permissions of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    @JSImport("promise-fs", "promises.chmod")
    @js.native
    def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous chown(2) - Change ownership of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("promise-fs", "promises.chown")
    @js.native
    def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it already exists.
      * Node.js makes no guarantees about the atomicity of the copy operation.
      * If an error occurs after the destination file has been opened for writing, Node.js will attempt
      * to remove the destination.
      * @param src A path to the source file.
      * @param dest A path to the destination file.
      * @param flags An optional integer that specifies the behavior of the copy operation. The only
      * supported flag is `fs.constants.COPYFILE_EXCL`, which causes the copy operation to fail if
      * `dest` already exists.
      */
    @JSImport("promise-fs", "promises.copyFile")
    @js.native
    def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.copyFile")
    @js.native
    def copyFile(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchmod(2) - Change permissions of a file.
      * @param handle A `FileHandle`.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    @JSImport("promise-fs", "promises.fchmod")
    @js.native
    def fchmod(handle: FileHandle, mode: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchown(2) - Change ownership of a file.
      * @param handle A `FileHandle`.
      */
    @JSImport("promise-fs", "promises.fchown")
    @js.native
    def fchown(handle: FileHandle, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
      * @param handle A `FileHandle`.
      */
    @JSImport("promise-fs", "promises.fdatasync")
    @js.native
    def fdatasync(handle: FileHandle): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fstat(2) - Get file status.
      * @param handle A `FileHandle`.
      */
    @JSImport("promise-fs", "promises.fstat")
    @js.native
    def fstat(handle: FileHandle): js.Promise[typings.node.fsMod.Stats] = js.native
    
    /**
      * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
      * @param handle A `FileHandle`.
      */
    @JSImport("promise-fs", "promises.fsync")
    @js.native
    def fsync(handle: FileHandle): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous ftruncate(2) - Truncate a file to a specified length.
      * @param handle A `FileHandle`.
      * @param len If not specified, defaults to `0`.
      */
    @JSImport("promise-fs", "promises.ftruncate")
    @js.native
    def ftruncate(handle: FileHandle): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.ftruncate")
    @js.native
    def ftruncate(handle: FileHandle, len: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    @JSImport("promise-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: String, mtime: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: String, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: String, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Double, mtime: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Date, mtime: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.futimes")
    @js.native
    def futimes(handle: FileHandle, atime: Date, mtime: Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    @JSImport("promise-fs", "promises.lchmod")
    @js.native
    def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("promise-fs", "promises.lchown")
    @js.native
    def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
      * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("promise-fs", "promises.link")
    @js.native
    def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("promise-fs", "promises.lstat")
    @js.native
    def lstat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
    
    /**
      * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`,
      * with the difference that if the path refers to a symbolic link, then the link is not
      * dereferenced: instead, the timestamps of the symbolic link itself are changed.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    @JSImport("promise-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.lutimes")
    @js.native
    def lutimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    @JSImport("promise-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike): js.Promise[Unit] = js.native
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    @JSImport("promise-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
    @JSImport("promise-fs", "promises.mkdir")
    @js.native
    def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("promise-fs", "promises.mkdtemp")
    @js.native
    def mkdtemp(prefix: String): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.mkdtemp")
    @js.native
    def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.mkdtemp")
    @js.native
    def mkdtemp(prefix: String, options: BaseEncodingOptions): js.Promise[String] = js.native
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("promise-fs", "promises.mkdtemp")
    @js.native
    def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous open(2) - open and possibly create a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not
      * supplied, defaults to `0o666`.
      */
    @JSImport("promise-fs", "promises.open")
    @js.native
    def open(path: PathLike, flags: String): js.Promise[FileHandle] = js.native
    @JSImport("promise-fs", "promises.open")
    @js.native
    def open(path: PathLike, flags: String, mode: Mode): js.Promise[FileHandle] = js.native
    @JSImport("promise-fs", "promises.open")
    @js.native
    def open(path: PathLike, flags: Double): js.Promise[FileHandle] = js.native
    @JSImport("promise-fs", "promises.open")
    @js.native
    def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = js.native
    
    @JSImport("promise-fs", "promises.opendir")
    @js.native
    def opendir(path: String): js.Promise[typings.node.fsMod.Dir] = js.native
    @JSImport("promise-fs", "promises.opendir")
    @js.native
    def opendir(path: String, options: OpenDirOptions): js.Promise[typings.node.fsMod.Dir] = js.native
    
    /**
      * Asynchronously reads data from the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The offset in the buffer at which to start writing.
      * @param length The number of bytes to read.
      * @param position The offset from the beginning of the file from which data should be read. If
      * `null`, data will be read from the current position.
      */
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Double,
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Null,
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Double,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Null,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.read")
    @js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike): js.Promise[Buffer] = js.native
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike, options: EncodingFlag): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: PathLike, options: Flag): js.Promise[Buffer] = js.native
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle): js.Promise[Buffer] = js.native
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = js.native
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle, options: EncodingFlag): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.readFile")
    @js.native
    def readFile(path: FileHandle, options: Flag): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("promise-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
    @JSImport("promise-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
    @JSImport("promise-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike, options: BaseEncodingOptionswithFi): js.Promise[js.Array[String]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
      */
    @JSImport("promise-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Promise[js.Array[typings.node.fsMod.Dirent]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("promise-fs", "promises.readdir")
    @js.native
    def readdir(path: PathLike, options: Encoding): js.Promise[js.Array[Buffer]] = js.native
    @JSImport("promise-fs", "promises.readdir")
    @js.native
    def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
    
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("promise-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    @JSImport("promise-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = js.native
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("promise-fs", "promises.readlink")
    @js.native
    def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("promise-fs", "promises.realpath")
    @js.native
    def realpath(path: PathLike): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.realpath")
    @js.native
    def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSImport("promise-fs", "promises.realpath")
    @js.native
    def realpath(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = js.native
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSImport("promise-fs", "promises.realpath")
    @js.native
    def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    
    /**
      * Asynchronous rename(2) - Change the name or location of a file or directory.
      * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    @JSImport("promise-fs", "promises.rename")
    @js.native
    def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously removes files and directories (modeled on the standard POSIX `rm` utility).
      */
    @JSImport("promise-fs", "promises.rm")
    @js.native
    def rm(path: PathLike): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.rm")
    @js.native
    def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous rmdir(2) - delete a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("promise-fs", "promises.rmdir")
    @js.native
    def rmdir(path: PathLike): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.rmdir")
    @js.native
    def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous stat(2) - Get file status.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("promise-fs", "promises.stat")
    @js.native
    def stat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
    
    /**
      * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
      * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
      * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
      * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
      * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
      */
    @JSImport("promise-fs", "promises.symlink")
    @js.native
    def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.symlink")
    @js.native
    def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous truncate(2) - Truncate a file to a specified length.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param len If not specified, defaults to `0`.
      */
    @JSImport("promise-fs", "promises.truncate")
    @js.native
    def truncate(path: PathLike): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.truncate")
    @js.native
    def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    @JSImport("promise-fs", "promises.unlink")
    @js.native
    def unlink(path: PathLike): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied path.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    @JSImport("promise-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.utimes")
    @js.native
    def utimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously writes `string` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param string A string to write.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      * @param encoding The expected string encoding.
      */
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String): js.Promise[BufferBytesWritten] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String, position: Double): js.Promise[BufferBytesWritten] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String, position: Double, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write(handle: FileHandle, string: String, position: Null, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    /**
      * Asynchronously writes `buffer` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
      * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      */
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Double,
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: js.UndefOr[scala.Nothing],
      length: Null,
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Double,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](
      handle: FileHandle,
      buffer: TBuffer,
      offset: Null,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    @JSImport("promise-fs", "promises.write")
    @js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists.
      * It is unsafe to call `fsPromises.writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'w'` is used.
      */
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: Uint8Array): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: PathLike, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: String): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: Uint8Array): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    @JSImport("promise-fs", "promises.writeFile")
    @js.native
    def writeFile(path: FileHandle, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  }
  
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[BufferDataView] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataView] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[BufferInt16Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[BufferInt32Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[BufferInt8Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[BufferBytesRead] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferBytesRead] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[BufferUint32Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint32Array] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[typings.promiseFs.anon.Buffer] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[typings.promiseFs.anon.Buffer] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[BytesRead] = js.native
  @JSImport("promise-fs", "read")
  @js.native
  def read(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[BytesRead] = js.native
  
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: Double): js.Promise[Buffer] = js.native
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: Double, options: String): js.Promise[String] = js.native
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: Double, options: typings.promiseFs.anon.Encoding): js.Promise[Buffer] = js.native
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: Double, options: typings.promiseFs.anon.EncodingFlag): js.Promise[String | Buffer] = js.native
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: Double, options: typings.promiseFs.anon.Flag): js.Promise[String] = js.native
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: PathLike): js.Promise[Buffer] = js.native
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: PathLike, options: String): js.Promise[String] = js.native
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: PathLike, options: typings.promiseFs.anon.Encoding): js.Promise[Buffer] = js.native
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: PathLike, options: typings.promiseFs.anon.EncodingFlag): js.Promise[String | Buffer] = js.native
  @JSImport("promise-fs", "readFile")
  @js.native
  def readFile(path: PathLike, options: typings.promiseFs.anon.Flag): js.Promise[String] = js.native
  
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double): String | Buffer = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double, options: BufferEncoding): String = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double, options: EncodingBufferEncoding): String = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: Double, options: `3`): Buffer = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike): String | Buffer = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike, options: BufferEncoding): String = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync(path: PathLike, options: `3`): Buffer = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync_Buffer(path: Double): Buffer = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync_Buffer(path: PathLike): Buffer = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = js.native
  @JSImport("promise-fs", "readFileSync")
  @js.native
  def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = js.native
  
  @JSImport("promise-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  @JSImport("promise-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  @JSImport("promise-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  @JSImport("promise-fs", "readSync")
  @js.native
  def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = js.native
  
  @JSImport("promise-fs", "readdir")
  @js.native
  def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
  @JSImport("promise-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: String): js.Promise[js.Array[Buffer | String]] = js.native
  @JSImport("promise-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  @JSImport("promise-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: EncodingWithFileTypes): js.Promise[js.Array[Buffer]] = js.native
  @JSImport("promise-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: WithFileTypes): js.Promise[js.Array[String]] = js.native
  @JSImport("promise-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: `0`): js.Promise[js.Array[Buffer | String]] = js.native
  @JSImport("promise-fs", "readdir")
  @js.native
  def readdir(path: PathLike, options: `1`): js.Promise[js.Array[typings.node.fsMod.Dirent]] = js.native
  
  @JSImport("promise-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike): js.Array[String] = js.native
  @JSImport("promise-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSImport("promise-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
  @JSImport("promise-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[typings.node.fsMod.Dirent] = js.native
  @JSImport("promise-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
  @JSImport("promise-fs", "readdirSync")
  @js.native
  def readdirSync(path: PathLike, options: typings.node.anon.WithFileTypes): js.Array[String] = js.native
  @JSImport("promise-fs", "readdirSync")
  @js.native
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  
  @JSImport("promise-fs", "readdir")
  @js.native
  def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
  
  @JSImport("promise-fs", "readlink")
  @js.native
  def readlink(path: PathLike): js.Promise[String] = js.native
  @JSImport("promise-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  @JSImport("promise-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSImport("promise-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: typings.promiseFs.anon.`2`): js.Promise[String] = js.native
  @JSImport("promise-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: typings.promiseFs.anon.`3`): js.Promise[Buffer] = js.native
  @JSImport("promise-fs", "readlink")
  @js.native
  def readlink(path: PathLike, options: `4`): js.Promise[String | Buffer] = js.native
  
  @JSImport("promise-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike): String = js.native
  @JSImport("promise-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: String): String | Buffer = js.native
  @JSImport("promise-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: BufferEncoding): String = js.native
  @JSImport("promise-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: BaseEncodingOptions): String = js.native
  @JSImport("promise-fs", "readlinkSync")
  @js.native
  def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  @JSImport("promise-fs", "readlinkSync")
  @js.native
  def readlinkSync_Union(path: PathLike): String | Buffer = js.native
  @JSImport("promise-fs", "readlinkSync")
  @js.native
  def readlinkSync_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  
  @JSImport("promise-fs", "readlink")
  @js.native
  def readlink_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  
  @JSImport("promise-fs", "readv")
  @js.native
  def readv(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  @JSImport("promise-fs", "readv")
  @js.native
  def readv(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("promise-fs", "readvSync")
  @js.native
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  @JSImport("promise-fs", "readvSync")
  @js.native
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
  
  @JSImport("promise-fs", "realpath")
  @js.native
  def realpath(path: PathLike): js.Promise[String] = js.native
  @JSImport("promise-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  @JSImport("promise-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSImport("promise-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: typings.promiseFs.anon.`2`): js.Promise[String] = js.native
  @JSImport("promise-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: typings.promiseFs.anon.`3`): js.Promise[Buffer] = js.native
  @JSImport("promise-fs", "realpath")
  @js.native
  def realpath(path: PathLike, options: `4`): js.Promise[String | Buffer] = js.native
  
  object realpathSync {
    
    @JSImport("promise-fs", "realpathSync")
    @js.native
    def apply(path: PathLike): String = js.native
    @JSImport("promise-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: String): String | Buffer = js.native
    @JSImport("promise-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: BufferEncoding): String = js.native
    @JSImport("promise-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: BaseEncodingOptions): String = js.native
    @JSImport("promise-fs", "realpathSync")
    @js.native
    def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    
    @JSImport("promise-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike): String = js.native
    @JSImport("promise-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: String): String | Buffer = js.native
    @JSImport("promise-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: BufferEncoding): String = js.native
    @JSImport("promise-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: BaseEncodingOptions): String = js.native
    @JSImport("promise-fs", "realpathSync.native")
    @js.native
    def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    @JSImport("promise-fs", "realpathSync.native")
    @js.native
    def native_Union(path: PathLike): String | Buffer = js.native
    @JSImport("promise-fs", "realpathSync.native")
    @js.native
    def native_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  }
  
  @JSImport("promise-fs", "realpath")
  @js.native
  def realpath_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  
  @JSImport("promise-fs", "rename")
  @js.native
  def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "renameSync")
  @js.native
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  
  @JSImport("promise-fs", "rm")
  @js.native
  def rm(path: PathLike, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "rm")
  @js.native
  def rm(path: PathLike, options: RmOptions, callback: NoParamCallback): Unit = js.native
  
  @JSImport("promise-fs", "rmSync")
  @js.native
  def rmSync(path: PathLike): Unit = js.native
  @JSImport("promise-fs", "rmSync")
  @js.native
  def rmSync(path: PathLike, options: RmOptions): Unit = js.native
  
  @JSImport("promise-fs", "rmdir")
  @js.native
  def rmdir(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "rmdir")
  @js.native
  def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "rmdirSync")
  @js.native
  def rmdirSync(path: PathLike): Unit = js.native
  @JSImport("promise-fs", "rmdirSync")
  @js.native
  def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
  
  @JSImport("promise-fs", "stat")
  @js.native
  def stat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
  
  @JSImport("promise-fs", "statSync")
  @js.native
  def statSync(path: PathLike): typings.node.fsMod.Stats = js.native
  @JSImport("promise-fs", "statSync")
  @js.native
  def statSync(path: PathLike, options: BigIntOptions): typings.node.fsMod.BigIntStats = js.native
  @JSImport("promise-fs", "statSync")
  @js.native
  def statSync(path: PathLike, options: StatOptions): typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats = js.native
  
  object symlink {
    
    @JSImport("promise-fs", "symlink")
    @js.native
    def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
    @JSImport("promise-fs", "symlink")
    @js.native
    def apply(target: PathLike, path: PathLike, `type`: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
    @JSImport("promise-fs", "symlink")
    @js.native
    def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
    @JSImport("promise-fs", "symlink")
    @js.native
    def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
  }
  
  @JSImport("promise-fs", "symlinkSync")
  @js.native
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  @JSImport("promise-fs", "symlinkSync")
  @js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  
  @JSImport("promise-fs", "truncate")
  @js.native
  def truncate(path: PathLike, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "truncate")
  @js.native
  def truncate(path: PathLike, len: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "truncate")
  @js.native
  def truncate(path: PathLike, len: Double, callback: NoParamCallback): Unit = js.native
  @JSImport("promise-fs", "truncate")
  @js.native
  def truncate(path: PathLike, len: Null, callback: NoParamCallback): Unit = js.native
  
  @JSImport("promise-fs", "truncateSync")
  @js.native
  def truncateSync(path: PathLike): Unit = js.native
  @JSImport("promise-fs", "truncateSync")
  @js.native
  def truncateSync(path: PathLike, len: Double): Unit = js.native
  
  @JSImport("promise-fs", "unlink")
  @js.native
  def unlink(path: PathLike): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "unlinkSync")
  @js.native
  def unlinkSync(path: PathLike): Unit = js.native
  
  @JSImport("promise-fs", "unwatchFile")
  @js.native
  def unwatchFile(filename: PathLike): Unit = js.native
  @JSImport("promise-fs", "unwatchFile")
  @js.native
  def unwatchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  
  @JSImport("promise-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "utimes")
  @js.native
  def utimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  @JSImport("promise-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  @JSImport("promise-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: String, mtime: Date): Unit = js.native
  @JSImport("promise-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  @JSImport("promise-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  @JSImport("promise-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  @JSImport("promise-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Date, mtime: String): Unit = js.native
  @JSImport("promise-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  @JSImport("promise-fs", "utimesSync")
  @js.native
  def utimesSync(path: PathLike, atime: Date, mtime: Date): Unit = js.native
  
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(filename: PathLike): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(filename: PathLike, options: String): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: String,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(filename: PathLike, options: Persistent): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: Persistent,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(filename: PathLike, options: Recursive): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch(
    filename: PathLike,
    options: Recursive,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  
  @JSImport("promise-fs", "watchFile")
  @js.native
  def watchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  @JSImport("promise-fs", "watchFile")
  @js.native
  def watchFile(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  @JSImport("promise-fs", "watchFile")
  @js.native
  def watchFile(
    filename: PathLike,
    options: Interval,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  
  @JSImport("promise-fs", "watch")
  @js.native
  def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
  @JSImport("promise-fs", "watch")
  @js.native
  def watch_buffer(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  
  @JSImport("promise-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any): js.Promise[typings.promiseFs.anon.BufferBytesWritten] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any, position: js.UndefOr[scala.Nothing], encoding: String): js.Promise[typings.promiseFs.anon.BufferBytesWritten] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any, position: Double): js.Promise[typings.promiseFs.anon.BufferBytesWritten] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any, position: Double, encoding: String): js.Promise[typings.promiseFs.anon.BufferBytesWritten] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write(fd: Double, string: js.Any, position: Null, encoding: String): js.Promise[typings.promiseFs.anon.BufferBytesWritten] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](
    fd: Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: Double, length: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](
    fd: Double,
    buffer: js.UndefOr[scala.Nothing],
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double, length: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  @JSImport("promise-fs", "write")
  @js.native
  def write[TBuffer /* <: ArrayBufferView */](fd: Double, buffer: js.UndefOr[scala.Nothing], offset: Double, length: Double, position: Double): js.Promise[typings.promiseFs.anon.BytesWritten[TBuffer]] = js.native
  
  @JSImport("promise-fs", "writeFile")
  @js.native
  def writeFile(path: Double, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "writeFile")
  @js.native
  def writeFile(path: Double, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "writeFile")
  @js.native
  def writeFile(path: PathLike, data: js.Any): js.Promise[Unit] = js.native
  @JSImport("promise-fs", "writeFile")
  @js.native
  def writeFile(path: PathLike, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  
  @JSImport("promise-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: Double, data: String): Unit = js.native
  @JSImport("promise-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: Double, data: String, options: WriteFileOptions): Unit = js.native
  @JSImport("promise-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: Double, data: ArrayBufferView): Unit = js.native
  @JSImport("promise-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  @JSImport("promise-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: String): Unit = js.native
  @JSImport("promise-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  @JSImport("promise-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: ArrayBufferView): Unit = js.native
  @JSImport("promise-fs", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    position: Double
  ): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(
    fd: Double,
    buffer: ArrayBufferView,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: Double): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
  @JSImport("promise-fs", "writeSync")
  @js.native
  def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
  
  @JSImport("promise-fs", "writev")
  @js.native
  def writev(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  @JSImport("promise-fs", "writev")
  @js.native
  def writev(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("promise-fs", "writevSync")
  @js.native
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  @JSImport("promise-fs", "writevSync")
  @js.native
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
}

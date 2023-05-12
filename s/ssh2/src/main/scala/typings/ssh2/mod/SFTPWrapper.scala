package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.EventEmitter
import typings.ssh2.ssh2Strings.CLOSE
import typings.ssh2.ssh2Strings.EXTENDED
import typings.ssh2.ssh2Strings.FSETSTAT
import typings.ssh2.ssh2Strings.FSTAT
import typings.ssh2.ssh2Strings.LSTAT
import typings.ssh2.ssh2Strings.MKDIR
import typings.ssh2.ssh2Strings.OPEN
import typings.ssh2.ssh2Strings.OPENDIR
import typings.ssh2.ssh2Strings.READ
import typings.ssh2.ssh2Strings.READDIR
import typings.ssh2.ssh2Strings.READLINK
import typings.ssh2.ssh2Strings.REALPATH
import typings.ssh2.ssh2Strings.REMOVE
import typings.ssh2.ssh2Strings.RENAME
import typings.ssh2.ssh2Strings.RMDIR
import typings.ssh2.ssh2Strings.SETSTAT
import typings.ssh2.ssh2Strings.STAT
import typings.ssh2.ssh2Strings.SYMLINK
import typings.ssh2.ssh2Strings.WRITE
import typings.ssh2.ssh2Strings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFTPWrapper extends EventEmitter {
  
  /**
    * (Client-only)
    * Appends data to a file
    */
  def appendFile(remotePath: String, data: String): Unit = js.native
  def appendFile(remotePath: String, data: String, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Appends data to a file
    */
  def appendFile(remotePath: String, data: String, options: WriteFileOptions): Unit = js.native
  def appendFile(remotePath: String, data: String, options: WriteFileOptions, callback: Callback): Unit = js.native
  def appendFile(remotePath: String, data: Buffer): Unit = js.native
  def appendFile(remotePath: String, data: Buffer, callback: Callback): Unit = js.native
  def appendFile(remotePath: String, data: Buffer, options: WriteFileOptions): Unit = js.native
  def appendFile(remotePath: String, data: Buffer, options: WriteFileOptions, callback: Callback): Unit = js.native
  
  /**
    * Sends an attrs response for the request identified by id.
    */
  def attrs(reqId: Double, attrs: Attributes): Unit = js.native
  
  def chmod(path: String, mode: String, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Sets the mode for `path`.
    */
  def chmod(path: String, mode: Double, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Sets the owner for `path`.
    */
  def chown(path: String, uid: Double, gid: Double, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Closes the resource associated with `handle` given by `open()` or `opendir()`.
    */
  def close(handle: Buffer, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Returns a new readable stream for `path`.
    */
  def createReadStream(path: String): ReadStream = js.native
  def createReadStream(path: String, options: ReadStreamOptions): ReadStream = js.native
  
  /**
    * (Client-only)
    * Returns a new writable stream for `path`.
    */
  def createWriteStream(path: String): WriteStream = js.native
  def createWriteStream(path: String, options: WriteStreamOptions): WriteStream = js.native
  
  def data(reqId: Double, data: String): Unit = js.native
  def data(reqId: Double, data: String, encoding: BufferEncoding): Unit = js.native
  /**
    * Sends a data response for the request identified by id. data can be a Buffer or string.
    * If data is a string, encoding is the encoding of data.
    */
  def data(reqId: Double, data: Buffer): Unit = js.native
  def data(reqId: Double, data: Buffer, encoding: BufferEncoding): Unit = js.native
  
  /**
    * Closes the channel.
    */
  def destroy(): Unit = js.native
  
  /**
    * Closes the channel.
    */
  def end(): Unit = js.native
  
  /**
    * (Client-only)
    * `path` exists.
    */
  def exists(path: String, callback: js.Function1[/* hasError */ Boolean, Unit]): Unit = js.native
  
  /**
    * (Client-only)
    * Performs a remote file copy. If length is 0, then the server will read from srcHandle until EOF is reached.
    */
  def ext_copy_data(
    handle: Buffer,
    srcOffset: Double,
    len: Double,
    dstHandle: Buffer,
    dstOffset: Double,
    callback: Callback
  ): Unit = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Similar to realpath(), but supports tilde-expansion, i.e. "~", "~/..." and "~user/...". These paths are expanded using shell-like rules.
    */
  def ext_openssh_expandPath(path: String, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* absPath */ String, Unit]): Unit = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX fstatvfs(2) on open handle `handle`.
    */
  def ext_openssh_fstatvfs(handle: Buffer, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* fsInfo */ Any, Unit]): Unit = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX fsync(3) on the open handle `handle`.
    */
  def ext_openssh_fsync(handle: Buffer, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* fsInfo */ Any, Unit]): Unit = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX link(2) to create a hard link to `targetPath` at `linkPath`.
    */
  def ext_openssh_hardlink(targetPath: String, linkPath: String, callback: Callback): Unit = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Similar to setstat(), but instead sets attributes on symlinks.
    */
  def ext_openssh_lsetstat(path: String, attrs: InputAttributes, callback: Callback): Unit = js.native
  def ext_openssh_lsetstat(path: String, callback: Callback): Unit = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX rename(3) from `srcPath` to `destPath`.
    */
  def ext_openssh_rename(srcPath: String, destPath: String, callback: Callback): Unit = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX statvfs(2) on `path`.
    */
  def ext_openssh_statvfs(path: String, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* fsInfo */ Any, Unit]): Unit = js.native
  
  /**
    * (Client-only)
    * Downloads a file at `remotePath` to `localPath` using parallel reads for faster throughput.
    */
  def fastGet(remotePath: String, localPath: String, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Downloads a file at `remotePath` to `localPath` using parallel reads for faster throughput.
    */
  def fastGet(remotePath: String, localPath: String, options: TransferOptions, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Uploads a file from `localPath` to `remotePath` using parallel reads for faster throughput.
    */
  def fastPut(localPath: String, remotePath: String, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Uploads a file from `localPath` to `remotePath` using parallel reads for faster throughput.
    */
  def fastPut(localPath: String, remotePath: String, options: TransferOptions, callback: Callback): Unit = js.native
  
  def fchmod(handle: Buffer, mode: String, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Sets the mode for the resource associated with `handle`.
    */
  def fchmod(handle: Buffer, mode: Double, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Sets the owner for the resource associated with `handle`.
    */
  def fchown(handle: Buffer, uid: Double, gid: Double, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Sets the attributes defined in `attributes` for the resource associated with `handle`.
    */
  def fsetstat(handle: Buffer, attributes: InputAttributes, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Retrieves attributes for the resource associated with `handle`.
    */
  def fstat(handle: Buffer, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* stats */ Stats, Unit]): Unit = js.native
  
  def futimes(handle: Buffer, atime: js.Date, mtime: js.Date, callback: Callback): Unit = js.native
  def futimes(handle: Buffer, atime: js.Date, mtime: Double, callback: Callback): Unit = js.native
  def futimes(handle: Buffer, atime: Double, mtime: js.Date, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Sets the access time and modified time for the resource associated with `handle`.
    */
  def futimes(handle: Buffer, atime: Double, mtime: Double, callback: Callback): Unit = js.native
  
  /**
    * Sends a handle response for the request identified by id.
    * handle must be less than 256 bytes and is an opaque value that could merely contain the value of a
    * backing file descriptor or some other unique, custom value.
    */
  def handle(reqId: Double, handle: Buffer): Unit = js.native
  
  /**
    * (Client-only)
    * Retrieves attributes for `path`. If `path` is a symlink, the link itself is stat'ed
    * instead of the resource it refers to.
    */
  def lstat(path: String, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* stats */ Stats, Unit]): Unit = js.native
  
  /**
    * (Client-only)
    * Creates a new directory `path`.
    */
  def mkdir(path: String, attributes: InputAttributes, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Creates a new directory `path`.
    */
  def mkdir(path: String, callback: Callback): Unit = js.native
  
  /**
    * Sends a name response for the request identified by id.
    */
  def name(reqId: Double, names: js.Array[FileEntry]): Unit = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_CLOSE(event: CLOSE, listener: js.Function2[/* reqId */ Double, /* handle */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_EXTENDED(
    event: EXTENDED,
    listener: js.Function3[/* reqId */ Double, /* extName */ String, /* extData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_FSETSTAT(
    event: FSETSTAT,
    listener: js.Function3[/* reqId */ Double, /* handle */ Buffer, /* attrs */ Attributes, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_FSTAT(event: FSTAT, listener: js.Function2[/* reqId */ Double, /* handle */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_LSTAT(event: LSTAT, listener: js.Function2[/* reqId */ Double, /* path */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_MKDIR(
    event: MKDIR,
    listener: js.Function3[/* reqId */ Double, /* path */ String, /* attrs */ Attributes, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_OPEN(
    event: OPEN,
    listener: js.Function4[
      /* reqId */ Double, 
      /* filename */ String, 
      /* flags */ Double, 
      /* attrs */ Attributes, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_OPENDIR(event: OPENDIR, listener: js.Function2[/* reqId */ Double, /* path */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_READ(
    event: READ,
    listener: js.Function4[/* reqId */ Double, /* handle */ Buffer, /* offset */ Double, /* len */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_READDIR(event: READDIR, listener: js.Function2[/* reqId */ Double, /* handle */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_READLINK(event: READLINK, listener: js.Function2[/* reqId */ Double, /* path */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_REALPATH(event: REALPATH, listener: js.Function2[/* reqId */ Double, /* path */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_REMOVE(event: REMOVE, listener: js.Function2[/* reqId */ Double, /* path */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_RENAME(
    event: RENAME,
    listener: js.Function3[/* reqId */ Double, /* oldPath */ String, /* newPath */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_RMDIR(event: RMDIR, listener: js.Function2[/* reqId */ Double, /* path */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_SETSTAT(
    event: SETSTAT,
    listener: js.Function3[/* reqId */ Double, /* path */ String, /* attrs */ Attributes, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_STAT(event: STAT, listener: js.Function2[/* reqId */ Double, /* path */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_SYMLINK(
    event: SYMLINK,
    listener: js.Function3[/* reqId */ Double, /* targetPath */ String, /* linkPath */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_WRITE(
    event: WRITE,
    listener: js.Function4[/* reqId */ Double, /* handle */ Buffer, /* offset */ Double, /* data */ Buffer, Unit]
  ): this.type = js.native
  /**
    * Emitted after initial protocol version check has passed
    */
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  def open(
    filename: String,
    mode: Double,
    attributes: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  def open(
    filename: String,
    mode: Double,
    attributes: Double,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  /**
    * (Client-only)
    * Opens a file `filename` for `mode` with optional `attributes`.
    */
  def open(
    filename: String,
    mode: Double,
    attributes: InputAttributes,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  /**
    * (Client-only)
    * Opens a file `filename` for `mode`.
    */
  def open(
    filename: String,
    mode: Double,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  def open(
    filename: String,
    mode: OpenMode,
    attributes: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  def open(
    filename: String,
    mode: OpenMode,
    attributes: Double,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  def open(
    filename: String,
    mode: OpenMode,
    attributes: InputAttributes,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  def open(
    filename: String,
    mode: OpenMode,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * (Client-only)
    * Opens a directory `path`.
    */
  def opendir(path: String, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]): Unit = js.native
  
  /**
    * (Client-only)
    * Reads `length` bytes from the resource associated with `handle` starting at `position`
    * and stores the bytes in `buffer` starting at `offset`.
    */
  def read(
    handle: Buffer,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function4[
      /* err */ js.UndefOr[js.Error], 
      /* bytesRead */ Double, 
      /* buffer */ Buffer, 
      /* position */ Double, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * (Client-only)
    * Reads a file in memory and returns its contents
    */
  def readFile(
    remotePath: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  /**
    * (Client-only)
    * Reads a file in memory and returns its contents
    */
  def readFile(
    remotePath: String,
    encoding: BufferEncoding,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  /**
    * (Client-only)
    * Reads a file in memory and returns its contents
    */
  def readFile(
    remotePath: String,
    options: ReadFileOptions,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* handle */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * (Client-only)
    * Retrieves a directory listing.
    */
  def readdir(
    location: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* list */ js.Array[FileEntry], Unit]
  ): Unit = js.native
  def readdir(
    location: Buffer,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* list */ js.Array[FileEntry], Unit]
  ): Unit = js.native
  
  /**
    * (Client-only)
    * Retrieves the target for a symlink at `path`.
    */
  def readlink(path: String, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* target */ String, Unit]): Unit = js.native
  
  /**
    * (Client-only)
    * Resolves `path` to an absolute path.
    */
  def realpath(path: String, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* absPath */ String, Unit]): Unit = js.native
  
  /**
    * (Client-only)
    * Renames/moves `srcPath` to `destPath`.
    */
  def rename(srcPath: String, destPath: String, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Removes the directory at `path`.
    */
  def rmdir(path: String, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Sets the attributes defined in `attributes` for `path`.
    */
  def setstat(path: String, attributes: InputAttributes, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Retrieves attributes for `path`.
    */
  def stat(path: String, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* stats */ Stats, Unit]): Unit = js.native
  
  /**
    * Sends a status response for the request identified by id.
    */
  def status(reqId: Double, code: Double): Unit = js.native
  def status(reqId: Double, code: Double, message: String): Unit = js.native
  
  /**
    * (Client-only)
    * Creates a symlink at `linkPath` to `targetPath`.
    */
  def symlink(targetPath: String, linkPath: String, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    * Removes the file/symlink at `path`.
    */
  def unlink(path: String, callback: Callback): Unit = js.native
  
  def utimes(path: String, atime: js.Date, mtime: js.Date, callback: Callback): Unit = js.native
  def utimes(path: String, atime: js.Date, mtime: Double, callback: Callback): Unit = js.native
  def utimes(path: String, atime: Double, mtime: js.Date, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Sets the access time and modified time for `path`.
    */
  def utimes(path: String, atime: Double, mtime: Double, callback: Callback): Unit = js.native
  
  /**
    * (Client-only)
    */
  def write(
    handle: Buffer,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: Callback
  ): Unit = js.native
  
  /**
    * (Client-only)
    * Writes data to a file
    */
  def writeFile(remotePath: String, data: String): Unit = js.native
  def writeFile(remotePath: String, data: String, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Writes data to a file
    */
  def writeFile(remotePath: String, data: String, encoding: String): Unit = js.native
  def writeFile(remotePath: String, data: String, encoding: String, callback: Callback): Unit = js.native
  /**
    * (Client-only)
    * Writes data to a file
    */
  def writeFile(remotePath: String, data: String, options: WriteFileOptions): Unit = js.native
  def writeFile(remotePath: String, data: String, options: WriteFileOptions, callback: Callback): Unit = js.native
  def writeFile(remotePath: String, data: Buffer): Unit = js.native
  def writeFile(remotePath: String, data: Buffer, callback: Callback): Unit = js.native
  def writeFile(remotePath: String, data: Buffer, encoding: String): Unit = js.native
  def writeFile(remotePath: String, data: Buffer, encoding: String, callback: Callback): Unit = js.native
  def writeFile(remotePath: String, data: Buffer, options: WriteFileOptions): Unit = js.native
  def writeFile(remotePath: String, data: Buffer, options: WriteFileOptions, callback: Callback): Unit = js.native
}

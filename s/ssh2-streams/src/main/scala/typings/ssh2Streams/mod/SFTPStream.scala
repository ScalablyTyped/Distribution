package typings.ssh2Streams.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.streamMod.Writable
import typings.ssh2Streams.ssh2StreamsStrings.CLOSE
import typings.ssh2Streams.ssh2StreamsStrings.FSETSTAT
import typings.ssh2Streams.ssh2StreamsStrings.FSTAT
import typings.ssh2Streams.ssh2StreamsStrings.LSTAT
import typings.ssh2Streams.ssh2StreamsStrings.MKDIR
import typings.ssh2Streams.ssh2StreamsStrings.OPEN
import typings.ssh2Streams.ssh2StreamsStrings.OPENDIR
import typings.ssh2Streams.ssh2StreamsStrings.READ
import typings.ssh2Streams.ssh2StreamsStrings.READDIR
import typings.ssh2Streams.ssh2StreamsStrings.READLINK
import typings.ssh2Streams.ssh2StreamsStrings.REALPATH
import typings.ssh2Streams.ssh2StreamsStrings.REMOVE
import typings.ssh2Streams.ssh2StreamsStrings.RENAME
import typings.ssh2Streams.ssh2StreamsStrings.RMDIR
import typings.ssh2Streams.ssh2StreamsStrings.SETSTAT
import typings.ssh2Streams.ssh2StreamsStrings.STAT
import typings.ssh2Streams.ssh2StreamsStrings.SYMLINK
import typings.ssh2Streams.ssh2StreamsStrings.WRITE
import typings.ssh2Streams.ssh2StreamsStrings.close_
import typings.ssh2Streams.ssh2StreamsStrings.continue
import typings.ssh2Streams.ssh2StreamsStrings.end
import typings.ssh2Streams.ssh2StreamsStrings.error
import typings.ssh2Streams.ssh2StreamsStrings.ready
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2-streams", "SFTPStream")
@js.native
/**
  * Creates and returns a new SFTPStream instance.
  */
class SFTPStream () extends Transform {
  def this(cfg: SFTPStreamConfig) = this()
  /**
    * Creates and returns a new SFTPStream instance.
    */
  def this(remoteIdentRaw: String) = this()
  def this(cfg: Unit, remoteIdentRaw: String) = this()
  def this(cfg: SFTPStreamConfig, remoteIdentRaw: String) = this()
  
  /**
    * (Server-only)
    * Sends an attrs response for the request identified by `id`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def attrs(reqID: Double, attrs: Attributes): Boolean = js.native
  
  def chmod(path: String, mode: String, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  /**
    * (Client-only)
    * Sets the mode for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def chmod(path: String, mode: Double, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Sets the owner for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def chown(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Closes the resource associated with `handle` given by `open()` or `opendir()`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def close(handle: Buffer, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Returns a new readable stream for `path`.
    */
  def createReadStream(path: String): Readable = js.native
  def createReadStream(path: String, options: ReadStreamOptions): Readable = js.native
  
  /**
    * (Client-only)
    * Returns a new writable stream for `path`.
    */
  def createWriteStream(path: String): Writable = js.native
  def createWriteStream(path: String, options: WriteStreamOptions): Writable = js.native
  
  /**
    * (Server-only)
    * Sends a data response for the request identified by `id`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def data(reqID: Double, data: String): Boolean = js.native
  def data(reqID: Double, data: String, encoding: String): Boolean = js.native
  def data(reqID: Double, data: Buffer): Boolean = js.native
  def data(reqID: Double, data: Buffer, encoding: String): Boolean = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX fstatvfs(2) on open handle `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_fstatvfs(handle: Buffer, callback: js.Function2[/* err */ js.Any, /* fsInfo */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX fsync(3) on the open handle `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_fsync(handle: Buffer, callback: js.Function2[/* err */ js.Any, /* fsInfo */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX link(2) to create a hard link to `targetPath` at `linkPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_hardlink(targetPath: String, linkPath: String, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX rename(3) from `srcPath` to `destPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_rename(srcPath: String, destPath: String, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX statvfs(2) on `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_statvfs(path: String, callback: js.Function2[/* err */ js.Any, /* fsInfo */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Downloads a file at `remotePath` to `localPath` using parallel reads for faster throughput.
    */
  def fastGet(remotePath: String, localPath: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * (Client-only)
    * Downloads a file at `remotePath` to `localPath` using parallel reads for faster throughput.
    */
  def fastGet(
    remotePath: String,
    localPath: String,
    options: TransferOptions,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * (Client-only)
    * Uploads a file from `localPath` to `remotePath` using parallel reads for faster throughput.
    */
  def fastPut(localPath: String, remotePath: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * (Client-only)
    * Uploads a file from `localPath` to `remotePath` using parallel reads for faster throughput.
    */
  def fastPut(
    localPath: String,
    remotePath: String,
    options: TransferOptions,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  
  def fchmod(handle: Buffer, mode: String, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  /**
    * (Client-only)
    * Sets the mode for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def fchmod(handle: Buffer, mode: Double, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Sets the owner for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def fchown(handle: Buffer, uid: Double, gid: Double, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Sets the attributes defined in `attributes` for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def fsetstat(handle: Buffer, attributes: InputAttributes, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Retrieves attributes for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def fstat(handle: Buffer, callback: js.Function2[/* err */ js.Any, /* stats */ Stats, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Sets the access time and modified time for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def futimes(handle: Buffer, atime: Double, mtime: Double, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  def futimes(handle: Buffer, atime: Double, mtime: Date, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  def futimes(handle: Buffer, atime: Date, mtime: Double, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  def futimes(handle: Buffer, atime: Date, mtime: Date, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Server-only)
    * Sends a handle response for the request identified by `id`.
    *
    * @param handle A handle must be less than 256 bytes and is an opaque value that could
    *          merely contain the value of a backing file descriptor or some other unique,
    *          custom value.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def handle(reqID: Double, handle: Buffer): Boolean = js.native
  
  /**
    * (Client-only)
    * Retrieves attributes for `path`. If `path` is a symlink, the link itself is stat'ed
    * instead of the resource it refers to.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def lstat(path: String, callback: js.Function2[/* err */ js.Any, /* stats */ Stats, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Creates a new directory `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def mkdir(path: String, attributes: InputAttributes, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  /**
    * (Client-only)
    * Creates a new directory `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def mkdir(path: String, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Server-only)
    * Sends a name response for the request identified by `id`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def name(reqID: Double, names: js.Array[FileEntry]): Boolean = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to close a handle.
    *
    * Respond with:
    * * `status()` - Use this to indicate success (`STATUS_CODE.OK`) or failure of the closing of the file identified by `handle`.
    */
  @JSName("on")
  def on_CLOSE(event: CLOSE, listener: js.Function2[/* reqID */ Double, /* handle */ Buffer, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to write attributes for the resource associated with `handle`.
    *
    * Respond with:
    * * `status()` - Use this to indicates success/failure of the setting of the given file/directory attributes.
    */
  @JSName("on")
  def on_FSETSTAT(
    event: FSETSTAT,
    listener: js.Function3[/* reqID */ Double, /* handle */ Buffer, /* attrs */ InputAttributes, Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests attributes for the resource associated with `handle`.
    *
    * Respond with:
    * * `attrs()` - Use this to send the attributes for the requested file/directory back to the client.
    * * `status()` - Use this to indicate an error occurred while accessing the file/directory.
    */
  @JSName("on")
  def on_FSTAT(event: FSTAT, listener: js.Function2[/* reqID */ Double, /* handle */ Buffer, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests attributes for a path. If `path` is a symlink, the
    * link itself should stat'ed instead of the resource it refers to.
    *
    * Respond with:
    * * `attrs()` - Use this to send the attributes for the requested file/directory back to the client.
    * * `status()` - Use this to indicate an error occurred while accessing the file/directory.
    */
  @JSName("on")
  def on_LSTAT(event: LSTAT, listener: js.Function2[/* reqID */ Double, /* path */ String, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests a new directory be created.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the creation of the directory at `path`.
    */
  @JSName("on")
  def on_MKDIR(
    event: MKDIR,
    listener: js.Function3[/* reqID */ Double, /* path */ String, /* attrs */ InputAttributes, Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to open a file.
    *
    * Respond with:
    * * `handle()` - This indicates a successful opening of the file and passes the given handle back to the client to use to refer to this open file for future operations (e.g. reading, writing, closing).
    * * `status()` - Use this to indicate a failure to open the requested file.
    */
  @JSName("on")
  def on_OPEN(
    event: OPEN,
    listener: js.Function4[
      /* reqID */ Double, 
      /* filename */ String, 
      /* flags */ Double, 
      /* attrs */ InputAttributes, 
      Unit
    ]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to open a directory.
    *
    * Respond with:
    * * `handle()` - This indicates a successful opening of the directory and passes the given handle back to the client to use to refer to this open directory for future operations (e.g. reading directory contents, closing).
    * * `status()` - Use this to indicate a failure to open the requested directory.
    */
  @JSName("on")
  def on_OPENDIR(event: OPENDIR, listener: js.Function2[/* reqID */ Double, /* path */ String, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to read data from a file handle.
    *
    * Respond with:
    * * `data()` - Use this to send the requested chunk of data back to the client. The amount of data sent is allowed to be less than the `length` requested.
    * * `status()` - Use this to indicate either end of file (`STATUS_CODE.EOF`) has been reached (`offset` is past the end of the file) or if an error occurred while reading the requested part of the file.
    */
  @JSName("on")
  def on_READ(
    event: READ,
    listener: js.Function4[/* reqID */ Double, /* handle */ Buffer, /* offset */ Double, /* length */ Double, Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to read the contents of a directory.
    *
    * Respond with:
    * * `name()` - Use this to send one or more directory listings for the open directory back to the client.
    * * `status()` - Use this to indicate either end of directory contents (`STATUS_CODE.EOF`) or if an error occurred while reading the directory contents.
    */
  @JSName("on")
  def on_READDIR(event: READDIR, listener: js.Function2[/* reqID */ Double, /* handle */ Buffer, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests the target for a symlink at `path`.
    *
    * Respond with:
    * * `name()` - Use this to respond with the target of the symlink at `path`. No file/directory attributes are required to be sent in this response.
    * * `status()` - Use this to indicate a failure in reading the symlink at `path`.
    */
  @JSName("on")
  def on_READLINK(event: READLINK, listener: js.Function2[/* reqID */ Double, /* path */ String, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests the absolute path for a path.
    *
    * Respond with:
    * * `name()` - Use this to respond with a normalized version of `path`. No file/directory attributes are required to be sent in this response.
    * * `status()` - Use this to indicate a failure in normalizing `path`.
    */
  @JSName("on")
  def on_REALPATH(event: REALPATH, listener: js.Function2[/* reqID */ Double, /* path */ String, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to delete a file or symlink.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the removal of the file at `path`.
    */
  @JSName("on")
  def on_REMOVE(event: REMOVE, listener: js.Function2[/* reqID */ Double, /* path */ String, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests a path be renamed.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the renaming of the file/directory at `oldPath` to `newPath`.
    */
  @JSName("on")
  def on_RENAME(
    event: RENAME,
    listener: js.Function3[/* reqID */ Double, /* oldPath */ String, /* newPath */ String, Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to remove a directory.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the removal of the directory at `path`.
    */
  @JSName("on")
  def on_RMDIR(event: RMDIR, listener: js.Function2[/* reqID */ Double, /* path */ String, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to set the attributes defined in `attrs` for `path`.
    *
    * Respond with:
    * * `status()` - Use this to indicates success/failure of the setting of the given file/directory attributes.
    */
  @JSName("on")
  def on_SETSTAT(
    event: SETSTAT,
    listener: js.Function3[/* reqID */ Double, /* path */ String, /* attrs */ InputAttributes, Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests attributes for a path.
    *
    * Respond with:
    * * `attrs()` - Use this to send the attributes for the requested file/directory back to the client.
    * * `status()` - Use this to indicate an error occurred while accessing the file/directory.
    */
  @JSName("on")
  def on_STAT(event: STAT, listener: js.Function2[/* reqID */ Double, /* path */ String, Unit]): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests a new symlink be created for a path.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the symlink creation.
    */
  @JSName("on")
  def on_SYMLINK(
    event: SYMLINK,
    listener: js.Function3[/* reqID */ Double, /* linkPath */ String, /* targetPath */ String, Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to write data to a file handle.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the write to the file.
    */
  @JSName("on")
  def on_WRITE(
    event: WRITE,
    listener: js.Function4[/* reqID */ Double, /* handle */ Buffer, /* offset */ Double, /* data */ Buffer, Unit]
  ): this.type = js.native
  /**
    * Emitted when the client socket was closed.
    */
  @JSName("on")
  def on_close(event: close_, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when more requests/data can be sent to the stream.
    */
  @JSName("on")
  def on_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the socket has disconnected.
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when an error occurred.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * (Client/Server)
    * Emitted after initial protocol version check has passed.
    */
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * (Client-only)
    * Opens a file `filename` for `mode` with optional `attributes`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def open(
    filename: String,
    mode: String,
    attributes: InputAttributes,
    callback: js.Function2[/* err */ js.Any, /* handle */ Buffer, Unit]
  ): Boolean = js.native
  /**
    * (Client-only)
    * Opens a file `filename` for `mode`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def open(
    filename: String,
    mode: String,
    callback: js.Function2[/* err */ js.Any, /* handle */ Buffer, Unit]
  ): Boolean = js.native
  
  /**
    * (Client-only)
    * Opens a directory `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def opendir(path: String, callback: js.Function2[/* err */ js.Any, /* handle */ Buffer, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Reads `length` bytes from the resource associated with `handle` starting at `position`
    * and stores the bytes in `buffer` starting at `offset`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def readData(
    handle: Buffer,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function4[
      /* err */ js.Any, 
      /* bytesRead */ Double, 
      /* buffer */ Buffer, 
      /* position */ Double, 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * (Client-only)
    * Reads a file in memory and returns its contents
    */
  def readFile(remotePath: String, callback: js.Function2[/* err */ js.Any, /* handle */ Buffer, Unit]): Unit = js.native
  /**
    * (Client-only)
    * Reads a file in memory and returns its contents
    */
  def readFile(
    remotePath: String,
    encoding: String,
    callback: js.Function2[/* err */ js.Any, /* handle */ Buffer, Unit]
  ): Unit = js.native
  /**
    * (Client-only)
    * Reads a file in memory and returns its contents
    */
  def readFile(
    remotePath: String,
    options: ReadFileOptions,
    callback: js.Function2[/* err */ js.Any, /* handle */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * (Client-only)
    * Retrieves a directory listing.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def readdir(location: String, callback: js.Function2[/* err */ js.Any, /* list */ js.Array[FileEntry], Unit]): Boolean = js.native
  def readdir(location: Buffer, callback: js.Function2[/* err */ js.Any, /* list */ js.Array[FileEntry], Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Retrieves the target for a symlink at `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def readlink(path: String, callback: js.Function2[/* err */ js.Any, /* target */ String, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Resolves `path` to an absolute path.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def realpath(path: String, callback: js.Function2[/* err */ js.Any, /* absPath */ String, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Renames/moves `srcPath` to `destPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def rename(srcPath: String, destPath: String, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Removes the directory at `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def rmdir(path: String, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Sets the attributes defined in `attributes` for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def setstat(path: String, attributes: InputAttributes, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Retrieves attributes for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def stat(path: String, callback: js.Function2[/* err */ js.Any, /* stats */ Stats, Unit]): Boolean = js.native
  
  /**
    * (Server-only)
    * Sends a status response for the request identified by `id`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def status(reqID: Double, statusCode: Double): Boolean = js.native
  def status(reqID: Double, statusCode: Double, message: String): Boolean = js.native
  
  /**
    * (Client-only)
    * Creates a symlink at `linkPath` to `targetPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def symlink(targetPath: String, linkPath: String, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Removes the file/symlink at `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def unlink(path: String, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Sets the access time and modified time for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def utimes(path: String, atime: Double, mtime: Double, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  def utimes(path: String, atime: Double, mtime: Date, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  def utimes(path: String, atime: Date, mtime: Double, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  def utimes(path: String, atime: Date, mtime: Date, callback: js.Function1[/* err */ js.Any, Unit]): Boolean = js.native
  
  /**
    * (Client-only)
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def writeData(
    handle: Buffer,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): Boolean = js.native
}
/* static members */
object SFTPStream {
  
  @JSImport("ssh2-streams", "SFTPStream")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait OPEN_MODE extends StObject
  @JSImport("ssh2-streams", "SFTPStream.OPEN_MODE")
  @js.native
  object OPEN_MODE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OPEN_MODE & Double] = js.native
    
    @js.native
    sealed trait APPEND
      extends StObject
         with OPEN_MODE
    /* 0x00000004 */ val APPEND: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.APPEND & Double = js.native
    
    @js.native
    sealed trait CREAT
      extends StObject
         with OPEN_MODE
    /* 0x00000008 */ val CREAT: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.CREAT & Double = js.native
    
    @js.native
    sealed trait EXCL
      extends StObject
         with OPEN_MODE
    /* 0x00000020 */ val EXCL: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.EXCL & Double = js.native
    
    @js.native
    sealed trait READ
      extends StObject
         with OPEN_MODE
    /* 0x00000001 */ val READ: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.READ & Double = js.native
    
    @js.native
    sealed trait TRUNC
      extends StObject
         with OPEN_MODE
    /* 0x00000010 */ val TRUNC: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.TRUNC & Double = js.native
    
    @js.native
    sealed trait WRITE
      extends StObject
         with OPEN_MODE
    /* 0x00000002 */ val WRITE: typings.ssh2Streams.mod.SFTPStream.OPEN_MODE.WRITE & Double = js.native
  }
  
  @js.native
  sealed trait STATUS_CODE extends StObject
  @JSImport("ssh2-streams", "SFTPStream.STATUS_CODE")
  @js.native
  object STATUS_CODE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[STATUS_CODE & Double] = js.native
    
    @js.native
    sealed trait BAD_MESSAGE
      extends StObject
         with STATUS_CODE
    /* 5 */ val BAD_MESSAGE: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.BAD_MESSAGE & Double = js.native
    
    @js.native
    sealed trait CONNECTION_LOST
      extends StObject
         with STATUS_CODE
    /* 7 */ val CONNECTION_LOST: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.CONNECTION_LOST & Double = js.native
    
    @js.native
    sealed trait EOF
      extends StObject
         with STATUS_CODE
    /* 1 */ val EOF: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.EOF & Double = js.native
    
    @js.native
    sealed trait FAILURE
      extends StObject
         with STATUS_CODE
    /* 4 */ val FAILURE: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.FAILURE & Double = js.native
    
    @js.native
    sealed trait NO_CONNECTION
      extends StObject
         with STATUS_CODE
    /* 6 */ val NO_CONNECTION: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.NO_CONNECTION & Double = js.native
    
    @js.native
    sealed trait NO_SUCH_FILE
      extends StObject
         with STATUS_CODE
    /* 2 */ val NO_SUCH_FILE: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.NO_SUCH_FILE & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with STATUS_CODE
    /* 0 */ val OK: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.OK & Double = js.native
    
    @js.native
    sealed trait OP_UNSUPPORTED
      extends StObject
         with STATUS_CODE
    /* 8 */ val OP_UNSUPPORTED: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.OP_UNSUPPORTED & Double = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends StObject
         with STATUS_CODE
    /* 3 */ val PERMISSION_DENIED: typings.ssh2Streams.mod.SFTPStream.STATUS_CODE.PERMISSION_DENIED & Double = js.native
  }
  
  /**
    * Converts flag mask (e.g. number containing `SFTPStream.OPEN_MODE` values) to the
    * appropriate string value.
    *
    * Returns `null` if conversion failed.
    */
  inline def flagsToString(flagsMask: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("flagsToString")(flagsMask.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts string flags (e.g. `'r'`, `'a+'`, etc.) to the appropriate
    * `SFTPStream.OPEN_MODE` flag mask.
    *
    * Returns `null` if conversion failed.
    */
  inline def stringToFlags(flagsStr: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToFlags")(flagsStr.asInstanceOf[js.Any]).asInstanceOf[Double]
}

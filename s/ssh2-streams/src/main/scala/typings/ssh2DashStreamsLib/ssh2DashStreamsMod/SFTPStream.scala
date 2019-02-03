package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2-streams", "SFTPStream")
@js.native
/**
  * Creates and returns a new SFTPStream instance.
  */
class SFTPStream ()
  extends nodeLib.streamMod.Transform {
  def this(cfg: SFTPStreamConfig) = this()
  /**
    * Creates and returns a new SFTPStream instance.
    */
  def this(remoteIdentRaw: java.lang.String) = this()
  def this(cfg: SFTPStreamConfig, remoteIdentRaw: java.lang.String) = this()
  /**
    * (Server-only)
    * Sends an attrs response for the request identified by `id`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def attrs(reqID: scala.Double, attrs: Attributes): scala.Boolean = js.native
  def chmod(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Sets the mode for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def chmod(path: java.lang.String, mode: scala.Double, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Sets the owner for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def chown(
    path: java.lang.String,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Closes the resource associated with `handle` given by `open()` or `opendir()`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def close(handle: nodeLib.Buffer, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Returns a new readable stream for `path`.
    */
  def createReadStream(path: java.lang.String): nodeLib.streamMod.Readable = js.native
  def createReadStream(path: java.lang.String, options: ReadStreamOptions): nodeLib.streamMod.Readable = js.native
  /**
    * (Client-only)
    * Returns a new writable stream for `path`.
    */
  def createWriteStream(path: java.lang.String): nodeLib.streamMod.Writable = js.native
  def createWriteStream(path: java.lang.String, options: WriteStreamOptions): nodeLib.streamMod.Writable = js.native
  /**
    * (Server-only)
    * Sends a data response for the request identified by `id`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def data(reqID: scala.Double, data: java.lang.String): scala.Boolean = js.native
  def data(reqID: scala.Double, data: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def data(reqID: scala.Double, data: nodeLib.Buffer): scala.Boolean = js.native
  def data(reqID: scala.Double, data: nodeLib.Buffer, encoding: java.lang.String): scala.Boolean = js.native
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX fstatvfs(2) on open handle `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_fstatvfs(handle: nodeLib.Buffer, callback: js.Function2[/* err */ js.Any, /* fsInfo */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX fsync(3) on the open handle `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_fsync(handle: nodeLib.Buffer, callback: js.Function2[/* err */ js.Any, /* fsInfo */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX link(2) to create a hard link to `targetPath` at `linkPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_hardlink(
    targetPath: java.lang.String,
    linkPath: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX rename(3) from `srcPath` to `destPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_rename(
    srcPath: java.lang.String,
    destPath: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only, OpenSSH extension)
    * Performs POSIX statvfs(2) on `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def ext_openssh_statvfs(path: java.lang.String, callback: js.Function2[/* err */ js.Any, /* fsInfo */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Downloads a file at `remotePath` to `localPath` using parallel reads for faster throughput.
    */
  def fastGet(
    remotePath: java.lang.String,
    localPath: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * (Client-only)
    * Downloads a file at `remotePath` to `localPath` using parallel reads for faster throughput.
    */
  def fastGet(
    remotePath: java.lang.String,
    localPath: java.lang.String,
    options: TransferOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * (Client-only)
    * Uploads a file from `localPath` to `remotePath` using parallel reads for faster throughput.
    */
  def fastPut(
    localPath: java.lang.String,
    remotePath: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * (Client-only)
    * Uploads a file from `localPath` to `remotePath` using parallel reads for faster throughput.
    */
  def fastPut(
    localPath: java.lang.String,
    remotePath: java.lang.String,
    options: TransferOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def fchmod(
    handle: nodeLib.Buffer,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Sets the mode for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def fchmod(handle: nodeLib.Buffer, mode: scala.Double, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Sets the owner for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def fchown(
    handle: nodeLib.Buffer,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Sets the attributes defined in `attributes` for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def fsetstat(
    handle: nodeLib.Buffer,
    attributes: InputAttributes,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Retrieves attributes for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def fstat(handle: nodeLib.Buffer, callback: js.Function2[/* err */ js.Any, /* stats */ Stats, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Sets the access time and modified time for the resource associated with `handle`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def futimes(
    handle: nodeLib.Buffer,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  def futimes(
    handle: nodeLib.Buffer,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  def futimes(
    handle: nodeLib.Buffer,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  def futimes(
    handle: nodeLib.Buffer,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
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
  def handle(reqID: scala.Double, handle: nodeLib.Buffer): scala.Boolean = js.native
  /**
    * (Client-only)
    * Retrieves attributes for `path`. If `path` is a symlink, the link itself is stat'ed
    * instead of the resource it refers to.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def lstat(path: java.lang.String, callback: js.Function2[/* err */ js.Any, /* stats */ Stats, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Creates a new directory `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def mkdir(
    path: java.lang.String,
    attributes: InputAttributes,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Creates a new directory `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def mkdir(path: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * (Server-only)
    * Sends a name response for the request identified by `id`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def name(reqID: scala.Double, names: js.Array[FileEntry]): scala.Boolean = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to close a handle.
    *
    * Respond with:
    * * `status()` - Use this to indicate success (`STATUS_CODE.OK`) or failure of the closing of the file identified by `handle`.
    */
  @JSName("on")
  def on_CLOSE(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.CLOSE,
    listener: js.Function2[/* reqID */ scala.Double, /* handle */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to write attributes for the resource associated with `handle`.
    *
    * Respond with:
    * * `status()` - Use this to indicates success/failure of the setting of the given file/directory attributes.
    */
  @JSName("on")
  def on_FSETSTAT(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.FSETSTAT,
    listener: js.Function3[
      /* reqID */ scala.Double, 
      /* handle */ nodeLib.Buffer, 
      /* attrs */ InputAttributes, 
      scala.Unit
    ]
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
  def on_FSTAT(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.FSTAT,
    listener: js.Function2[/* reqID */ scala.Double, /* handle */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
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
  def on_LSTAT(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.LSTAT,
    listener: js.Function2[/* reqID */ scala.Double, /* path */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests a new directory be created.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the creation of the directory at `path`.
    */
  @JSName("on")
  def on_MKDIR(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.MKDIR,
    listener: js.Function3[
      /* reqID */ scala.Double, 
      /* path */ java.lang.String, 
      /* attrs */ InputAttributes, 
      scala.Unit
    ]
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
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.OPEN,
    listener: js.Function4[
      /* reqID */ scala.Double, 
      /* filename */ java.lang.String, 
      /* flags */ scala.Double, 
      /* attrs */ InputAttributes, 
      scala.Unit
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
  def on_OPENDIR(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.OPENDIR,
    listener: js.Function2[/* reqID */ scala.Double, /* path */ java.lang.String, scala.Unit]
  ): this.type = js.native
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
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.READ,
    listener: js.Function4[
      /* reqID */ scala.Double, 
      /* handle */ nodeLib.Buffer, 
      /* offset */ scala.Double, 
      /* length */ scala.Double, 
      scala.Unit
    ]
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
  def on_READDIR(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.READDIR,
    listener: js.Function2[/* reqID */ scala.Double, /* handle */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests the target for a symlink at `path`.
    *
    * Respond with:
    * * `name()` - Use this to respond with the target of the symlink at `path`. No file/directory attributes are required to be sent in this response.
    * * `status()` - Use this to indicate a failure in reading the symlink at `path`.
    */
  @JSName("on")
  def on_READLINK(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.READLINK,
    listener: js.Function2[/* reqID */ scala.Double, /* path */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests the absolute path for a path.
    *
    * Respond with:
    * * `name()` - Use this to respond with a normalized version of `path`. No file/directory attributes are required to be sent in this response.
    * * `status()` - Use this to indicate a failure in normalizing `path`.
    */
  @JSName("on")
  def on_REALPATH(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.REALPATH,
    listener: js.Function2[/* reqID */ scala.Double, /* path */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to delete a file or symlink.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the removal of the file at `path`.
    */
  @JSName("on")
  def on_REMOVE(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.REMOVE,
    listener: js.Function2[/* reqID */ scala.Double, /* path */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests a path be renamed.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the renaming of the file/directory at `oldPath` to `newPath`.
    */
  @JSName("on")
  def on_RENAME(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.RENAME,
    listener: js.Function3[
      /* reqID */ scala.Double, 
      /* oldPath */ java.lang.String, 
      /* newPath */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to remove a directory.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the removal of the directory at `path`.
    */
  @JSName("on")
  def on_RMDIR(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.RMDIR,
    listener: js.Function2[/* reqID */ scala.Double, /* path */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests to set the attributes defined in `attrs` for `path`.
    *
    * Respond with:
    * * `status()` - Use this to indicates success/failure of the setting of the given file/directory attributes.
    */
  @JSName("on")
  def on_SETSTAT(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.SETSTAT,
    listener: js.Function3[
      /* reqID */ scala.Double, 
      /* path */ java.lang.String, 
      /* attrs */ InputAttributes, 
      scala.Unit
    ]
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
  def on_STAT(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.STAT,
    listener: js.Function2[/* reqID */ scala.Double, /* path */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * (Server-only)
    * Emitted when the client requests a new symlink be created for a path.
    *
    * Respond with:
    * * `status()` - Use this to indicate success/failure of the symlink creation.
    */
  @JSName("on")
  def on_SYMLINK(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.SYMLINK,
    listener: js.Function3[
      /* reqID */ scala.Double, 
      /* linkPath */ java.lang.String, 
      /* targetPath */ java.lang.String, 
      scala.Unit
    ]
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
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.WRITE,
    listener: js.Function4[
      /* reqID */ scala.Double, 
      /* handle */ nodeLib.Buffer, 
      /* offset */ scala.Double, 
      /* data */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client socket was closed.
    */
  @JSName("on")
  def on_close(event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when more requests/data can be sent to the stream.
    */
  @JSName("on")
  def on_continue(event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.continue, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when the socket has disconnected.
    */
  @JSName("on")
  def on_end(event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted when an error occurred.
    */
  @JSName("on")
  def on_error(
    event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.error,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * (Client/Server)
    * Emitted after initial protocol version check has passed.
    */
  @JSName("on")
  def on_ready(event: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * (Client-only)
    * Opens a file `filename` for `mode` with optional `attributes`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def open(
    filename: java.lang.String,
    mode: java.lang.String,
    attributes: InputAttributes,
    callback: js.Function2[/* err */ js.Any, /* handle */ nodeLib.Buffer, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Opens a file `filename` for `mode`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def open(
    filename: java.lang.String,
    mode: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* handle */ nodeLib.Buffer, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Opens a directory `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def opendir(
    path: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* handle */ nodeLib.Buffer, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Reads `length` bytes from the resource associated with `handle` starting at `position`
    * and stores the bytes in `buffer` starting at `offset`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def readData(
    handle: nodeLib.Buffer,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function4[
      /* err */ js.Any, 
      /* bytesRead */ scala.Double, 
      /* buffer */ nodeLib.Buffer, 
      /* position */ scala.Double, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Reads a file in memory and returns its contents
    */
  def readFile(
    remotePath: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* handle */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * (Client-only)
    * Reads a file in memory and returns its contents
    */
  def readFile(
    remotePath: java.lang.String,
    encoding: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* handle */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * (Client-only)
    * Reads a file in memory and returns its contents
    */
  def readFile(
    remotePath: java.lang.String,
    options: ReadFileOptions,
    callback: js.Function2[/* err */ js.Any, /* handle */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * (Client-only)
    * Retrieves a directory listing.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def readdir(
    location: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* list */ js.Array[FileEntry], scala.Unit]
  ): scala.Boolean = js.native
  def readdir(
    location: nodeLib.Buffer,
    callback: js.Function2[/* err */ js.Any, /* list */ js.Array[FileEntry], scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Retrieves the target for a symlink at `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def readlink(
    path: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* target */ java.lang.String, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Resolves `path` to an absolute path.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def realpath(
    path: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* absPath */ java.lang.String, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Renames/moves `srcPath` to `destPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def rename(
    srcPath: java.lang.String,
    destPath: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Removes the directory at `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def rmdir(path: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Sets the attributes defined in `attributes` for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def setstat(
    path: java.lang.String,
    attributes: InputAttributes,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Retrieves attributes for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def stat(path: java.lang.String, callback: js.Function2[/* err */ js.Any, /* stats */ Stats, scala.Unit]): scala.Boolean = js.native
  /**
    * (Server-only)
    * Sends a status response for the request identified by `id`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def status(reqID: scala.Double, statusCode: scala.Double): scala.Boolean = js.native
  def status(reqID: scala.Double, statusCode: scala.Double, message: java.lang.String): scala.Boolean = js.native
  /**
    * (Client-only)
    * Creates a symlink at `linkPath` to `targetPath`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def symlink(
    targetPath: java.lang.String,
    linkPath: java.lang.String,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Removes the file/symlink at `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def unlink(path: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  /**
    * (Client-only)
    * Sets the access time and modified time for `path`.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def utimes(
    path: java.lang.String,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  def utimes(
    path: java.lang.String,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  def utimes(
    path: java.lang.String,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  def utimes(
    path: java.lang.String,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
    * (Client-only)
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def writeData(
    handle: nodeLib.Buffer,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
}

/* static members */
@JSImport("ssh2-streams", "SFTPStream")
@js.native
object SFTPStream extends js.Object {
  /**
    * Converts flag mask (e.g. number containing `SFTPStream.OPEN_MODE` values) to the
    * appropriate string value.
    *
    * Returns `null` if conversion failed.
    */
  def flagsToString(flagsMask: scala.Double): java.lang.String = js.native
  /**
    * Converts string flags (e.g. `'r'`, `'a+'`, etc.) to the appropriate
    * `SFTPStream.OPEN_MODE` flag mask.
    *
    * Returns `null` if conversion failed.
    */
  def stringToFlags(flagsStr: java.lang.String): scala.Double = js.native
}


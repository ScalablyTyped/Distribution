package typings.ssh2.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.ssh2.ssh2Strings.close
import typings.ssh2.ssh2Strings.continue
import typings.ssh2.ssh2Strings.end
import typings.ssh2.ssh2Strings.error
import typings.ssh2Streams.mod.FileEntry
import typings.ssh2Streams.mod.InputAttributes
import typings.ssh2Streams.mod.ReadFileOptions
import typings.ssh2Streams.mod.ReadStreamOptions
import typings.ssh2Streams.mod.Stats
import typings.ssh2Streams.mod.TransferOptions
import typings.ssh2Streams.mod.WriteStreamOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFTPWrapper extends EventEmitter {
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
    * Ends the stream.
    */
  def end(): Unit = js.native
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
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted when the session has closed.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when more requests/data can be sent to the stream.
    */
  @JSName("on")
  def on_continue(event: continue, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the session has ended.
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when an error occurred.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
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
  def read(
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
  def write(
    handle: Buffer,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): Boolean = js.native
}


package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFTPWrapper
  extends nodeLib.eventsMod.EventEmitter {
  /**
       * (Client-only)
       * Sets the mode for `path`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
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
  /**
       * (Client-only)
       * Returns a new readable stream for `path`.
       */
  def createReadStream(path: java.lang.String, options: ssh2DashStreamsLib.ssh2DashStreamsMod.ReadStreamOptions): nodeLib.streamMod.Readable = js.native
  /**
       * (Client-only)
       * Returns a new writable stream for `path`.
       */
  def createWriteStream(path: java.lang.String): nodeLib.streamMod.Writable = js.native
  /**
       * (Client-only)
       * Returns a new writable stream for `path`.
       */
  def createWriteStream(path: java.lang.String, options: ssh2DashStreamsLib.ssh2DashStreamsMod.WriteStreamOptions): nodeLib.streamMod.Writable = js.native
  /**
       * Ends the stream.
       */
  def end(): scala.Unit = js.native
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
    options: ssh2DashStreamsLib.ssh2DashStreamsMod.TransferOptions,
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
    options: ssh2DashStreamsLib.ssh2DashStreamsMod.TransferOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
       * (Client-only)
       * Sets the mode for the resource associated with `handle`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
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
    attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.InputAttributes,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Retrieves attributes for the resource associated with `handle`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def fstat(
    handle: nodeLib.Buffer,
    callback: js.Function2[
      /* err */ js.Any, 
      /* stats */ ssh2DashStreamsLib.ssh2DashStreamsMod.Stats, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
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
  /**
       * (Client-only)
       * Sets the access time and modified time for the resource associated with `handle`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def futimes(
    handle: nodeLib.Buffer,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Sets the access time and modified time for the resource associated with `handle`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def futimes(
    handle: nodeLib.Buffer,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Sets the access time and modified time for the resource associated with `handle`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def futimes(
    handle: nodeLib.Buffer,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Retrieves attributes for `path`. If `path` is a symlink, the link itself is stat'ed
       * instead of the resource it refers to.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def lstat(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* stats */ ssh2DashStreamsLib.ssh2DashStreamsMod.Stats, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Creates a new directory `path`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def mkdir(
    path: java.lang.String,
    attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.InputAttributes,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Creates a new directory `path`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def mkdir(path: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Boolean = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
       * Emitted when the session has closed.
       */
  @JSName("on")
  def on_close(event: ssh2Lib.ssh2LibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
       * Emitted when more requests/data can be sent to the stream.
       */
  @JSName("on")
  def on_continue(event: ssh2Lib.ssh2LibStrings.continue, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
       * Emitted when the session has ended.
       */
  @JSName("on")
  def on_end(event: ssh2Lib.ssh2LibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
       * Emitted when an error occurred.
       */
  @JSName("on")
  def on_error(event: ssh2Lib.ssh2LibStrings.error, listener: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
  /**
       * (Client-only)
       * Opens a file `filename` for `mode` with optional `attributes`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def open(
    filename: java.lang.String,
    mode: java.lang.String,
    attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.InputAttributes,
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
  def read(
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
       * Retrieves a directory listing.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def readdir(
    location: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* list */ js.Array[ssh2DashStreamsLib.ssh2DashStreamsMod.FileEntry], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Retrieves a directory listing.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def readdir(
    location: nodeLib.Buffer,
    callback: js.Function2[
      /* err */ js.Any, 
      /* list */ js.Array[ssh2DashStreamsLib.ssh2DashStreamsMod.FileEntry], 
      scala.Unit
    ]
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
    attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.InputAttributes,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Retrieves attributes for `path`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def stat(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* stats */ ssh2DashStreamsLib.ssh2DashStreamsMod.Stats, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
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
  /**
       * (Client-only)
       * Sets the access time and modified time for `path`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def utimes(
    path: java.lang.String,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Sets the access time and modified time for `path`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def utimes(
    path: java.lang.String,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  /**
       * (Client-only)
       * Sets the access time and modified time for `path`.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
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
  def write(
    handle: nodeLib.Buffer,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
}


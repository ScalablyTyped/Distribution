package typings
package promiseDashSftpLib.promiseDashSftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseSftp extends js.Object {
  def append(input: java.lang.String, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def append(input: nodeLib.Buffer, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Same as `#append()`, but appends to `destPath` if it already exists.
    */
  def append(input: nodeLib.NodeJSNs.ReadableStream, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def chmod(path: java.lang.String, mode: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the mode for a resource on the server.
    * @param path - The path of the resource to set the mode of.
    * @param mode - The new mode, a number or a string with an octal number.
    */
  def chmod(path: java.lang.String, mode: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the ownership for a resource on the server.
    * @param path - The path to the resource to change ownership of.
    * @param uid - The id of the new owner user.
    * @param gid - The id of the new owner group.
    */
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Close a resource on the server.
    * @param handle - A file handle returned from `#open()` or `#opendir()`.
    */
  def close(handle: nodeLib.Buffer): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Connects to an SFTP server; returned promise resolves to the server's
    * greeting message. If multiple authentication methods are available based
    * on the passed config, they are attempted in the following order: Password
    * > Private Key > Agent > keyboard-interactive (if tryKeyboard is set) >
    * Host-based > None. NOTE: many of the config properties below are NOT
    * relevant for promise-ftp. However, all promise-ftp connect options will
    * work here, except for secure, secureOptions, and preserveCwd.
    */
  def connect(options: promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.Options): scala.Null | ssh2Lib.ssh2Mod.SFTPWrapper = js.native
  /**
    * Creates a read stream from a file on the server.
    * @param path - The path of the file to create a read stream from.
    * @returns a new `ReadableStream` for `path`.
    */
  def createReadStream(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[nodeLib.NodeJSNs.ReadableStream] = js.native
  def createReadStream(path: java.lang.String, options: java.lang.String): bluebirdLib.bluebirdMod.namespaced[nodeLib.NodeJSNs.ReadableStream] = js.native
  def createReadStream(path: java.lang.String, options: promiseDashSftpLib.Anon_AutoClose): bluebirdLib.bluebirdMod.namespaced[nodeLib.NodeJSNs.ReadableStream] = js.native
  /**
    * Creates a write stream to a file on the server.
    * @param path - The path of the file to create a write stream to.
    * @returns a new `WriteableStream` for `path`.
    */
  def createWriteStream(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[nodeLib.NodeJSNs.WritableStream] = js.native
  def createWriteStream(path: java.lang.String, options: java.lang.String): bluebirdLib.bluebirdMod.namespaced[nodeLib.NodeJSNs.WritableStream] = js.native
  def createWriteStream(path: java.lang.String, options: promiseDashSftpLib.Anon_AutoClose): bluebirdLib.bluebirdMod.namespaced[nodeLib.NodeJSNs.WritableStream] = js.native
  /**
    * Closes the connection to the server immediately.
    * @returns whether the connection was connected prior to the call to **destroy()**.
    */
  def destroy(): scala.Boolean = js.native
  /**
    * Closes the connection to the server after any/all enqueued commands have
    * been executed.
    * @returns a promise that resolves to whether or not there was an error
    * associated with closing the connection.
    */
  def end(): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  /**
    * **OpenSSH extension**
    * Perform POSIX fstatvfs(2) on a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    */
  def ext_openssh_fstatvfs(handle: nodeLib.Buffer): bluebirdLib.bluebirdMod.namespaced[promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.Statvfs] = js.native
  /**
    * **OpenSSH extension**
    * Perform POSIX fsync(3) on a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    */
  def ext_openssh_fsync(handle: nodeLib.Buffer): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * **OpenSSH extension**
    * Performs POSIX link(2) to create a hard link on the server.
    * @param targetPath - The path of a file to hardlink from.
    * @param linkPath - The path of the newly created hardlink.
    */
  def ext_openssh_hardlink(targetPath: java.lang.String, linkPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * **OpenSSH extension**
    * Performs POSIX rename(3) on a resource on the server.
    * @param srcPath - The original path of the resource.
    * @param destPath - The new path to rename the resource to.
    */
  def ext_openssh_rename(srcPath: java.lang.String, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * **OpenSSH extension**
    * Perform POSIX fstatvfs(2) on a resource on the server.
    * @param path - The path to get the statvfs of.
    */
  def ext_openssh_statvfs(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.Statvfs] = js.native
  /**
    * Download a file from the server using parallel reads for faster throughput.
    * @param remotePath - The path to the remote file to read from.
    * @param localPath - The path to the local file to write to.
    */
  def fastGet(remotePath: java.lang.String, localPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def fastGet(
    remotePath: java.lang.String,
    localPath: java.lang.String,
    options: promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.FastOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Upload a file to the server using parallel reads for faster throughput.
    * @param localPath - The path to the local file to read from.
    * @param remotePath - The path to the remote file to write to.
    */
  def fastPut(localPath: java.lang.String, remotePath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def fastPut(
    localPath: java.lang.String,
    remotePath: java.lang.String,
    options: promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.FastOptions
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def fchmod(handle: nodeLib.Buffer, mode: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the mode for a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    * @param mode - The new mode, a number or a string with an octal number.
    */
  def fchmod(handle: nodeLib.Buffer, mode: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the ownership for a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    * @param uid - The id of the new owner user.
    * @param gid - The id of the new owner group.
    */
  def fchown(handle: nodeLib.Buffer, uid: scala.Double, gid: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the attributes for a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    */
  def fsetstat(handle: nodeLib.Buffer, attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.Attributes): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Retrieves attributes from a resource on the server.
    * @param handle - A file handle returned from `#open()` or `#opendir()`
    */
  def fstat(handle: nodeLib.Buffer): bluebirdLib.bluebirdMod.namespaced[ssh2DashStreamsLib.ssh2DashStreamsMod.Stats] = js.native
  def futimes(handle: nodeLib.Buffer, atime: scala.Double, mtime: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def futimes(handle: nodeLib.Buffer, atime: scala.Double, mtime: stdLib.Date): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def futimes(handle: nodeLib.Buffer, atime: stdLib.Date, mtime: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the access and modified times for a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    * @param atime - A Date or unix timestamp representing the new access time for the resource
    * @param mtime - A Date or unix timestamp representing the new modify time for the resource
    */
  def futimes(handle: nodeLib.Buffer, atime: stdLib.Date, mtime: stdLib.Date): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Retrieve a file from the server.
    * @param path - The file to retrieve from the server.
    */
  def get(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[nodeLib.NodeJSNs.ReadableStream] = js.native
  /**
    * @returns a string describing the current connection state.
    */
  def getConnectionStatus(): promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.STATUSES = js.native
  /**
    * Retrieve the last modified date of a file on the server.
    * @param path - The path to the file to get the last modified date of.
    */
  def lastMod(path: java.lang.String): stdLib.Date = js.native
  /**
    * Retrieves a directory listing.
    * @param path - The path of the directory to get the listing of.
    */
  def list(): bluebirdLib.bluebirdMod.namespaced[promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.DirectoryListing] = js.native
  def list(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.DirectoryListing] = js.native
  /** Alias to `#list()` */
  def listSafe(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[promiseDashSftpLib.promiseDashSftpMod.PromiseSftpNs.DirectoryListing] = js.native
  /** Alias to `#end()` */
  def logout(): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  /**
    * Retrieve attributes for a resource on the server. If the resource is a
    * symlink, it retrieves the stats for the link itself instead of the
    * resource it refers to.
    * @param path - The path to the resource to retrieve the attributes of.
    */
  def lstat(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[ssh2DashStreamsLib.ssh2DashStreamsMod.Stats] = js.native
  /**
    * Create a new directory.
    * @param path - The path to create a new directory at.
    * @param recursive - Enables a `mkdir -p` algorithm, defaults to false.
    * @param attributes - The attributes to use when creating directories.
    */
  def mkdir(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def mkdir(path: java.lang.String, attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.InputAttributes): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def mkdir(path: java.lang.String, recursive: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def mkdir(
    path: java.lang.String,
    recursive: scala.Boolean,
    attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.InputAttributes
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Opens a file on the server.
    * @param filename - The path of the file to open.
    * @param mode - Any of the modes supported by `fs.open()`.
    * @returns a promise that resolves to a `Buffer` containing a handle to the file.
    */
  def open(filename: java.lang.String, mode: java.lang.String): bluebirdLib.bluebirdMod.namespaced[nodeLib.Buffer] = js.native
  def open(
    filename: java.lang.String,
    mode: java.lang.String,
    attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.InputAttributes
  ): bluebirdLib.bluebirdMod.namespaced[nodeLib.Buffer] = js.native
  def open(filename: java.lang.String, mode: scala.Double): bluebirdLib.bluebirdMod.namespaced[nodeLib.Buffer] = js.native
  def open(
    filename: java.lang.String,
    mode: scala.Double,
    attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.InputAttributes
  ): bluebirdLib.bluebirdMod.namespaced[nodeLib.Buffer] = js.native
  /**
    * Open a directory on the server.
    * @param path - The path of the directory to open.
    * @returns a buffer with the handle of the opened directory.
    */
  def opendir(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[nodeLib.Buffer] = js.native
  def put(input: java.lang.String, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def put(input: nodeLib.Buffer, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Sends data to the server.
    * @param destPath - The file to store the data in. If string the path to a
    * local file.
    */
  def put(input: nodeLib.NodeJSNs.ReadableStream, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Read binary data from a file on the server to a buffer.
    * @param handle - A file handle returned from `#open()` or `#opendir()`.
    * @param buffer - The buffer to write to.
    * @param offset - The offset from the start of the buffer to begin writing to.
    * @param length - The number of bytes to read from the resource.
    * @param position - The position of the file to begin reading from.
    */
  /**
    * Write binary data from a buffer to a file on the server.
    * @param handle - A file handle returned from `#open()` or `#opendir()`.
    * @param buffer - The buffer to read from.
    * @param offset - The offset from the start of the buffer to begin reading from.
    * @param length - The number of bytes to read from the buffer.
    * @param position - The position of the file to begin writing to.
    */
  def read(
    handle: nodeLib.Buffer,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): bluebirdLib.bluebirdMod.namespaced[promiseDashSftpLib.Anon_Position] = js.native
  def readdir(location: java.lang.String): bluebirdLib.bluebirdMod.namespaced[promiseDashSftpLib.Anon_Attrs] = js.native
  /**
    * Read a directory on the server.
    * @param location - The path of the directory to read or a handle returned from `#opendir()`.
    */
  def readdir(location: nodeLib.Buffer): bluebirdLib.bluebirdMod.namespaced[promiseDashSftpLib.Anon_Attrs] = js.native
  /**
    * Read the target of a symlink on the server.
    * @param path - The path of the symlink to read the target of.
    */
  def readlink(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
    * Get the absolute path from a relative path on the server.
    * @param path - The path to get the absolute path of.
    */
  def realpath(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
    * Connects to an SFTP server using the config from the most recent call to
    * #connect().
    * @returns promise that resolves to the server's greeting message.
    */
  def reconnect(): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /** Alias for `#unlink()` */
  def remove(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Renames/moves one file/directory to another on the server.
    * @param oldPath - The source file/directory.
    * @param newPath - The destination file/directory.
    */
  def rename(oldPath: java.lang.String, newPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Sets the file byte offset for the next file transfer action initiated via
    * #get() or #put() to `byteOffset`.
    */
  def restart(byteOffset: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Remove a directory on the server.
    * @param path - The path of the directory to remove.
    */
  def rmdir(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the attributes of a resource on the server.
    * @param path - The path to the resource to set the attributes of.
    * @param attributes - The new attributes for the resource.
    */
  def setstat(path: java.lang.String, attributes: ssh2DashStreamsLib.ssh2DashStreamsMod.Attributes): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Retrieve the size of a file on the server.
    * @param path - The path to the file to retrieve the size of.
    */
  def size(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  /**
    * Retrieve attributes for a resource on the server.
    * @param path - The path to the resource to retrieve the attributes of.
    */
  def stat(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[ssh2DashStreamsLib.ssh2DashStreamsMod.Stats] = js.native
  /**
    * Create a symlink on the server.
    * @param targetPath - The path to the target of the symlink.
    * @param linkPath - The path of the new symlink.
    */
  def symlink(targetPath: java.lang.String, linkPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Remove a file or symlink on the server.
    * @param path - The path of the file/symlink to remove.
    */
  def unlink(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def utimes(path: java.lang.String, atime: scala.Double, mtime: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def utimes(path: java.lang.String, atime: scala.Double, mtime: stdLib.Date): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def utimes(path: java.lang.String, atime: stdLib.Date, mtime: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the access and modified times for a resource on the server.
    * @param path - The path of the resource to set times of.
    * @param atime - A Date or unix timestamp representing the new access time for the resource
    * @param mtime - A Date or unix timestamp representing the new modify time for the resource
    */
  def utimes(path: java.lang.String, atime: stdLib.Date, mtime: stdLib.Date): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
}


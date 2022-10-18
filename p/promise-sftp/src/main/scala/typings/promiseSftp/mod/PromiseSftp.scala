package typings.promiseSftp.mod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
import typings.promiseSftp.anon.Attrs
import typings.promiseSftp.anon.AutoClose
import typings.ssh2.mod.SFTPWrapper
import typings.ssh2Streams.mod.Attributes
import typings.ssh2Streams.mod.InputAttributes
import typings.ssh2Streams.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseSftp extends StObject {
  
  def append(input: String, destPath: String): typings.bluebird.mod.^[Unit] = js.native
  /**
    * Same as `#append()`, but appends to `destPath` if it already exists.
    */
  def append(input: ReadableStream, destPath: String): typings.bluebird.mod.^[Unit] = js.native
  def append(input: Buffer, destPath: String): typings.bluebird.mod.^[Unit] = js.native
  
  def chmod(path: String, mode: String): typings.bluebird.mod.^[Unit] = js.native
  /**
    * Set the mode for a resource on the server.
    * @param path - The path of the resource to set the mode of.
    * @param mode - The new mode, a number or a string with an octal number.
    */
  def chmod(path: String, mode: Double): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Set the ownership for a resource on the server.
    * @param path - The path to the resource to change ownership of.
    * @param uid - The id of the new owner user.
    * @param gid - The id of the new owner group.
    */
  def chown(path: String, uid: Double, gid: Double): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Close a resource on the server.
    * @param handle - A file handle returned from `#open()` or `#opendir()`.
    */
  def close(handle: Buffer): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Connects to an SFTP server; returned promise resolves to the server's
    * greeting message. If multiple authentication methods are available based
    * on the passed config, they are attempted in the following order: Password
    * > Private Key > Agent > keyboard-interactive (if tryKeyboard is set) >
    * Host-based > None. NOTE: many of the config properties below are NOT
    * relevant for promise-ftp. However, all promise-ftp connect options will
    * work here, except for secure, secureOptions, and preserveCwd.
    */
  def connect(options: Options): Null | SFTPWrapper = js.native
  
  /**
    * Creates a read stream from a file on the server.
    * @param path - The path of the file to create a read stream from.
    * @returns a new `ReadableStream` for `path`.
    */
  def createReadStream(path: String): typings.bluebird.mod.^[ReadableStream] = js.native
  def createReadStream(path: String, options: String): typings.bluebird.mod.^[ReadableStream] = js.native
  def createReadStream(path: String, options: AutoClose): typings.bluebird.mod.^[ReadableStream] = js.native
  
  /**
    * Creates a write stream to a file on the server.
    * @param path - The path of the file to create a write stream to.
    * @returns a new `WriteableStream` for `path`.
    */
  def createWriteStream(path: String): typings.bluebird.mod.^[WritableStream] = js.native
  def createWriteStream(path: String, options: String): typings.bluebird.mod.^[WritableStream] = js.native
  def createWriteStream(path: String, options: AutoClose): typings.bluebird.mod.^[WritableStream] = js.native
  
  /**
    * Closes the connection to the server immediately.
    * @returns whether the connection was connected prior to the call to **destroy()**.
    */
  def destroy(): Boolean = js.native
  
  /**
    * Closes the connection to the server after any/all enqueued commands have
    * been executed.
    * @returns a promise that resolves to whether or not there was an error
    * associated with closing the connection.
    */
  def end(): typings.bluebird.mod.^[Boolean] = js.native
  
  /**
    * **OpenSSH extension**
    * Perform POSIX fstatvfs(2) on a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    */
  def ext_openssh_fstatvfs(handle: Buffer): typings.bluebird.mod.^[Statvfs] = js.native
  
  /**
    * **OpenSSH extension**
    * Perform POSIX fsync(3) on a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    */
  def ext_openssh_fsync(handle: Buffer): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * **OpenSSH extension**
    * Performs POSIX link(2) to create a hard link on the server.
    * @param targetPath - The path of a file to hardlink from.
    * @param linkPath - The path of the newly created hardlink.
    */
  def ext_openssh_hardlink(targetPath: String, linkPath: String): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * **OpenSSH extension**
    * Performs POSIX rename(3) on a resource on the server.
    * @param srcPath - The original path of the resource.
    * @param destPath - The new path to rename the resource to.
    */
  def ext_openssh_rename(srcPath: String, destPath: String): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * **OpenSSH extension**
    * Perform POSIX fstatvfs(2) on a resource on the server.
    * @param path - The path to get the statvfs of.
    */
  def ext_openssh_statvfs(path: String): typings.bluebird.mod.^[Statvfs] = js.native
  
  /**
    * Download a file from the server using parallel reads for faster throughput.
    * @param remotePath - The path to the remote file to read from.
    * @param localPath - The path to the local file to write to.
    */
  def fastGet(remotePath: String, localPath: String): typings.bluebird.mod.^[Unit] = js.native
  def fastGet(remotePath: String, localPath: String, options: FastOptions): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Upload a file to the server using parallel reads for faster throughput.
    * @param localPath - The path to the local file to read from.
    * @param remotePath - The path to the remote file to write to.
    */
  def fastPut(localPath: String, remotePath: String): typings.bluebird.mod.^[Unit] = js.native
  def fastPut(localPath: String, remotePath: String, options: FastOptions): typings.bluebird.mod.^[Unit] = js.native
  
  def fchmod(handle: Buffer, mode: String): typings.bluebird.mod.^[Unit] = js.native
  /**
    * Set the mode for a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    * @param mode - The new mode, a number or a string with an octal number.
    */
  def fchmod(handle: Buffer, mode: Double): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Set the ownership for a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    * @param uid - The id of the new owner user.
    * @param gid - The id of the new owner group.
    */
  def fchown(handle: Buffer, uid: Double, gid: Double): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Set the attributes for a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    */
  def fsetstat(handle: Buffer, attributes: Attributes): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Retrieves attributes from a resource on the server.
    * @param handle - A file handle returned from `#open()` or `#opendir()`
    */
  def fstat(handle: Buffer): typings.bluebird.mod.^[Stats] = js.native
  
  /**
    * Set the access and modified times for a resource on the server.
    * @param handle - A resource handle returned from `#open()` or `#fopen()`.
    * @param atime - A Date or unix timestamp representing the new access time for the resource
    * @param mtime - A Date or unix timestamp representing the new modify time for the resource
    */
  def futimes(handle: Buffer, atime: js.Date, mtime: js.Date): typings.bluebird.mod.^[Unit] = js.native
  def futimes(handle: Buffer, atime: js.Date, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
  def futimes(handle: Buffer, atime: Double, mtime: js.Date): typings.bluebird.mod.^[Unit] = js.native
  def futimes(handle: Buffer, atime: Double, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Retrieve a file from the server.
    * @param path - The file to retrieve from the server.
    */
  def get(path: String): typings.bluebird.mod.^[ReadableStream] = js.native
  
  /**
    * @returns a string describing the current connection state.
    */
  def getConnectionStatus(): typings.promiseFtpCommon.mod.STATUSES = js.native
  
  /**
    * Retrieve the last modified date of a file on the server.
    * @param path - The path to the file to get the last modified date of.
    */
  def lastMod(path: String): js.Date = js.native
  
  /**
    * Retrieves a directory listing.
    * @param path - The path of the directory to get the listing of.
    */
  def list(): typings.bluebird.mod.^[js.Array[DirectoryListing]] = js.native
  def list(path: String): typings.bluebird.mod.^[js.Array[DirectoryListing]] = js.native
  
  /** Alias to `#list()` */
  def listSafe(path: String): typings.bluebird.mod.^[js.Array[DirectoryListing]] = js.native
  
  /** Alias to `#end()` */
  def logout(): typings.bluebird.mod.^[Boolean] = js.native
  
  /**
    * Retrieve attributes for a resource on the server. If the resource is a
    * symlink, it retrieves the stats for the link itself instead of the
    * resource it refers to.
    * @param path - The path to the resource to retrieve the attributes of.
    */
  def lstat(path: String): typings.bluebird.mod.^[Stats] = js.native
  
  /**
    * Create a new directory.
    * @param path - The path to create a new directory at.
    * @param recursive - Enables a `mkdir -p` algorithm, defaults to false.
    * @param attributes - The attributes to use when creating directories.
    */
  def mkdir(path: String): typings.bluebird.mod.^[Unit] = js.native
  def mkdir(path: String, attributes: InputAttributes): typings.bluebird.mod.^[Unit] = js.native
  def mkdir(path: String, recursive: Boolean): typings.bluebird.mod.^[Unit] = js.native
  def mkdir(path: String, recursive: Boolean, attributes: InputAttributes): typings.bluebird.mod.^[Unit] = js.native
  def mkdir(path: String, recursive: Unit, attributes: InputAttributes): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Opens a file on the server.
    * @param filename - The path of the file to open.
    * @param mode - Any of the modes supported by `fs.open()`.
    * @returns a promise that resolves to a `Buffer` containing a handle to the file.
    */
  def open(filename: String, mode: String): typings.bluebird.mod.^[Buffer] = js.native
  def open(filename: String, mode: String, attributes: InputAttributes): typings.bluebird.mod.^[Buffer] = js.native
  def open(filename: String, mode: Double): typings.bluebird.mod.^[Buffer] = js.native
  def open(filename: String, mode: Double, attributes: InputAttributes): typings.bluebird.mod.^[Buffer] = js.native
  
  /**
    * Open a directory on the server.
    * @param path - The path of the directory to open.
    * @returns a buffer with the handle of the opened directory.
    */
  def opendir(path: String): typings.bluebird.mod.^[Buffer] = js.native
  
  def put(input: String, destPath: String): typings.bluebird.mod.^[Unit] = js.native
  /**
    * Sends data to the server.
    * @param destPath - The file to store the data in. If string the path to a
    * local file.
    */
  def put(input: ReadableStream, destPath: String): typings.bluebird.mod.^[Unit] = js.native
  def put(input: Buffer, destPath: String): typings.bluebird.mod.^[Unit] = js.native
  
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
  def read(handle: Buffer, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[typings.promiseSftp.anon.Buffer] = js.native
  
  def readdir(location: String): typings.bluebird.mod.^[Attrs] = js.native
  /**
    * Read a directory on the server.
    * @param location - The path of the directory to read or a handle returned from `#opendir()`.
    */
  def readdir(location: Buffer): typings.bluebird.mod.^[Attrs] = js.native
  
  /**
    * Read the target of a symlink on the server.
    * @param path - The path of the symlink to read the target of.
    */
  def readlink(path: String): typings.bluebird.mod.^[String] = js.native
  
  /**
    * Get the absolute path from a relative path on the server.
    * @param path - The path to get the absolute path of.
    */
  def realpath(path: String): typings.bluebird.mod.^[String] = js.native
  
  /**
    * Connects to an SFTP server using the config from the most recent call to
    * #connect().
    * @returns promise that resolves to the server's greeting message.
    */
  def reconnect(): typings.bluebird.mod.^[String] = js.native
  
  /** Alias for `#unlink()` */
  def remove(path: String): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Renames/moves one file/directory to another on the server.
    * @param oldPath - The source file/directory.
    * @param newPath - The destination file/directory.
    */
  def rename(oldPath: String, newPath: String): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Sets the file byte offset for the next file transfer action initiated via
    * #get() or #put() to `byteOffset`.
    */
  def restart(byteOffset: Double): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Remove a directory on the server.
    * @param path - The path of the directory to remove.
    */
  def rmdir(path: String): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Set the attributes of a resource on the server.
    * @param path - The path to the resource to set the attributes of.
    * @param attributes - The new attributes for the resource.
    */
  def setstat(path: String, attributes: Attributes): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Retrieve the size of a file on the server.
    * @param path - The path to the file to retrieve the size of.
    */
  def size(path: String): typings.bluebird.mod.^[Double] = js.native
  
  /**
    * Retrieve attributes for a resource on the server.
    * @param path - The path to the resource to retrieve the attributes of.
    */
  def stat(path: String): typings.bluebird.mod.^[Stats] = js.native
  
  /**
    * Create a symlink on the server.
    * @param targetPath - The path to the target of the symlink.
    * @param linkPath - The path of the new symlink.
    */
  def symlink(targetPath: String, linkPath: String): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Remove a file or symlink on the server.
    * @param path - The path of the file/symlink to remove.
    */
  def unlink(path: String): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Set the access and modified times for a resource on the server.
    * @param path - The path of the resource to set times of.
    * @param atime - A Date or unix timestamp representing the new access time for the resource
    * @param mtime - A Date or unix timestamp representing the new modify time for the resource
    */
  def utimes(path: String, atime: js.Date, mtime: js.Date): typings.bluebird.mod.^[Unit] = js.native
  def utimes(path: String, atime: js.Date, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
  def utimes(path: String, atime: Double, mtime: js.Date): typings.bluebird.mod.^[Unit] = js.native
  def utimes(path: String, atime: Double, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
}

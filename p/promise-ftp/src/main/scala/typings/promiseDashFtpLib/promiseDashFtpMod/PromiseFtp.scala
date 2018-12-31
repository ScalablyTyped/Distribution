package typings
package promiseDashFtpLib.promiseDashFtpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseFtp extends js.Object {
  /**
    * The underlying FtpClient instance
    */
  var rawClient: ftpLib.ftpMod.namespaced = js.native
  /**
    * Abort the current data transfer (e.g. from `#get()`, `#put()`, or `#list()`)
    */
  def abort(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def append(input: java.lang.String, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def append(input: java.lang.String, destPath: java.lang.String, useCompression: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def append(input: nodeLib.Buffer, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def append(input: nodeLib.Buffer, destPath: java.lang.String, useCompression: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Create a new file on the server or append to one that already exists.
    * @param input - can be a ReadableStream, a Buffer, or a pathto a local file.
    * @param destPath - the path of the file to create or append to.
    * @param useCompression - defaults to false.
    */
  def append(input: nodeLib.NodeJSNs.ReadableStream, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def append(input: nodeLib.NodeJSNs.ReadableStream, destPath: java.lang.String, useCompression: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the transfer data type to ASCII.
    */
  def ascii(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Set the transfer data type to binary (default at time of connection).
    */
  def binary(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Change the working directory to the parent of the current directory.
    * Like `cd ..`.
    */
  def cdup(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Connect to an FTP server.
    */
  def connect(options: ftpLib.ftpMod.ClientNs.Options): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
    * Change the current working directory.
    * @param cwd - the path to change the CWD to.
    * @returns the current directory if the server replies with the path in the
    * response text, otherwise undefined.
    */
  def cwd(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[js.UndefOr[java.lang.String]] = js.native
  /**
    * Delete a file on the server.
    */
  def delete(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Close the connection to the server immediately.
    */
  def destroy(): scala.Boolean = js.native
  /**
    * Close the connection to the server after any/all enqueued
    * commands have been executed.
    * @returns a promise that resolves with the last error recieved if there
    * was an error, true if there was an error but the client didn't recieve it,
    * or false if there was no error.
    */
  def end(): bluebirdLib.bluebirdMod.namespaced[nodeLib.Error | scala.Boolean] = js.native
  /**
    * Retrieve a file at path from the server.
    * @param path - the path of the file to get.
    * @param useCompression - defaults to false.
    * @returns a stream which empties to the contents of the specified file.
    */
  def get(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[nodeLib.NodeJSNs.ReadableStream] = js.native
  def get(path: java.lang.String, useCompression: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getConnectionStatus(): promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod.STATUSES = js.native
  /**
    * Extended commands (RFC 3659)
    * Retrieve the last modified date and time for a file or directory.
    * @param path - the path of the file/directory whose modified date is to
    * be retrieved.
    * @returns the last modified date at the specified path.
    */
  def lastMod(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[stdLib.Date] = js.native
  /**
    * Retrieve the directory listing of path.
    * @param path - defaults to the current working directory.
    * @param useCompression - defaults to false.
    * @returns the contents of the specified directory
    */
  def list(): js.Array[ftpLib.ftpMod.ClientNs.ListingElement] = js.native
  def list(path: java.lang.String): js.Array[ftpLib.ftpMod.ClientNs.ListingElement] = js.native
  def list(path: java.lang.String, useCompression: scala.Boolean): js.Array[ftpLib.ftpMod.ClientNs.ListingElement] = js.native
  def list(useCompression: scala.Boolean): js.Array[ftpLib.ftpMod.ClientNs.ListingElement] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Retrieve the directory listing of path.
    * Similar to `#list()`, except the directory is temporarily changed to path to
    * retrieve the directory listing. This is useful for servers that do not
    * handle characters like spaces and quotes in directory names well for the
    * LIST command. This function is "optional" because it relies on `#pwd()`
    * being available.
    * @param path - defaults to the current working directory.
    * @param useCompression - defaults to false.
    * @returns the contents of the specified directory
    */
  def listSafe(): js.Array[ftpLib.ftpMod.ClientNs.ListingElement] = js.native
  def listSafe(path: java.lang.String): js.Array[ftpLib.ftpMod.ClientNs.ListingElement] = js.native
  def listSafe(path: java.lang.String, useCompression: scala.Boolean): js.Array[ftpLib.ftpMod.ClientNs.ListingElement] = js.native
  def listSafe(useCompression: scala.Boolean): js.Array[ftpLib.ftpMod.ClientNs.ListingElement] = js.native
  /**
    * Logout the user from the server.
    */
  def logout(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Create a new directory on the server.
    * @param path - the path of the new directory.
    * @param recursive - enables a `mkdir -p` algorithm, defaults to false.
    */
  def mkdir(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def mkdir(path: java.lang.String, recursive: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def put(input: java.lang.String, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def put(input: java.lang.String, destPath: java.lang.String, useCompression: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def put(input: nodeLib.Buffer, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def put(input: nodeLib.Buffer, destPath: java.lang.String, useCompression: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Send data to the server to be stored as a file.
    * @param input - can be a ReadableStream, a Buffer, or a path to a local file.
    * @param destPath - the path of the file to write to.
    * @param useCompression - defaults to false.
    */
  def put(input: nodeLib.NodeJSNs.ReadableStream, destPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def put(input: nodeLib.NodeJSNs.ReadableStream, destPath: java.lang.String, useCompression: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Retrieve the current working directory.
    */
  def pwd(): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
    * Reconnect with the same options as previously connected with `#connect()`.
    */
  def reconnect(): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
    * Rename a file on the server.
    * @param oldPath - the old path of the file.
    * @param newPath - the new path to move it to.
    */
  def rename(oldPath: java.lang.String, newPath: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Extended commands (RFC 3659)
    * Set the file byte offset for the next file transfer action (get/put).
    * @param byteOffset - The file byte offset.
    */
  def restart(byteOffset: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Remove a directory on the server.
    * @param path - the path of the directory to remove.
    * @param recursive - enables deleting the directory if not empty, defaults to false.
    */
  def rmdir(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def rmdir(path: java.lang.String, recursive: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Send command using SITE.
    * @param command - the command to send, e.g 'CHMOD 755 foo' or 'QUOTA'.
    */
  def site(command: java.lang.String): bluebirdLib.bluebirdMod.namespaced[promiseDashFtpLib.Anon_Text] = js.native
  /**
    * Extended commands (RFC 3659)
    * Retrieve the size of a file on the server.
    * @param path - the path of the file whose size is to be retrieved.
    * @returns the size of the specified file.
    */
  def size(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Double] = js.native
  /**
    * Retrieve human-readable information about the server's status.
    * @returns a string with the server's status.
    */
  def status(): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Retrieve information about the system running the server.
    * @returns the server's OS.
    */
  def system(): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
}


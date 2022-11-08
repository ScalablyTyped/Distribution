package typings.ssh2SftpClient.mod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
import typings.ssh2.mod.ReadStream
import typings.ssh2.mod.SFTPWrapper
import typings.ssh2.mod.WriteStream
import typings.ssh2SftpClient.ssh2SftpClientBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sftp extends StObject {
  
  def append(input: ReadableStream, remotePath: String): js.Promise[String] = js.native
  def append(input: ReadableStream, remotePath: String, options: WriteStreamOptions): js.Promise[String] = js.native
  def append(input: Buffer, remotePath: String): js.Promise[String] = js.native
  def append(input: Buffer, remotePath: String, options: WriteStreamOptions): js.Promise[String] = js.native
  
  def chmod(remotePath: String, mode: String): js.Promise[String] = js.native
  def chmod(remotePath: String, mode: Double): js.Promise[String] = js.native
  
  def connect(options: ConnectOptions): js.Promise[SFTPWrapper] = js.native
  
  def createReadStream(remotePath: String): ReadStream = js.native
  def createReadStream(remotePath: String, options: typings.ssh2.mod.ReadStreamOptions): ReadStream = js.native
  
  def createWriteStream(remotePath: String): WriteStream = js.native
  def createWriteStream(remotePath: String, options: typings.ssh2.mod.WriteStreamOptions): WriteStream = js.native
  
  def cwd(): js.Promise[String] = js.native
  
  def delete(remoteFilePath: String): js.Promise[String] = js.native
  def delete(remoteFilePath: String, noErrorOK: Boolean): js.Promise[String] = js.native
  
  def downloadDir(srcDir: String, destDir: String): js.Promise[String] = js.native
  def downloadDir(srcDir: String, destDir: String, options: DownloadDirOptions): js.Promise[String] = js.native
  
  def end(): js.Promise[Unit] = js.native
  
  def exists(remotePath: String): js.Promise[`false` | FileInfoType] = js.native
  
  def fastGet(remoteFilePath: String, localPath: String): js.Promise[String] = js.native
  def fastGet(remoteFilePath: String, localPath: String, options: FastGetTransferOptions): js.Promise[String] = js.native
  
  def fastPut(localPath: String, remoteFilePath: String): js.Promise[String] = js.native
  def fastPut(localPath: String, remoteFilePath: String, options: FastPutTransferOptions): js.Promise[String] = js.native
  
  def get(path: String): js.Promise[String | WritableStream | Buffer] = js.native
  def get(path: String, dst: String): js.Promise[String | WritableStream | Buffer] = js.native
  def get(path: String, dst: String, options: TransferOptions): js.Promise[String | WritableStream | Buffer] = js.native
  def get(path: String, dst: Unit, options: TransferOptions): js.Promise[String | WritableStream | Buffer] = js.native
  def get(path: String, dst: WritableStream): js.Promise[String | WritableStream | Buffer] = js.native
  def get(path: String, dst: WritableStream, options: TransferOptions): js.Promise[String | WritableStream | Buffer] = js.native
  
  def list(remoteFilePath: String): js.Promise[js.Array[FileInfo]] = js.native
  def list(remoteFilePath: String, filter: ListFilterFunction): js.Promise[js.Array[FileInfo]] = js.native
  
  def mkdir(remoteFilePath: String): js.Promise[String] = js.native
  def mkdir(remoteFilePath: String, recursive: Boolean): js.Promise[String] = js.native
  
  def on(event: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  
  def posixRename(fromPath: String, toPath: String): js.Promise[String] = js.native
  
  def put(input: String, remoteFilePath: String): js.Promise[String] = js.native
  def put(input: String, remoteFilePath: String, options: TransferOptions): js.Promise[String] = js.native
  def put(input: ReadableStream, remoteFilePath: String): js.Promise[String] = js.native
  def put(input: ReadableStream, remoteFilePath: String, options: TransferOptions): js.Promise[String] = js.native
  def put(input: Buffer, remoteFilePath: String): js.Promise[String] = js.native
  def put(input: Buffer, remoteFilePath: String, options: TransferOptions): js.Promise[String] = js.native
  
  def rcopy(srcPath: String, dstPath: String): js.Promise[String] = js.native
  
  def realPath(remotePath: String): js.Promise[String] = js.native
  
  def removeListener(event: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  
  def rename(remoteSourcePath: String, remoteDestPath: String): js.Promise[String] = js.native
  
  def rmdir(remoteFilePath: String): js.Promise[String] = js.native
  def rmdir(remoteFilePath: String, recursive: Boolean): js.Promise[String] = js.native
  
  def stat(remotePath: String): js.Promise[FileStats] = js.native
  
  def uploadDir(srcDir: String, destDir: String): js.Promise[String] = js.native
  def uploadDir(srcDir: String, destDir: String, options: UploadDirOptions): js.Promise[String] = js.native
}

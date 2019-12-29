package typings.ssh2DashSftpDashClient.ssh2DashSftpDashClientMod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.ssh2.ssh2Mod.ConnectConfig
import typings.ssh2.ssh2Mod.SFTPWrapper
import typings.ssh2DashSftpDashClient.ssh2DashSftpDashClientBooleans.`false`
import typings.ssh2DashSftpDashClient.ssh2DashSftpDashClientStrings.`-_`
import typings.ssh2DashSftpDashClient.ssh2DashSftpDashClientStrings.d
import typings.ssh2DashSftpDashClient.ssh2DashSftpDashClientStrings.l
import typings.ssh2DashStreams.ssh2DashStreamsMod.TransferOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sftp extends js.Object {
  def append(input: Buffer, remotePath: String): js.Promise[String] = js.native
  def append(input: Buffer, remotePath: String, options: TransferOptions): js.Promise[String] = js.native
  def append(input: ReadableStream, remotePath: String): js.Promise[String] = js.native
  def append(input: ReadableStream, remotePath: String, options: TransferOptions): js.Promise[String] = js.native
  def chmod(remotePath: String, mode: String): js.Promise[String] = js.native
  def chmod(remotePath: String, mode: Double): js.Promise[String] = js.native
  def connect(options: ConnectConfig): js.Promise[SFTPWrapper] = js.native
  def cwd(): js.Promise[String] = js.native
  def delete(remoteFilePath: String): js.Promise[String] = js.native
  def end(): js.Promise[Unit] = js.native
  def exists(remotePath: String): js.Promise[`false` | d | `-_` | l] = js.native
  def fastGet(remoteFilePath: String, localPath: String): js.Promise[String] = js.native
  def fastGet(remoteFilePath: String, localPath: String, options: TransferOptions): js.Promise[String] = js.native
  def fastPut(localPath: String, remoteFilePath: String): js.Promise[String] = js.native
  def fastPut(localPath: String, remoteFilePath: String, options: TransferOptions): js.Promise[String] = js.native
  def get(path: String): js.Promise[String | ReadableStream | Buffer] = js.native
  def get(path: String, dst: String): js.Promise[String | ReadableStream | Buffer] = js.native
  def get(path: String, dst: String, options: TransferOptions): js.Promise[String | ReadableStream | Buffer] = js.native
  def get(path: String, dst: ReadableStream): js.Promise[String | ReadableStream | Buffer] = js.native
  def get(path: String, dst: ReadableStream, options: TransferOptions): js.Promise[String | ReadableStream | Buffer] = js.native
  def list(remoteFilePath: String): js.Promise[js.Array[FileInfo]] = js.native
  def list(remoteFilePath: String, pattern: String): js.Promise[js.Array[FileInfo]] = js.native
  def list(remoteFilePath: String, pattern: RegExp): js.Promise[js.Array[FileInfo]] = js.native
  def mkdir(remoteFilePath: String): js.Promise[String] = js.native
  def mkdir(remoteFilePath: String, recursive: Boolean): js.Promise[String] = js.native
  def on(event: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def put(input: String, remoteFilePath: String): js.Promise[String] = js.native
  def put(input: String, remoteFilePath: String, options: TransferOptions): js.Promise[String] = js.native
  def put(input: Buffer, remoteFilePath: String): js.Promise[String] = js.native
  def put(input: Buffer, remoteFilePath: String, options: TransferOptions): js.Promise[String] = js.native
  def put(input: ReadableStream, remoteFilePath: String): js.Promise[String] = js.native
  def put(input: ReadableStream, remoteFilePath: String, options: TransferOptions): js.Promise[String] = js.native
  def realPath(remotePath: String): js.Promise[String] = js.native
  def removeListener(event: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def rename(remoteSourcePath: String, remoteDestPath: String): js.Promise[String] = js.native
  def rmdir(remoteFilePath: String): js.Promise[String] = js.native
  def rmdir(remoteFilePath: String, recursive: Boolean): js.Promise[String] = js.native
  def stat(remotePath: String): js.Promise[FileStats] = js.native
}


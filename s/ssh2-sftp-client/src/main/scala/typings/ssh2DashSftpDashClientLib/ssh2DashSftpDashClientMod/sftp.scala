package typings
package ssh2DashSftpDashClientLib.ssh2DashSftpDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sftp extends js.Object {
  def chmod(remotePath: java.lang.String, mode: java.lang.String): js.Promise[java.lang.String] = js.native
  def chmod(remotePath: java.lang.String, mode: scala.Double): js.Promise[java.lang.String] = js.native
  def connect(options: ssh2Lib.ssh2Mod.ConnectConfig): js.Promise[scala.Unit] = js.native
  def delete(remoteFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def end(): js.Promise[scala.Unit] = js.native
  def exists(remotePath: java.lang.String): js.Promise[java.lang.String] = js.native
  def fastGet(remoteFilePath: java.lang.String, localPath: java.lang.String): js.Promise[java.lang.String] = js.native
  def fastGet(
    remoteFilePath: java.lang.String,
    localPath: java.lang.String,
    options: ssh2DashStreamsLib.ssh2DashStreamsMod.TransferOptions
  ): js.Promise[java.lang.String] = js.native
  def fastPut(localPath: java.lang.String, emoteFilePath: java.lang.String): js.Promise[java.lang.String] = js.native
  def fastPut(
    localPath: java.lang.String,
    emoteFilePath: java.lang.String,
    options: ssh2DashStreamsLib.ssh2DashStreamsMod.TransferOptions
  ): js.Promise[java.lang.String] = js.native
  def get(remoteFilePath: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def get(remoteFilePath: java.lang.String, useCompression: scala.Boolean): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def get(remoteFilePath: java.lang.String, useCompression: scala.Boolean, encoding: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def list(remoteFilePath: java.lang.String): js.Promise[js.Array[ssh2DashSftpDashClientLib.ssh2DashSftpDashClientMod.sftpNs.FileInfo]] = js.native
  def mkdir(remoteFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdir(remoteFilePath: java.lang.String, recursive: scala.Boolean): js.Promise[scala.Unit] = js.native
  def on(event: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def put(input: java.lang.String, remoteFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def put(input: java.lang.String, remoteFilePath: java.lang.String, useCompression: scala.Boolean): js.Promise[scala.Unit] = js.native
  def put(
    input: java.lang.String,
    remoteFilePath: java.lang.String,
    useCompression: scala.Boolean,
    encoding: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def put(input: nodeLib.Buffer, remoteFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def put(input: nodeLib.Buffer, remoteFilePath: java.lang.String, useCompression: scala.Boolean): js.Promise[scala.Unit] = js.native
  def put(
    input: nodeLib.Buffer,
    remoteFilePath: java.lang.String,
    useCompression: scala.Boolean,
    encoding: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def put(input: nodeLib.NodeJSNs.ReadableStream, remoteFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def put(
    input: nodeLib.NodeJSNs.ReadableStream,
    remoteFilePath: java.lang.String,
    useCompression: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def put(
    input: nodeLib.NodeJSNs.ReadableStream,
    remoteFilePath: java.lang.String,
    useCompression: scala.Boolean,
    encoding: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def rename(remoteSourcePath: java.lang.String, remoteDestPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def rmdir(remoteFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def rmdir(remoteFilePath: java.lang.String, recursive: scala.Boolean): js.Promise[scala.Unit] = js.native
  def stat(remotePath: java.lang.String): js.Promise[ssh2DashSftpDashClientLib.ssh2DashSftpDashClientMod.sftpNs.FileStats] = js.native
}


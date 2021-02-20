package typings.ssh2SftpClient

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.ssh2.mod.ConnectConfig
import typings.ssh2.mod.SFTPWrapper
import typings.ssh2SftpClient.anon.Group
import typings.ssh2SftpClient.ssh2SftpClientBooleans.`false`
import typings.ssh2SftpClient.ssh2SftpClientStrings.`-_`
import typings.ssh2SftpClient.ssh2SftpClientStrings.a
import typings.ssh2SftpClient.ssh2SftpClientStrings.d
import typings.ssh2SftpClient.ssh2SftpClientStrings.l
import typings.ssh2SftpClient.ssh2SftpClientStrings.w
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssh2-sftp-client", JSImport.Namespace)
  @js.native
  class ^ () extends sftp
  
  @js.native
  trait ConnectOptions extends ConnectConfig {
    
    var retries: js.UndefOr[Double] = js.native
    
    var retry_factor: js.UndefOr[Double] = js.native
    
    var retry_minTimeout: js.UndefOr[Double] = js.native
  }
  object ConnectOptions {
    
    @scala.inline
    def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    @scala.inline
    implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setRetry_factor(value: Double): Self = StObject.set(x, "retry_factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_factorUndefined: Self = StObject.set(x, "retry_factor", js.undefined)
      
      @scala.inline
      def setRetry_minTimeout(value: Double): Self = StObject.set(x, "retry_minTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_minTimeoutUndefined: Self = StObject.set(x, "retry_minTimeout", js.undefined)
    }
  }
  
  @js.native
  trait FastGetTransferOptions extends StObject {
    
    var chunkSize: js.UndefOr[Double] = js.native
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[
        js.Function3[/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
      ] = js.native
  }
  object FastGetTransferOptions {
    
    @scala.inline
    def apply(): FastGetTransferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastGetTransferOptions]
    }
    
    @scala.inline
    implicit class FastGetTransferOptionsMutableBuilder[Self <: FastGetTransferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setStep(value: (/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  @js.native
  trait FastPutTransferOptions
    extends FastGetTransferOptions
       with ModeOption
  object FastPutTransferOptions {
    
    @scala.inline
    def apply(): FastPutTransferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastPutTransferOptions]
    }
  }
  
  @js.native
  trait FileInfo extends StObject {
    
    var accessTime: Double = js.native
    
    var group: Double = js.native
    
    var modifyTime: Double = js.native
    
    var name: String = js.native
    
    var owner: Double = js.native
    
    var rights: Group = js.native
    
    var size: Double = js.native
    
    var `type`: String = js.native
  }
  object FileInfo {
    
    @scala.inline
    def apply(
      accessTime: Double,
      group: Double,
      modifyTime: Double,
      name: String,
      owner: Double,
      rights: Group,
      size: Double,
      `type`: String
    ): FileInfo = {
      val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], modifyTime = modifyTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    @scala.inline
    implicit class FileInfoMutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessTime(value: Double): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyTime(value: Double): Self = StObject.set(x, "modifyTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: Double): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRights(value: Group): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileStats extends StObject {
    
    var accessTime: Double = js.native
    
    var gid: Double = js.native
    
    var isBlockDevice: Boolean = js.native
    
    var isCharacterDevice: Boolean = js.native
    
    var isDirectory: Boolean = js.native
    
    var isFIFO: Boolean = js.native
    
    var isFile: Boolean = js.native
    
    var isSocket: Boolean = js.native
    
    var isSymbolicLink: Boolean = js.native
    
    var mode: Double = js.native
    
    var modifyTime: Double = js.native
    
    var size: Double = js.native
    
    var uid: Double = js.native
  }
  object FileStats {
    
    @scala.inline
    def apply(
      accessTime: Double,
      gid: Double,
      isBlockDevice: Boolean,
      isCharacterDevice: Boolean,
      isDirectory: Boolean,
      isFIFO: Boolean,
      isFile: Boolean,
      isSocket: Boolean,
      isSymbolicLink: Boolean,
      mode: Double,
      modifyTime: Double,
      size: Double,
      uid: Double
    ): FileStats = {
      val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], isBlockDevice = isBlockDevice.asInstanceOf[js.Any], isCharacterDevice = isCharacterDevice.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFIFO = isFIFO.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isSocket = isSocket.asInstanceOf[js.Any], isSymbolicLink = isSymbolicLink.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], modifyTime = modifyTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileStats]
    }
    
    @scala.inline
    implicit class FileStatsMutableBuilder[Self <: FileStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessTime(value: Double): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBlockDevice(value: Boolean): Self = StObject.set(x, "isBlockDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCharacterDevice(value: Boolean): Self = StObject.set(x, "isCharacterDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFIFO(value: Boolean): Self = StObject.set(x, "isFIFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSocket(value: Boolean): Self = StObject.set(x, "isSocket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSymbolicLink(value: Boolean): Self = StObject.set(x, "isSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyTime(value: Double): Self = StObject.set(x, "modifyTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetTransferOptions extends TransferOptions {
    
    var handle: js.UndefOr[Null | String] = js.native
  }
  object GetTransferOptions {
    
    @scala.inline
    def apply(): GetTransferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTransferOptions]
    }
    
    @scala.inline
    implicit class GetTransferOptionsMutableBuilder[Self <: GetTransferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleNull: Self = StObject.set(x, "handle", null)
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    }
  }
  
  @js.native
  trait ModeOption extends StObject {
    
    var mode: js.UndefOr[Double] = js.native
  }
  object ModeOption {
    
    @scala.inline
    def apply(): ModeOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModeOption]
    }
    
    @scala.inline
    implicit class ModeOptionMutableBuilder[Self <: ModeOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait TransferOptions extends ModeOption {
    
    var autoClose: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[Null | String] = js.native
    
    var flags: js.UndefOr[w | a] = js.native
  }
  object TransferOptions {
    
    @scala.inline
    def apply(): TransferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferOptions]
    }
    
    @scala.inline
    implicit class TransferOptionsMutableBuilder[Self <: TransferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlags(value: w | a): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    }
  }
  
  @js.native
  trait sftp extends StObject {
    
    def append(input: Buffer, remotePath: String): js.Promise[String] = js.native
    def append(input: Buffer, remotePath: String, options: TransferOptions): js.Promise[String] = js.native
    def append(input: ReadableStream, remotePath: String): js.Promise[String] = js.native
    def append(input: ReadableStream, remotePath: String, options: TransferOptions): js.Promise[String] = js.native
    
    def chmod(remotePath: String, mode: String): js.Promise[String] = js.native
    def chmod(remotePath: String, mode: Double): js.Promise[String] = js.native
    
    def connect(options: ConnectOptions): js.Promise[SFTPWrapper] = js.native
    
    def cwd(): js.Promise[String] = js.native
    
    def delete(remoteFilePath: String): js.Promise[String] = js.native
    
    def downloadDir(srcDir: String, destDir: String): js.Promise[String] = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    def exists(remotePath: String): js.Promise[`false` | d | `-_` | l] = js.native
    
    def fastGet(remoteFilePath: String, localPath: String): js.Promise[String] = js.native
    def fastGet(remoteFilePath: String, localPath: String, options: FastGetTransferOptions): js.Promise[String] = js.native
    
    def fastPut(localPath: String, remoteFilePath: String): js.Promise[String] = js.native
    def fastPut(localPath: String, remoteFilePath: String, options: FastPutTransferOptions): js.Promise[String] = js.native
    
    def get(path: String): js.Promise[String | WritableStream | Buffer] = js.native
    def get(path: String, dst: js.UndefOr[scala.Nothing], options: GetTransferOptions): js.Promise[String | WritableStream | Buffer] = js.native
    def get(path: String, dst: String): js.Promise[String | WritableStream | Buffer] = js.native
    def get(path: String, dst: String, options: GetTransferOptions): js.Promise[String | WritableStream | Buffer] = js.native
    def get(path: String, dst: WritableStream): js.Promise[String | WritableStream | Buffer] = js.native
    def get(path: String, dst: WritableStream, options: GetTransferOptions): js.Promise[String | WritableStream | Buffer] = js.native
    
    def list(remoteFilePath: String): js.Promise[js.Array[FileInfo]] = js.native
    def list(remoteFilePath: String, pattern: String): js.Promise[js.Array[FileInfo]] = js.native
    def list(remoteFilePath: String, pattern: RegExp): js.Promise[js.Array[FileInfo]] = js.native
    
    def mkdir(remoteFilePath: String): js.Promise[String] = js.native
    def mkdir(remoteFilePath: String, recursive: Boolean): js.Promise[String] = js.native
    
    def on(event: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    def posixRename(fromPath: String, toPath: String): js.Promise[String] = js.native
    
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
    
    def uploadDir(srcDir: String, destDir: String): js.Promise[String] = js.native
  }
}

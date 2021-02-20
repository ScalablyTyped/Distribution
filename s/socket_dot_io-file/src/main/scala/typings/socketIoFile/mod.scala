package typings.socketIoFile

import org.scalablytyped.runtime.StringDictionary
import typings.socketIo.mod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io-file", JSImport.Namespace)
  @js.native
  class ^ protected () extends SocketIOFile {
    def this(socket: Socket, options: Options) = this()
  }
  
  @js.native
  trait FileInfo extends StObject {
    
    var data: js.Array[_] = js.native
    
    var estimated: Double = js.native
    
    var mime: String = js.native
    
    var name: String = js.native
    
    var originalFileName: String = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    var uploadDir: String = js.native
    
    var uploadId: String = js.native
    
    var wrote: Double = js.native
  }
  object FileInfo {
    
    @scala.inline
    def apply(
      data: js.Array[_],
      estimated: Double,
      mime: String,
      name: String,
      originalFileName: String,
      path: String,
      size: Double,
      uploadDir: String,
      uploadId: String,
      wrote: Double
    ): FileInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], estimated = estimated.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalFileName = originalFileName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadDir = uploadDir.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], wrote = wrote.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    @scala.inline
    implicit class FileInfoMutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setEstimated(value: Double): Self = StObject.set(x, "estimated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalFileName(value: String): Self = StObject.set(x, "originalFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrote(value: Double): Self = StObject.set(x, "wrote", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var accepts: js.UndefOr[js.Array[String]] = js.native
    
    var chunkSize: js.UndefOr[Double] = js.native
    
    var maxFileSize: js.UndefOr[Double] = js.native
    
    var overwrite: js.UndefOr[Boolean] = js.native
    
    var rename: js.UndefOr[js.Function2[/* fileName */ String, /* fileInfo */ FileInfo, String]] = js.native
    
    var resume: js.UndefOr[Boolean] = js.native
    
    var transmissionDelay: js.UndefOr[Double] = js.native
    
    var uploadDir: String | StringDictionary[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(uploadDir: String | StringDictionary[String]): Options = {
      val __obj = js.Dynamic.literal(uploadDir = uploadDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(value: js.Array[String]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      @scala.inline
      def setAcceptsVarargs(value: String*): Self = StObject.set(x, "accepts", js.Array(value :_*))
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setRename(value: (/* fileName */ String, /* fileInfo */ FileInfo) => String): Self = StObject.set(x, "rename", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      @scala.inline
      def setResume(value: Boolean): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      @scala.inline
      def setTransmissionDelay(value: Double): Self = StObject.set(x, "transmissionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransmissionDelayUndefined: Self = StObject.set(x, "transmissionDelay", js.undefined)
      
      @scala.inline
      def setUploadDir(value: String | StringDictionary[String]): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketIOFile extends StObject {
    
    def on(event: String, cb: js.Function1[/* fileInfo */ FileInfo, Unit]): Unit = js.native
  }
  object SocketIOFile {
    
    @scala.inline
    def apply(on: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Unit): SocketIOFile = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[SocketIOFile]
    }
    
    @scala.inline
    implicit class SocketIOFileMutableBuilder[Self <: SocketIOFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(value: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}

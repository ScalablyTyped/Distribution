package typings.rcUpload

import typings.rcUpload.esInterfaceMod.BeforeUploadFileType
import typings.rcUpload.esInterfaceMod.RcFile
import typings.std.Blob
import typings.std.Exclude
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    def abort(): Unit
  }
  object Abort {
    
    inline def apply(abort: () => Unit): Abort = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
      __obj.asInstanceOf[Abort]
    }
    
    extension [Self <: Abort](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    }
  }
  
  trait File extends StObject {
    
    var file: RcFile
    
    var parsedFile: Exclude[BeforeUploadFileType, Boolean]
  }
  object File {
    
    inline def apply(file: RcFile, parsedFile: Exclude[BeforeUploadFileType, Boolean]): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], parsedFile = parsedFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: RcFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setParsedFile(value: Exclude[BeforeUploadFileType, Boolean]): Self = StObject.set(x, "parsedFile", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rc-upload.rc-upload/es/interface.RcFile & {  webkitRelativePath :string | undefined} */
  @js.native
  trait RcFilewebkitRelativePaths extends StObject {
    
    /* standard dom */
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* standard dom */
    val lastModified: Double = js.native
    
    /* standard dom */
    val name: String = js.native
    
    /* standard dom */
    val size: Double = js.native
    
    /* standard dom */
    def slice(): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Double, end: Double, contentType: String): Blob = js.native
    def slice(start: Double, end: Unit, contentType: String): Blob = js.native
    def slice(start: Unit, end: Double): Blob = js.native
    def slice(start: Unit, end: Double, contentType: String): Blob = js.native
    def slice(start: Unit, end: Unit, contentType: String): Blob = js.native
    
    /* standard dom */
    def stream(): ReadableStream[js.typedarray.Uint8Array] = js.native
    
    /* standard dom */
    def text(): js.Promise[String] = js.native
    
    /* standard dom */
    val `type`: String = js.native
    
    var uid: String = js.native
    
    /* standard dom */
    val webkitRelativePath: String & js.UndefOr[String] = js.native
  }
  
  trait Uid extends StObject {
    
    var uid: String
  }
  object Uid {
    
    inline def apply(uid: String): Uid = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uid]
    }
    
    extension [Self <: Uid](x: Self) {
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}

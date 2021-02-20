package typings.railsActivestorage

import typings.std.Error
import typings.std.File
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rails/activestorage", "DirectUpload")
  @js.native
  class DirectUpload protected () extends StObject {
    def this(file: File, url: String) = this()
    def this(file: File, url: String, delegate: DirectUploadDelegate) = this()
    
    def create(callback: js.Function2[/* error */ Error, /* blob */ Blob, Unit]): Unit = js.native
    
    var file: File = js.native
    
    var id: Double = js.native
    
    var url: String = js.native
  }
  
  @JSImport("@rails/activestorage", "start")
  @js.native
  def start(): Unit = js.native
  
  @js.native
  trait Blob extends StObject {
    
    var byte_size: Double = js.native
    
    var checksum: String = js.native
    
    var content_type: String = js.native
    
    var filename: String = js.native
    
    var signed_id: String = js.native
  }
  object Blob {
    
    @scala.inline
    def apply(byte_size: Double, checksum: String, content_type: String, filename: String, signed_id: String): Blob = {
      val __obj = js.Dynamic.literal(byte_size = byte_size.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signed_id = signed_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blob]
    }
    
    @scala.inline
    implicit class BlobMutableBuilder[Self <: Blob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByte_size(value: Double): Self = StObject.set(x, "byte_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigned_id(value: String): Self = StObject.set(x, "signed_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectUploadDelegate extends StObject {
    
    var directUploadWillCreateBlobWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.native
    
    var directUploadWillStoreFileWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.native
  }
  object DirectUploadDelegate {
    
    @scala.inline
    def apply(): DirectUploadDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectUploadDelegate]
    }
    
    @scala.inline
    implicit class DirectUploadDelegateMutableBuilder[Self <: DirectUploadDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectUploadWillCreateBlobWithXHR(value: /* xhr */ XMLHttpRequest => Unit): Self = StObject.set(x, "directUploadWillCreateBlobWithXHR", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirectUploadWillCreateBlobWithXHRUndefined: Self = StObject.set(x, "directUploadWillCreateBlobWithXHR", js.undefined)
      
      @scala.inline
      def setDirectUploadWillStoreFileWithXHR(value: /* xhr */ XMLHttpRequest => Unit): Self = StObject.set(x, "directUploadWillStoreFileWithXHR", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirectUploadWillStoreFileWithXHRUndefined: Self = StObject.set(x, "directUploadWillStoreFileWithXHR", js.undefined)
    }
  }
}

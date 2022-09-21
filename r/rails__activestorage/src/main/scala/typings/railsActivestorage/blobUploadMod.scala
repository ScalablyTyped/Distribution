package typings.railsActivestorage

import typings.railsActivestorage.anon.DirectUploadData
import typings.std.Blob
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blobUploadMod {
  
  @JSImport("@rails/activestorage/src/blob_upload", "BlobUpload")
  @js.native
  open class BlobUpload protected () extends StObject {
    def this(blob: DirectUploadData) = this()
    
    def create(callback: js.Function2[/* error */ js.Error, /* blob */ Blob, Unit]): Unit = js.native
    
    var xhr: XMLHttpRequest = js.native
  }
}

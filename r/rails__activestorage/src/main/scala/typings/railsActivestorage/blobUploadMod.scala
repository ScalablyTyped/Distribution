package typings.railsActivestorage

import typings.railsActivestorage.anon.DirectUploadData
import typings.std.Blob
import typings.std.Error
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/activestorage/src/blob_upload", JSImport.Namespace)
@js.native
object blobUploadMod extends js.Object {
  
  @js.native
  class BlobUpload protected () extends js.Object {
    def this(blob: DirectUploadData) = this()
    
    def create(callback: js.Function2[/* error */ Error, /* blob */ Blob, Unit]): Unit = js.native
    
    var xhr: XMLHttpRequest = js.native
  }
}

package typings.s3DownloadStream

import typings.awsSdk.clientsS3Mod.GetObjectRequest
import typings.awsSdk.mod.S3
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: S3StreamDownloaderOptions): Readable = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  @JSImport("s3-download-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait S3StreamDownloaderOptions extends StObject {
    
    var chunkSize: js.UndefOr[String] = js.undefined
    
    var client: S3
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var params: GetObjectRequest
  }
  object S3StreamDownloaderOptions {
    
    inline def apply(client: S3, params: GetObjectRequest): S3StreamDownloaderOptions = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3StreamDownloaderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: S3StreamDownloaderOptions] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: String): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setClient(value: S3): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setParams(value: GetObjectRequest): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}

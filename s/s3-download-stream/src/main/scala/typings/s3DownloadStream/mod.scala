package typings.s3DownloadStream

import typings.awsSdk.mod.S3
import typings.awsSdk.s3Mod.GetObjectRequest
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("s3-download-stream", JSImport.Namespace)
  @js.native
  def apply(options: S3StreamDownloaderOptions): Readable = js.native
  
  @js.native
  trait S3StreamDownloaderOptions extends StObject {
    
    var chunkSize: js.UndefOr[String] = js.native
    
    var client: S3 = js.native
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var params: GetObjectRequest = js.native
  }
  object S3StreamDownloaderOptions {
    
    @scala.inline
    def apply(client: S3, params: GetObjectRequest): S3StreamDownloaderOptions = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3StreamDownloaderOptions]
    }
    
    @scala.inline
    implicit class S3StreamDownloaderOptionsMutableBuilder[Self <: S3StreamDownloaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkSize(value: String): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setClient(value: S3): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setParams(value: GetObjectRequest): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}

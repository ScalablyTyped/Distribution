package typings.s3rver

import typings.node.bufferMod.global.Buffer
import typings.node.http2Mod.Http2ServerRequest
import typings.node.http2Mod.Http2ServerResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.AddressInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("s3rver", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with S3rver {
    def this(options: S3rverOptions) = this()
  }
  
  @js.native
  trait S3rver extends StObject {
    
    def callback(): js.Function2[
        /* req */ IncomingMessage | Http2ServerRequest, 
        /* res */ ServerResponse[IncomingMessage] | Http2ServerResponse, 
        Unit
      ] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
    
    def configureBuckets(): js.Promise[Unit] = js.native
    
    def getMiddleware(): js.Function2[
        /* req */ IncomingMessage | Http2ServerRequest, 
        /* res */ ServerResponse[IncomingMessage] | Http2ServerResponse, 
        Unit
      ] = js.native
    
    def reset(): Unit = js.native
    
    def run(): js.Promise[AddressInfo] = js.native
    def run(callback: js.Function2[/* error */ js.Error | Null, /* address */ AddressInfo, Unit]): this.type = js.native
  }
  
  trait S3rverBucketConfig extends StObject {
    
    var configs: js.Array[String | Buffer]
    
    var name: String
  }
  object S3rverBucketConfig {
    
    inline def apply(configs: js.Array[String | Buffer], name: String): S3rverBucketConfig = {
      val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3rverBucketConfig]
    }
    
    extension [Self <: S3rverBucketConfig](x: Self) {
      
      inline def setConfigs(value: js.Array[String | Buffer]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsVarargs(value: (String | Buffer)*): Self = StObject.set(x, "configs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3rverOptions extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var allowMismatchedSignatures: js.UndefOr[Boolean] = js.undefined
    
    var cert: js.UndefOr[String | Buffer] = js.undefined
    
    var configureBuckets: js.UndefOr[js.Array[S3rverBucketConfig]] = js.undefined
    
    var directory: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String | Buffer] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var resetOnClose: js.UndefOr[Boolean] = js.undefined
    
    var serviceEndpoint: js.UndefOr[String] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var vhostBuckets: js.UndefOr[Boolean] = js.undefined
  }
  object S3rverOptions {
    
    inline def apply(): S3rverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3rverOptions]
    }
    
    extension [Self <: S3rverOptions](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setAllowMismatchedSignatures(value: Boolean): Self = StObject.set(x, "allowMismatchedSignatures", value.asInstanceOf[js.Any])
      
      inline def setAllowMismatchedSignaturesUndefined: Self = StObject.set(x, "allowMismatchedSignatures", js.undefined)
      
      inline def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setConfigureBuckets(value: js.Array[S3rverBucketConfig]): Self = StObject.set(x, "configureBuckets", value.asInstanceOf[js.Any])
      
      inline def setConfigureBucketsUndefined: Self = StObject.set(x, "configureBuckets", js.undefined)
      
      inline def setConfigureBucketsVarargs(value: S3rverBucketConfig*): Self = StObject.set(x, "configureBuckets", js.Array(value*))
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setResetOnClose(value: Boolean): Self = StObject.set(x, "resetOnClose", value.asInstanceOf[js.Any])
      
      inline def setResetOnCloseUndefined: Self = StObject.set(x, "resetOnClose", js.undefined)
      
      inline def setServiceEndpoint(value: String): Self = StObject.set(x, "serviceEndpoint", value.asInstanceOf[js.Any])
      
      inline def setServiceEndpointUndefined: Self = StObject.set(x, "serviceEndpoint", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setVhostBuckets(value: Boolean): Self = StObject.set(x, "vhostBuckets", value.asInstanceOf[js.Any])
      
      inline def setVhostBucketsUndefined: Self = StObject.set(x, "vhostBuckets", js.undefined)
    }
  }
}

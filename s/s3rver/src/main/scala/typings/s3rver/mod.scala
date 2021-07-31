package typings.s3rver

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("s3rver", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with S3rver {
    def this(options: S3rverOptions) = this()
  }
  
  @js.native
  trait S3rver extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    // Should return S3rver, but doesn't in all cases, currently
    // See https://github.com/jamhall/s3rver/pull/571
    def close(callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
    
    def run(): js.Promise[String] = js.native
    def run(
      callback: js.Function4[
          /* error */ Error | Null, 
          /* hostname */ String, 
          /* port */ Double, 
          /* directory */ String, 
          Unit
        ]
    ): S3rver = js.native
    
    def setDirectory(directory: String): S3rver = js.native
    
    def setErrorDocument(errorDocument: String): S3rver = js.native
    
    def setHostname(hostname: String): S3rver = js.native
    
    def setIndexDocument(indexDocument: String): S3rver = js.native
    
    def setPort(port: Double): S3rver = js.native
    
    def setSilent(silent: Boolean): S3rver = js.native
  }
  
  trait S3rverBucketConfig extends StObject {
    
    var configs: js.Array[Buffer | String]
    
    var name: String
  }
  object S3rverBucketConfig {
    
    @scala.inline
    def apply(configs: js.Array[Buffer | String], name: String): S3rverBucketConfig = {
      val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3rverBucketConfig]
    }
    
    @scala.inline
    implicit class S3rverBucketConfigMutableBuilder[Self <: S3rverBucketConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigs(value: js.Array[Buffer | String]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigsVarargs(value: (Buffer | String)*): Self = StObject.set(x, "configs", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3rverOptions extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var cert: js.UndefOr[String | Buffer] = js.undefined
    
    var configureBuckets: js.UndefOr[js.Array[S3rverBucketConfig]] = js.undefined
    
    var directory: String
    
    var errorDocument: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var indexDocument: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String | Buffer] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var resetOnClose: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object S3rverOptions {
    
    @scala.inline
    def apply(directory: String): S3rverOptions = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3rverOptions]
    }
    
    @scala.inline
    implicit class S3rverOptionsMutableBuilder[Self <: S3rverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setConfigureBuckets(value: js.Array[S3rverBucketConfig]): Self = StObject.set(x, "configureBuckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigureBucketsUndefined: Self = StObject.set(x, "configureBuckets", js.undefined)
      
      @scala.inline
      def setConfigureBucketsVarargs(value: S3rverBucketConfig*): Self = StObject.set(x, "configureBuckets", js.Array(value :_*))
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDocument(value: String): Self = StObject.set(x, "errorDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDocumentUndefined: Self = StObject.set(x, "errorDocument", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setIndexDocument(value: String): Self = StObject.set(x, "indexDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexDocumentUndefined: Self = StObject.set(x, "indexDocument", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setResetOnClose(value: Boolean): Self = StObject.set(x, "resetOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnCloseUndefined: Self = StObject.set(x, "resetOnClose", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}

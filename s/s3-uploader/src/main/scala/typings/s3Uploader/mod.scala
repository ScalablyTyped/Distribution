package typings.s3Uploader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("s3-uploader", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Upload {
    def this(awsBucketName: String, opts: S3UploaderOptions) = this()
  }
  
  trait Meta extends StObject {
    
    var colorSpace: String
    
    var compression: String
    
    var fileSize: String
    
    var format: String
    
    var imageSize: typings.s3Uploader.mod.imageSize
    
    var orientation: String
    
    var quallity: String
  }
  object Meta {
    
    inline def apply(
      colorSpace: String,
      compression: String,
      fileSize: String,
      format: String,
      imageSize: imageSize,
      orientation: String,
      quallity: String
    ): Meta = {
      val __obj = js.Dynamic.literal(colorSpace = colorSpace.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], quallity = quallity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    extension [Self <: Meta](x: Self) {
      
      inline def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
      
      inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setImageSize(value: imageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setQuallity(value: String): Self = StObject.set(x, "quallity", value.asInstanceOf[js.Any])
    }
  }
  
  trait S3UploaderOptions extends StObject {
    
    var awsAccessKeyId: js.UndefOr[String] = js.undefined
    
    var awsBucketAcl: js.UndefOr[String] = js.undefined
    
    var awsBucketPath: js.UndefOr[String] = js.undefined
    
    var awsBucketRegion: js.UndefOr[String] = js.undefined
    
    var awsHttpTimeout: js.UndefOr[Double] = js.undefined
    
    var awsMaxRetries: js.UndefOr[Double] = js.undefined
    
    var awsSecretAccessKey: js.UndefOr[String] = js.undefined
    
    var resizeQuality: js.UndefOr[Double] = js.undefined
    
    var returnExif: js.UndefOr[Boolean] = js.undefined
    
    var tmpDir: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var versions: js.UndefOr[js.Array[S3UploaderVersion]] = js.undefined
    
    var workers: js.UndefOr[Double] = js.undefined
  }
  object S3UploaderOptions {
    
    inline def apply(): S3UploaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3UploaderOptions]
    }
    
    extension [Self <: S3UploaderOptions](x: Self) {
      
      inline def setAwsAccessKeyId(value: String): Self = StObject.set(x, "awsAccessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAwsAccessKeyIdUndefined: Self = StObject.set(x, "awsAccessKeyId", js.undefined)
      
      inline def setAwsBucketAcl(value: String): Self = StObject.set(x, "awsBucketAcl", value.asInstanceOf[js.Any])
      
      inline def setAwsBucketAclUndefined: Self = StObject.set(x, "awsBucketAcl", js.undefined)
      
      inline def setAwsBucketPath(value: String): Self = StObject.set(x, "awsBucketPath", value.asInstanceOf[js.Any])
      
      inline def setAwsBucketPathUndefined: Self = StObject.set(x, "awsBucketPath", js.undefined)
      
      inline def setAwsBucketRegion(value: String): Self = StObject.set(x, "awsBucketRegion", value.asInstanceOf[js.Any])
      
      inline def setAwsBucketRegionUndefined: Self = StObject.set(x, "awsBucketRegion", js.undefined)
      
      inline def setAwsHttpTimeout(value: Double): Self = StObject.set(x, "awsHttpTimeout", value.asInstanceOf[js.Any])
      
      inline def setAwsHttpTimeoutUndefined: Self = StObject.set(x, "awsHttpTimeout", js.undefined)
      
      inline def setAwsMaxRetries(value: Double): Self = StObject.set(x, "awsMaxRetries", value.asInstanceOf[js.Any])
      
      inline def setAwsMaxRetriesUndefined: Self = StObject.set(x, "awsMaxRetries", js.undefined)
      
      inline def setAwsSecretAccessKey(value: String): Self = StObject.set(x, "awsSecretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setAwsSecretAccessKeyUndefined: Self = StObject.set(x, "awsSecretAccessKey", js.undefined)
      
      inline def setResizeQuality(value: Double): Self = StObject.set(x, "resizeQuality", value.asInstanceOf[js.Any])
      
      inline def setResizeQualityUndefined: Self = StObject.set(x, "resizeQuality", js.undefined)
      
      inline def setReturnExif(value: Boolean): Self = StObject.set(x, "returnExif", value.asInstanceOf[js.Any])
      
      inline def setReturnExifUndefined: Self = StObject.set(x, "returnExif", js.undefined)
      
      inline def setTmpDir(value: String): Self = StObject.set(x, "tmpDir", value.asInstanceOf[js.Any])
      
      inline def setTmpDirUndefined: Self = StObject.set(x, "tmpDir", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersions(value: js.Array[S3UploaderVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
      
      inline def setVersionsVarargs(value: S3UploaderVersion*): Self = StObject.set(x, "versions", js.Array(value*))
      
      inline def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  trait S3UploaderVersion extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var original: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object S3UploaderVersion {
    
    inline def apply(): S3UploaderVersion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3UploaderVersion]
    }
    
    extension [Self <: S3UploaderVersion](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setOriginal(value: Boolean): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait Upload extends StObject {
    
    def upload(src: String): Unit = js.native
    def upload(
      src: String,
      opts: Unit,
      cb: js.Function3[/* err */ String, /* images */ js.Array[image], /* meta */ Meta, Unit]
    ): Unit = js.native
    def upload(src: String, opts: S3UploaderOptions): Unit = js.native
    def upload(
      src: String,
      opts: S3UploaderOptions,
      cb: js.Function3[/* err */ String, /* images */ js.Array[image], /* meta */ Meta, Unit]
    ): Unit = js.native
  }
  
  trait image extends StObject {
    
    var etag: String
    
    var format: String
    
    var height: Double
    
    var original: Boolean
    
    var path: String
    
    var size: String
    
    var src: String
    
    var url: String
    
    var width: Double
  }
  object image {
    
    inline def apply(
      etag: String,
      format: String,
      height: Double,
      original: Boolean,
      path: String,
      size: String,
      src: String,
      url: String,
      width: Double
    ): image = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[image]
    }
    
    extension [Self <: image](x: Self) {
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: Boolean): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait imageSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object imageSize {
    
    inline def apply(height: Double, width: Double): imageSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[imageSize]
    }
    
    extension [Self <: imageSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

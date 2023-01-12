package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ************ This module includes the following data parsing plugins:
trait BodyParserOptions extends StObject {
  
  /**
    * If you want checksums calculated for incoming files, set this to either sha1 or md5.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * If you want the uploaded files to include the extensions of the original files (multipart uploads only). Does nothing if multipartFileHandler is defined.
    */
  var keepExtensions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If req.params should be filled with the contents of files sent through a multipart request.
    * Formidable is used internally for parsing, and a file is denoted as a multipart part with the filename option set in its Content-Disposition.
    * This will only be performed if mapParams is true.
    */
  var mapFiles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If req.params should be filled with parsed parameters from HTTP body.
    */
  var mapParams: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum size in bytes allowed in the HTTP body. Useful for limiting clients from hogging server memory.
    */
  var maxBodySize: js.UndefOr[Double] = js.undefined
  
  var maxFieldsSize: js.UndefOr[Double] = js.undefined
  
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A callback to handle any multipart file.
    * It will be a file if the part have a Content-Disposition with the filename parameter set.
    * This typically happens when a browser sends a form and there is a parameter similar to <input type="file" />.
    * If this is not provided, the default behaviour is to map the contents into req.params.
    */
  var multipartFileHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * A callback to handle any multipart part which is not a file.
    * If this is omitted, the default handler is invoked which may or may not map the parts into req.params, depending on the mapParams-option.
    */
  var multipartHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * If you want to support html5 multiple attribute in upload fields.
    */
  var multiples: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If an entry in req.params should be overwritten by the value in the body if the names are the same.
    * For instance, if you have the route /:someval, and someone posts an x-www-form-urlencoded Content-Type with the body someval=happy to /sad,
    * the value will be happy if overrideParams is true, sad otherwise.
    */
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true if you want to end the request with a UnsupportedMediaTypeError when none of the supported content types was given.
    */
  var rejectUnknown: js.UndefOr[Boolean] = js.undefined
  
  var requestBodyOnGet: js.UndefOr[Boolean] = js.undefined
  
  var reviver: js.UndefOr[Any] = js.undefined
  
  /**
    * Where uploaded files are intermediately stored during transfer before the contents is mapped into req.params. Does nothing if multipartFileHandler is defined.
    */
  var uploadDir: js.UndefOr[String] = js.undefined
}
object BodyParserOptions {
  
  inline def apply(): BodyParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyParserOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyParserOptions] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
    
    inline def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
    
    inline def setMapFiles(value: Boolean): Self = StObject.set(x, "mapFiles", value.asInstanceOf[js.Any])
    
    inline def setMapFilesUndefined: Self = StObject.set(x, "mapFiles", js.undefined)
    
    inline def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
    
    inline def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
    
    inline def setMaxBodySize(value: Double): Self = StObject.set(x, "maxBodySize", value.asInstanceOf[js.Any])
    
    inline def setMaxBodySizeUndefined: Self = StObject.set(x, "maxBodySize", js.undefined)
    
    inline def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setMultipartFileHandler(value: () => Unit): Self = StObject.set(x, "multipartFileHandler", js.Any.fromFunction0(value))
    
    inline def setMultipartFileHandlerUndefined: Self = StObject.set(x, "multipartFileHandler", js.undefined)
    
    inline def setMultipartHandler(value: () => Unit): Self = StObject.set(x, "multipartHandler", js.Any.fromFunction0(value))
    
    inline def setMultipartHandlerUndefined: Self = StObject.set(x, "multipartHandler", js.undefined)
    
    inline def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
    
    inline def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
    
    inline def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
    
    inline def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
    
    inline def setRejectUnknown(value: Boolean): Self = StObject.set(x, "rejectUnknown", value.asInstanceOf[js.Any])
    
    inline def setRejectUnknownUndefined: Self = StObject.set(x, "rejectUnknown", js.undefined)
    
    inline def setRequestBodyOnGet(value: Boolean): Self = StObject.set(x, "requestBodyOnGet", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyOnGetUndefined: Self = StObject.set(x, "requestBodyOnGet", js.undefined)
    
    inline def setReviver(value: Any): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
    
    inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    
    inline def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
    
    inline def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
  }
}

package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ************ This module includes the following data parsing plugins:
@js.native
trait BodyParserOptions extends js.Object {
  
  /**
    * If you want checksums calculated for incoming files, set this to either sha1 or md5.
    */
  var hash: js.UndefOr[String] = js.native
  
  /**
    * If you want the uploaded files to include the extensions of the original files (multipart uploads only). Does nothing if multipartFileHandler is defined.
    */
  var keepExtensions: js.UndefOr[Boolean] = js.native
  
  /**
    * If req.params should be filled with the contents of files sent through a multipart request.
    * Formidable is used internally for parsing, and a file is denoted as a multipart part with the filename option set in its Content-Disposition.
    * This will only be performed if mapParams is true.
    */
  var mapFiles: js.UndefOr[Boolean] = js.native
  
  /**
    * If req.params should be filled with parsed parameters from HTTP body.
    */
  var mapParams: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum size in bytes allowed in the HTTP body. Useful for limiting clients from hogging server memory.
    */
  var maxBodySize: js.UndefOr[Double] = js.native
  
  var maxFieldsSize: js.UndefOr[Double] = js.native
  
  var maxFileSize: js.UndefOr[Double] = js.native
  
  /**
    * A callback to handle any multipart file.
    * It will be a file if the part have a Content-Disposition with the filename parameter set.
    * This typically happens when a browser sends a form and there is a parameter similar to <input type="file" />.
    * If this is not provided, the default behaviour is to map the contents into req.params.
    */
  var multipartFileHandler: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A callback to handle any multipart part which is not a file.
    * If this is omitted, the default handler is invoked which may or may not map the parts into req.params, depending on the mapParams-option.
    */
  var multipartHandler: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * If you want to support html5 multiple attribute in upload fields.
    */
  var multiples: js.UndefOr[Boolean] = js.native
  
  /**
    * If an entry in req.params should be overwritten by the value in the body if the names are the same.
    * For instance, if you have the route /:someval, and someone posts an x-www-form-urlencoded Content-Type with the body someval=happy to /sad,
    * the value will be happy if overrideParams is true, sad otherwise.
    */
  var overrideParams: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true if you want to end the request with a UnsupportedMediaTypeError when none of the supported content types was given.
    */
  var rejectUnknown: js.UndefOr[Boolean] = js.native
  
  var requestBodyOnGet: js.UndefOr[Boolean] = js.native
  
  var reviver: js.UndefOr[js.Any] = js.native
  
  /**
    * Where uploaded files are intermediately stored during transfer before the contents is mapped into req.params. Does nothing if multipartFileHandler is defined.
    */
  var uploadDir: js.UndefOr[String] = js.native
}
object BodyParserOptions {
  
  @scala.inline
  def apply(): BodyParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyParserOptions]
  }
  
  @scala.inline
  implicit class BodyParserOptionsOps[Self <: BodyParserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setKeepExtensions(value: Boolean): Self = this.set("keepExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepExtensions: Self = this.set("keepExtensions", js.undefined)
    
    @scala.inline
    def setMapFiles(value: Boolean): Self = this.set("mapFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapFiles: Self = this.set("mapFiles", js.undefined)
    
    @scala.inline
    def setMapParams(value: Boolean): Self = this.set("mapParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapParams: Self = this.set("mapParams", js.undefined)
    
    @scala.inline
    def setMaxBodySize(value: Double): Self = this.set("maxBodySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBodySize: Self = this.set("maxBodySize", js.undefined)
    
    @scala.inline
    def setMaxFieldsSize(value: Double): Self = this.set("maxFieldsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFieldsSize: Self = this.set("maxFieldsSize", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    
    @scala.inline
    def setMultipartFileHandler(value: () => Unit): Self = this.set("multipartFileHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMultipartFileHandler: Self = this.set("multipartFileHandler", js.undefined)
    
    @scala.inline
    def setMultipartHandler(value: () => Unit): Self = this.set("multipartHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMultipartHandler: Self = this.set("multipartHandler", js.undefined)
    
    @scala.inline
    def setMultiples(value: Boolean): Self = this.set("multiples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiples: Self = this.set("multiples", js.undefined)
    
    @scala.inline
    def setOverrideParams(value: Boolean): Self = this.set("overrideParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideParams: Self = this.set("overrideParams", js.undefined)
    
    @scala.inline
    def setRejectUnknown(value: Boolean): Self = this.set("rejectUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnknown: Self = this.set("rejectUnknown", js.undefined)
    
    @scala.inline
    def setRequestBodyOnGet(value: Boolean): Self = this.set("requestBodyOnGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBodyOnGet: Self = this.set("requestBodyOnGet", js.undefined)
    
    @scala.inline
    def setReviver(value: js.Any): Self = this.set("reviver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviver: Self = this.set("reviver", js.undefined)
    
    @scala.inline
    def setUploadDir(value: String): Self = this.set("uploadDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadDir: Self = this.set("uploadDir", js.undefined)
  }
}

package typings.qiniuJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.qiniuJs.esmUploadBaseMod.Progress
import typings.qiniuJs.esmUtilsHelperMod.XHRHandler
import typings.std.BodyInit
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<qiniu-js.qiniu-js/esm/utils.RequestOptions> */
trait PartialRequestOptions extends StObject {
  
  var body: js.UndefOr[BodyInit | Null] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var onCreate: js.UndefOr[XHRHandler] = js.undefined
  
  var onProgress: js.UndefOr[js.Function1[/* data */ Progress, Unit]] = js.undefined
}
object PartialRequestOptions {
  
  inline def apply(): PartialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRequestOptions] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOnCreate(value: /* xhr */ XMLHttpRequest => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
    
    inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
    
    inline def setOnProgress(value: /* data */ Progress => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
  }
}

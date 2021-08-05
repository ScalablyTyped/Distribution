package typings.reactNativeViewPdf

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-16`
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-8`
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.base64
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.bundle
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.documentsDirectory
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.file
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.url
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-view-pdf", JSImport.Default)
  @js.native
  class default ()
    extends Component[PDFViewProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeViewPdf.reactNativeViewPdfStrings.GET
    - typings.reactNativeViewPdf.reactNativeViewPdfStrings.HEAD
    - typings.reactNativeViewPdf.reactNativeViewPdfStrings.POST
    - typings.reactNativeViewPdf.reactNativeViewPdfStrings.PUT
    - typings.reactNativeViewPdf.reactNativeViewPdfStrings.DELETE
    - typings.reactNativeViewPdf.reactNativeViewPdfStrings.CONNECT
    - typings.reactNativeViewPdf.reactNativeViewPdfStrings.OPTIONS
    - typings.reactNativeViewPdf.reactNativeViewPdfStrings.TRACE
    - typings.reactNativeViewPdf.reactNativeViewPdfStrings.PATCH
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    inline def CONNECT: typings.reactNativeViewPdf.reactNativeViewPdfStrings.CONNECT = "CONNECT".asInstanceOf[typings.reactNativeViewPdf.reactNativeViewPdfStrings.CONNECT]
    
    inline def DELETE: typings.reactNativeViewPdf.reactNativeViewPdfStrings.DELETE = "DELETE".asInstanceOf[typings.reactNativeViewPdf.reactNativeViewPdfStrings.DELETE]
    
    inline def GET: typings.reactNativeViewPdf.reactNativeViewPdfStrings.GET = "GET".asInstanceOf[typings.reactNativeViewPdf.reactNativeViewPdfStrings.GET]
    
    inline def HEAD: typings.reactNativeViewPdf.reactNativeViewPdfStrings.HEAD = "HEAD".asInstanceOf[typings.reactNativeViewPdf.reactNativeViewPdfStrings.HEAD]
    
    inline def OPTIONS: typings.reactNativeViewPdf.reactNativeViewPdfStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.reactNativeViewPdf.reactNativeViewPdfStrings.OPTIONS]
    
    inline def PATCH: typings.reactNativeViewPdf.reactNativeViewPdfStrings.PATCH = "PATCH".asInstanceOf[typings.reactNativeViewPdf.reactNativeViewPdfStrings.PATCH]
    
    inline def POST: typings.reactNativeViewPdf.reactNativeViewPdfStrings.POST = "POST".asInstanceOf[typings.reactNativeViewPdf.reactNativeViewPdfStrings.POST]
    
    inline def PUT: typings.reactNativeViewPdf.reactNativeViewPdfStrings.PUT = "PUT".asInstanceOf[typings.reactNativeViewPdf.reactNativeViewPdfStrings.PUT]
    
    inline def TRACE: typings.reactNativeViewPdf.reactNativeViewPdfStrings.TRACE = "TRACE".asInstanceOf[typings.reactNativeViewPdf.reactNativeViewPdfStrings.TRACE]
  }
  
  type PDFView = Component[PDFViewProps, js.Object, js.Any]
  
  trait PDFViewProps
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var fadeInDuration: js.UndefOr[Double] = js.undefined
    
    var fileFrom: js.UndefOr[bundle | documentsDirectory] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPageChanged: js.UndefOr[js.Function2[/* page */ Double, /* pageCount */ Double, Unit]] = js.undefined
    
    var onScrolled: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
    
    var resource: String
    
    var resourceType: js.UndefOr[url | base64 | file] = js.undefined
    
    var textEncoding: js.UndefOr[`utf-8` | `utf-16`] = js.undefined
    
    var urlProps: js.UndefOr[URLProps] = js.undefined
  }
  object PDFViewProps {
    
    inline def apply(resource: String): PDFViewProps = {
      val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFViewProps]
    }
    
    extension [Self <: PDFViewProps](x: Self) {
      
      inline def setFadeInDuration(value: Double): Self = StObject.set(x, "fadeInDuration", value.asInstanceOf[js.Any])
      
      inline def setFadeInDurationUndefined: Self = StObject.set(x, "fadeInDuration", js.undefined)
      
      inline def setFileFrom(value: bundle | documentsDirectory): Self = StObject.set(x, "fileFrom", value.asInstanceOf[js.Any])
      
      inline def setFileFromUndefined: Self = StObject.set(x, "fileFrom", js.undefined)
      
      inline def setOnError(value: /* error */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnPageChanged(value: (/* page */ Double, /* pageCount */ Double) => Unit): Self = StObject.set(x, "onPageChanged", js.Any.fromFunction2(value))
      
      inline def setOnPageChangedUndefined: Self = StObject.set(x, "onPageChanged", js.undefined)
      
      inline def setOnScrolled(value: /* offset */ Double => Unit): Self = StObject.set(x, "onScrolled", js.Any.fromFunction1(value))
      
      inline def setOnScrolledUndefined: Self = StObject.set(x, "onScrolled", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceType(value: url | base64 | file): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
      
      inline def setTextEncoding(value: `utf-8` | `utf-16`): Self = StObject.set(x, "textEncoding", value.asInstanceOf[js.Any])
      
      inline def setTextEncodingUndefined: Self = StObject.set(x, "textEncoding", js.undefined)
      
      inline def setUrlProps(value: URLProps): Self = StObject.set(x, "urlProps", value.asInstanceOf[js.Any])
      
      inline def setUrlPropsUndefined: Self = StObject.set(x, "urlProps", js.undefined)
    }
  }
  
  trait URLProps extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: js.UndefOr[HTTPMethod] = js.undefined
  }
  object URLProps {
    
    inline def apply(): URLProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLProps]
    }
    
    extension [Self <: URLProps](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: HTTPMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}

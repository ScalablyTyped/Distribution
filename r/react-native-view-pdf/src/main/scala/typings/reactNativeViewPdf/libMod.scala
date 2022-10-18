package typings.reactNativeViewPdf

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeViewPdf.anon.Message
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-16`
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-8`
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.base64
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.bundle
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.cachesDirectory
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.documentsDirectory
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.file
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.libraryDirectory
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.tempDirectory
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("react-native-view-pdf/lib", JSImport.Default)
  @js.native
  open class default () extends PDFView
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-native-view-pdf/lib", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-native-view-pdf/lib", "default.defaultProps.enableAnnotations")
      @js.native
      def enableAnnotations: Boolean = js.native
      inline def enableAnnotations_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableAnnotations")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-view-pdf/lib", "default.defaultProps.fadeInDuration")
      @js.native
      def fadeInDuration: Double = js.native
      inline def fadeInDuration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fadeInDuration")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-view-pdf/lib", "default.defaultProps.fileFrom")
      @js.native
      def fileFrom: String = js.native
      inline def fileFrom_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileFrom")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-view-pdf/lib", "default.defaultProps.resourceType")
      @js.native
      def resourceType: String = js.native
      inline def resourceType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-view-pdf/lib", "default.defaultProps.textEncoding")
      @js.native
      def textEncoding: String = js.native
      inline def textEncoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textEncoding")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PDFView
    extends Component[PDFViewProps, js.Object, Any] {
    
    def _getCommands(): Any = js.native
    
    def _setViewRef(ref: Any): Unit = js.native
    
    var _viewerRef: Any = js.native
    
    def onError(event: Any): Unit = js.native
    
    def onPageChanged(event: Any): Unit = js.native
    
    def onScrolled(event: Any): Unit = js.native
    
    /**
      * A Function. Invoke it when PDF document needs to be reloaded. Use `ref` to
      * access it. Throws an exception in case of errors
      */
    def reload(): js.Promise[Unit] = js.native
  }
  
  trait PDFViewProps extends StObject {
    
    /**
      * A Boolean value. Enables annotations view on Android
      *   - false, default
      */
    var enableAnnotations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Number value. Fades in the webview (in ms) on load successfully (iOS Only):
      *   - 0.0, default
      */
    var fadeInDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * iOS file location. Can be one of:
      *   - "bundle"
      *   - "documentsDirectory"
      *   - "libraryDirectory"
      *   - "cachesDirectory"
      *   - "tempDirectory"
      */
    var fileFrom: js.UndefOr[bundle | documentsDirectory | libraryDirectory | cachesDirectory | tempDirectory] = js.undefined
    
    /**
      * A Function. Invoked on load error with {nativeEvent: {error}}.
      */
    var onError: js.UndefOr[js.Function1[/* error */ Message, Unit]] = js.undefined
    
    /**
      * A Function. Invoked when load completes successfully.
      */
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A Function. Invoked when page is changed.
      * @param {Number} page - The active page.
      * @param {Number} pageCount - Total pages.
      */
    var onPageChanged: js.UndefOr[js.Function2[/* page */ Double, /* pageCount */ Double, Unit]] = js.undefined
    
    /**
      * A Function. Invoked when page is scrolled.
      * @param {Number} offset - Offset. Currently only 1 and 0 are supported.
      *                          where:
      *                            0 - beginning of the document
      *                            1 - end of the document
      */
    var onScrolled: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
    
    /**
      * A String value. Defines the resource to render. Can be one of:
      *   - url. Example: http://www.pdf995.com/samples/pdf.pdf
      *   - base64. Example: 'JVBERi0xLjcKCjEgMCBvYmogICUgZW50...'
      *   - fileName - Example: Platform.OS === 'ios' ?
      *       'test-pdf.pdf' : '/sdcard/Download/test-pdf.pdf'
      */
    var resource: String
    
    /**
      * A String value. Defines the resource type. Can be one of:
      *   - "url", for url
      *   - "base64", for base64 data
      *   - "file", for local files
      */
    var resourceType: js.UndefOr[url | base64 | file] = js.undefined
    
    /**
      * `style` View Style Property https://reactnative.dev/docs/view-style-props
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * A String value. Defines encoding type. Can be one of:
      *   - "utf-8", default
      *   - "utf-16"
      */
    var textEncoding: js.UndefOr[`utf-8` | `utf-16`] = js.undefined
    
    /**
      * Extended props for "url" resource type
      */
    var urlProps: js.UndefOr[PDFViewUrlProps] = js.undefined
  }
  object PDFViewProps {
    
    inline def apply(resource: String): PDFViewProps = {
      val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFViewProps]
    }
    
    extension [Self <: PDFViewProps](x: Self) {
      
      inline def setEnableAnnotations(value: Boolean): Self = StObject.set(x, "enableAnnotations", value.asInstanceOf[js.Any])
      
      inline def setEnableAnnotationsUndefined: Self = StObject.set(x, "enableAnnotations", js.undefined)
      
      inline def setFadeInDuration(value: Double): Self = StObject.set(x, "fadeInDuration", value.asInstanceOf[js.Any])
      
      inline def setFadeInDurationUndefined: Self = StObject.set(x, "fadeInDuration", js.undefined)
      
      inline def setFileFrom(value: bundle | documentsDirectory | libraryDirectory | cachesDirectory | tempDirectory): Self = StObject.set(x, "fileFrom", value.asInstanceOf[js.Any])
      
      inline def setFileFromUndefined: Self = StObject.set(x, "fileFrom", js.undefined)
      
      inline def setOnError(value: /* error */ Message => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
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
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextEncoding(value: `utf-8` | `utf-16`): Self = StObject.set(x, "textEncoding", value.asInstanceOf[js.Any])
      
      inline def setTextEncodingUndefined: Self = StObject.set(x, "textEncoding", js.undefined)
      
      inline def setUrlProps(value: PDFViewUrlProps): Self = StObject.set(x, "urlProps", value.asInstanceOf[js.Any])
      
      inline def setUrlPropsUndefined: Self = StObject.set(x, "urlProps", js.undefined)
    }
  }
  
  trait PDFViewUrlProps extends StObject {
    
    /**
      * `body` is the HTTP body to send with the request. This must be a valid
      * UTF-8 string, and will be sent exactly as specified, with no
      * additional encoding (e.g. URL-escaping or base64) applied.
      */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      * `headers` is an object representing the HTTP headers to send along with the
      * request for a remote image.
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * `method` is the HTTP Method to use. Defaults to GET if not specified.
      */
    var method: js.UndefOr[String] = js.undefined
  }
  object PDFViewUrlProps {
    
    inline def apply(): PDFViewUrlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFViewUrlProps]
    }
    
    extension [Self <: PDFViewUrlProps](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  trait UrlPropsType extends StObject {
    
    /**
      * `body` is the HTTP body to send with the request. This must be a valid
      * UTF-8 string, and will be sent exactly as specified, with no
      * additional encoding (e.g. URL-escaping or base64) applied.
      */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      * `headers` is an object representing the HTTP headers to send along with the
      * request for a remote image.
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * `method` is the HTTP Method to use. Defaults to GET if not specified.
      */
    var method: js.UndefOr[String] = js.undefined
  }
  object UrlPropsType {
    
    inline def apply(): UrlPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlPropsType]
    }
    
    extension [Self <: UrlPropsType](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}

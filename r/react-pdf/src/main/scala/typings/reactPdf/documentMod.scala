package typings.reactPdf

import typings.pdfjsDist.mod.PDFDocumentProxy
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactPdf.anon.PageNumber
import typings.reactPdf.reactPdfStrings._blank
import typings.reactPdf.reactPdfStrings._parent
import typings.reactPdf.reactPdfStrings._self
import typings.reactPdf.reactPdfStrings._top
import typings.reactPdf.reactPdfStrings.canvas
import typings.reactPdf.reactPdfStrings.none
import typings.reactPdf.reactPdfStrings.svg
import typings.std.Error
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  @JSImport("react-pdf/dist/Document", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  type Document = Component[Props, js.Object, js.Any]
  
  @js.native
  trait Props extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * Defines custom class name(s), that will be added to rendered element.
      * @default 'react-pdf__Document'
      */
    var className: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Defines what the component should display in case of an error.
      * @default 'Failed to load PDF file.'
      */
    var error: js.UndefOr[String | ReactElement | RenderFunction] = js.native
    
    /**
      * Defines link target for external links rendered in annotations.
      * Defaults to unset, which means that default behavior will be used.
      */
    var externalLinkTarget: js.UndefOr[_self | _blank | _parent | _top] = js.native
    
    /**
      * Defines what PDF should be displayed.
      * Its value can be an URL,
      * a file (imported using import ... from ... or from file input form element),
      * or an object with parameters
      *  (
      *   url - URL;
      *   data - data, preferably Uint8Array;
      *   range - PDFDataRangeTransport;
      *   httpHeaders - custom request headers, e.g. for authorization
      *   withCredentials - a boolean to indicate whether or not to include cookies in the request (defaults to false)
      *  )
      */
    var file: js.Any = js.native
    
    /**
      * A function that behaves like ref,
      * but it's passed to main `<div>` rendered by `<Document>` component.
      */
    var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.native
    
    /**
      * Defines what the component should display while loading.
      * @default 'Loading PDF…'
      */
    var loading: js.UndefOr[String | ReactElement | RenderFunction] = js.native
    
    /**
      * Defines what the component should display in case of no data.
      * @default 'No PDF file specified.'
      */
    var noData: js.UndefOr[String | ReactElement | RenderFunction] = js.native
    
    /**
      * Function called when an outline item has been clicked.
      * Usually, you would like to use this callback to move the user wherever they requested to.
      */
    var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ PageNumber, Unit]] = js.native
    
    /**
      * Function called in case of an error while loading a document.
      */
    var onLoadError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
    
    /**
      * Function called when the document is successfully loaded.
      */
    var onLoadSuccess: js.UndefOr[js.Function1[/* pdf */ PDFDocumentProxy, Unit]] = js.native
    
    /**
      * Function called when a password-protected PDF is loaded.
      * Defaults to a function that prompts the user for password.
      */
    var onPassword: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.native
    
    /**
      * Function called in case of an error while retrieving document source from `file` prop.
      */
    var onSourceError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
    
    /**
      * Function called when document source is successfully retrieved from `file` prop.
      */
    var onSourceSuccess: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * An object in which additional parameters to be passed to PDF.js can be defined.
      * For a full list of possible parameters, check PDF.js documentation on DocumentInitParameters.
      */
    var options: js.UndefOr[js.Any] = js.native
    
    /**
      * Defines the rendering mode of the document.
      * @default 'canvas'
      */
    var renderMode: js.UndefOr[canvas | svg | none] = js.native
    
    /**
      * Defines the rotation of the document in degrees.
      * If provided, will change rotation globally,
      * even for the pages which were given rotate prop of their own.
      * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
      */
    var rotate: js.UndefOr[Double] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(file: js.Any): Props = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value :_*))
      
      @scala.inline
      def setError(value: String | ReactElement | RenderFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFunction0(value: () => Element): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExternalLinkTarget(value: _self | _blank | _parent | _top): Self = StObject.set(x, "externalLinkTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalLinkTargetUndefined: Self = StObject.set(x, "externalLinkTarget", js.undefined)
      
      @scala.inline
      def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRef(value: LegacyRef[HTMLDivElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setLoading(value: String | ReactElement | RenderFunction): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingFunction0(value: () => Element): Self = StObject.set(x, "loading", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setNoData(value: String | ReactElement | RenderFunction): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDataFunction0(value: () => Element): Self = StObject.set(x, "noData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: /* hasPageNumber */ PageNumber => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnLoadError(value: /* error */ Error => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      @scala.inline
      def setOnLoadSuccess(value: /* pdf */ PDFDocumentProxy => Unit): Self = StObject.set(x, "onLoadSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadSuccessUndefined: Self = StObject.set(x, "onLoadSuccess", js.undefined)
      
      @scala.inline
      def setOnPassword(value: /* callback */ js.Function1[/* repeated */ js.Any, _] => Unit): Self = StObject.set(x, "onPassword", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasswordUndefined: Self = StObject.set(x, "onPassword", js.undefined)
      
      @scala.inline
      def setOnSourceError(value: /* error */ Error => Unit): Self = StObject.set(x, "onSourceError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSourceErrorUndefined: Self = StObject.set(x, "onSourceError", js.undefined)
      
      @scala.inline
      def setOnSourceSuccess(value: () => Unit): Self = StObject.set(x, "onSourceSuccess", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSourceSuccessUndefined: Self = StObject.set(x, "onSourceSuccess", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRenderMode(value: canvas | svg | none): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    }
  }
  
  type RenderFunction = js.Function0[Element]
}

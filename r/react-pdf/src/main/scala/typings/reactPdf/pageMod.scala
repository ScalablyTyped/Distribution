package typings.reactPdf

import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactPdf.reactPdfNumbers.`0`
import typings.reactPdf.reactPdfNumbers.`180`
import typings.reactPdf.reactPdfNumbers.`270`
import typings.reactPdf.reactPdfNumbers.`90`
import typings.reactPdf.reactPdfStrings.canvas
import typings.reactPdf.reactPdfStrings.none
import typings.reactPdf.reactPdfStrings.svg
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageMod {
  
  @JSImport("react-pdf/dist/Page", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  trait PDFPageItem extends StObject {
    
    var _transport: js.Object
    
    var commonObjs: js.Object
    
    def getAnnotations(args: Any*): Any
    
    def getTextContent(args: Any*): Any
    
    def getViewport(args: Any*): Any
    
    def render(args: Any*): Any
  }
  object PDFPageItem {
    
    inline def apply(
      _transport: js.Object,
      commonObjs: js.Object,
      getAnnotations: /* repeated */ Any => Any,
      getTextContent: /* repeated */ Any => Any,
      getViewport: /* repeated */ Any => Any,
      render: /* repeated */ Any => Any
    ): PDFPageItem = {
      val __obj = js.Dynamic.literal(_transport = _transport.asInstanceOf[js.Any], commonObjs = commonObjs.asInstanceOf[js.Any], getAnnotations = js.Any.fromFunction1(getAnnotations), getTextContent = js.Any.fromFunction1(getTextContent), getViewport = js.Any.fromFunction1(getViewport), render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[PDFPageItem]
    }
    
    extension [Self <: PDFPageItem](x: Self) {
      
      inline def setCommonObjs(value: js.Object): Self = StObject.set(x, "commonObjs", value.asInstanceOf[js.Any])
      
      inline def setGetAnnotations(value: /* repeated */ Any => Any): Self = StObject.set(x, "getAnnotations", js.Any.fromFunction1(value))
      
      inline def setGetTextContent(value: /* repeated */ Any => Any): Self = StObject.set(x, "getTextContent", js.Any.fromFunction1(value))
      
      inline def setGetViewport(value: /* repeated */ Any => Any): Self = StObject.set(x, "getViewport", js.Any.fromFunction1(value))
      
      inline def setRender(value: /* repeated */ Any => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def set_transport(value: js.Object): Self = StObject.set(x, "_transport", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PDFPageProxy
    extends typings.pdfjsDist.apiMod.PDFPageProxy {
    
    var height: Double = js.native
    
    var originalHeight: Double = js.native
    
    var originalWidth: Double = js.native
    
    var width: Double = js.native
  }
  
  type Page = Component[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    /**
      * A function that behaves like ref,
      * but it's passed to main `<canvas>` rendered by `<Page>` component.
      */
    var canvasRef: js.UndefOr[LegacyRef[HTMLCanvasElement]] = js.undefined
    
    /**
      * Defines custom class name(s), that will be added to rendered element.
      * @default 'react-pdf__Page'
      */
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * A function that customizes how a text layer is rendered.
      * Passes itext item and index for item.
      */
    var customTextRenderer: js.UndefOr[js.Function1[/* layer */ TextLayerItemInternal, Element]] = js.undefined
    
    /**
      * Defines what the component should display in case of an error.
      * @default 'Failed to load PDF file.'
      */
    var error: js.UndefOr[String | ReactElement | RenderFunction] = js.undefined
    
    /**
      * Defines the height of the page.
      * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
      * If you define `width` and `height` at the same time, `height` will be ignored.
      * If you define `height` and `scale` at the same time, the height will be multiplied by a given factor.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * A function that behaves like ref,
      * but it's passed to main `<div>` rendered by `<Page>` component.
      */
    var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.undefined
    
    /**
      * Defines what the component should display while loading.
      * @default 'Loading page…'
      */
    var loading: js.UndefOr[String | ReactElement | RenderFunction] = js.undefined
    
    /**
      * Defines what the component should display in case of no data.
      * @default 'No page specified.'
      */
    var noData: js.UndefOr[String | ReactElement | RenderFunction] = js.undefined
    
    /**
      * Function called when page has been clicked.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[typings.std.Element, NativeMouseEvent], 
          /* page */ PDFPageProxy, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Function called in case of an error while loading annotations.
      */
    var onGetAnnotationsError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /**
      * Function called when annotations are successfully loaded.
      */
    var onGetAnnotationsSuccess: js.UndefOr[js.Function1[/* annotations */ Any, Unit]] = js.undefined
    
    /**
      * Function called in case of an error while loading text layer items.
      */
    var onGetTextError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /**
      * Function called when text layer items are successfully loaded.
      */
    var onGetTextSuccess: js.UndefOr[js.Function1[/* items */ js.Array[TextItem], Unit]] = js.undefined
    
    /**
      * Function called in case of an error while loading the page.
      */
    var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /**
      * Function called when the page is successfully loaded.
      */
    var onLoadSuccess: js.UndefOr[js.Function1[/* page */ PDFPageProxy, Unit]] = js.undefined
    
    /**
      * Function called in case of an error while rendering the page.
      */
    var onRenderError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /**
      * Function called when the page is successfully rendered on the screen.
      */
    var onRenderSuccess: js.UndefOr[js.Function1[/* page */ PDFPageProxy, Unit]] = js.undefined
    
    /**
      * Defines which page from PDF file should be displayed.
      * @default 0
      */
    var pageIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines which page from PDF file should be displayed.
      * If provided, pageIndex prop will be ignored.
      * @default 1
      */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines whether annotations (e.g. links) should be rendered.
      * @default true
      */
    var renderAnnotationLayer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether interactive forms should be rendered.
      * `renderAnnotationLayer` prop must be set to true.
      * @default false
      */
    var renderInteractiveForms: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the rendering mode of the page.
      * @default 'canvas'
      */
    var renderMode: js.UndefOr[canvas | svg | none] = js.undefined
    
    /**
      * Defines whether a text layer should be rendered.
      * @default true
      */
    var renderTextLayer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the rotation of the page in degrees.
      * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
      * Defaults to page's default setting, usually 0.
      */
    var rotate: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the scale in which PDF file should be rendered.
      * @default 1.0
      */
    var scale: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the width of the page.
      * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
      * If you define `width` and `height` at the same time, `height` will be ignored.
      * If you define `width` and `scale` at the same time, the width will be multiplied by a given factor.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCanvasRef(value: LegacyRef[HTMLCanvasElement]): Self = StObject.set(x, "canvasRef", value.asInstanceOf[js.Any])
      
      inline def setCanvasRefFunction1(value: /* instance */ HTMLCanvasElement | Null => Unit): Self = StObject.set(x, "canvasRef", js.Any.fromFunction1(value))
      
      inline def setCanvasRefNull: Self = StObject.set(x, "canvasRef", null)
      
      inline def setCanvasRefUndefined: Self = StObject.set(x, "canvasRef", js.undefined)
      
      inline def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setCustomTextRenderer(value: /* layer */ TextLayerItemInternal => Element): Self = StObject.set(x, "customTextRenderer", js.Any.fromFunction1(value))
      
      inline def setCustomTextRendererUndefined: Self = StObject.set(x, "customTextRenderer", js.undefined)
      
      inline def setError(value: String | ReactElement | RenderFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction0(value: () => Element): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInputRef(value: LegacyRef[HTMLDivElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setLoading(value: String | ReactElement | RenderFunction): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingFunction0(value: () => Element): Self = StObject.set(x, "loading", js.Any.fromFunction0(value))
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setNoData(value: String | ReactElement | RenderFunction): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      inline def setNoDataFunction0(value: () => Element): Self = StObject.set(x, "noData", js.Any.fromFunction0(value))
      
      inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
      
      inline def setOnClick(
        value: (/* event */ MouseEvent[typings.std.Element, NativeMouseEvent], /* page */ PDFPageProxy) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnGetAnnotationsError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onGetAnnotationsError", js.Any.fromFunction1(value))
      
      inline def setOnGetAnnotationsErrorUndefined: Self = StObject.set(x, "onGetAnnotationsError", js.undefined)
      
      inline def setOnGetAnnotationsSuccess(value: /* annotations */ Any => Unit): Self = StObject.set(x, "onGetAnnotationsSuccess", js.Any.fromFunction1(value))
      
      inline def setOnGetAnnotationsSuccessUndefined: Self = StObject.set(x, "onGetAnnotationsSuccess", js.undefined)
      
      inline def setOnGetTextError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onGetTextError", js.Any.fromFunction1(value))
      
      inline def setOnGetTextErrorUndefined: Self = StObject.set(x, "onGetTextError", js.undefined)
      
      inline def setOnGetTextSuccess(value: /* items */ js.Array[TextItem] => Unit): Self = StObject.set(x, "onGetTextSuccess", js.Any.fromFunction1(value))
      
      inline def setOnGetTextSuccessUndefined: Self = StObject.set(x, "onGetTextSuccess", js.undefined)
      
      inline def setOnLoadError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
      
      inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      inline def setOnLoadSuccess(value: /* page */ PDFPageProxy => Unit): Self = StObject.set(x, "onLoadSuccess", js.Any.fromFunction1(value))
      
      inline def setOnLoadSuccessUndefined: Self = StObject.set(x, "onLoadSuccess", js.undefined)
      
      inline def setOnRenderError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onRenderError", js.Any.fromFunction1(value))
      
      inline def setOnRenderErrorUndefined: Self = StObject.set(x, "onRenderError", js.undefined)
      
      inline def setOnRenderSuccess(value: /* page */ PDFPageProxy => Unit): Self = StObject.set(x, "onRenderSuccess", js.Any.fromFunction1(value))
      
      inline def setOnRenderSuccessUndefined: Self = StObject.set(x, "onRenderSuccess", js.undefined)
      
      inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
      
      inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setRenderAnnotationLayer(value: Boolean): Self = StObject.set(x, "renderAnnotationLayer", value.asInstanceOf[js.Any])
      
      inline def setRenderAnnotationLayerUndefined: Self = StObject.set(x, "renderAnnotationLayer", js.undefined)
      
      inline def setRenderInteractiveForms(value: Boolean): Self = StObject.set(x, "renderInteractiveForms", value.asInstanceOf[js.Any])
      
      inline def setRenderInteractiveFormsUndefined: Self = StObject.set(x, "renderInteractiveForms", js.undefined)
      
      inline def setRenderMode(value: canvas | svg | none): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setRenderTextLayer(value: Boolean): Self = StObject.set(x, "renderTextLayer", value.asInstanceOf[js.Any])
      
      inline def setRenderTextLayerUndefined: Self = StObject.set(x, "renderTextLayer", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type RenderFunction = js.Function0[Element]
  
  trait TextItem extends StObject {
    
    var dir: String
    
    var fontName: String
    
    var hasEOL: Boolean
    
    var height: Double
    
    var str: String
    
    var transform: js.Array[Double]
    
    var width: Double
  }
  object TextItem {
    
    inline def apply(
      dir: String,
      fontName: String,
      hasEOL: Boolean,
      height: Double,
      str: String,
      transform: js.Array[Double],
      width: Double
    ): TextItem = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], hasEOL = hasEOL.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextItem]
    }
    
    extension [Self <: TextItem](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setHasEOL(value: Boolean): Self = StObject.set(x, "hasEOL", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: js.Array[Double]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformVarargs(value: Double*): Self = StObject.set(x, "transform", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextLayerItemInternal extends StObject {
    
    var fontName: String
    
    var height: Double
    
    var itemIndex: Double
    
    var page: PDFPageItem
    
    var rotate: js.UndefOr[`0` | `90` | `180` | `270`] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var str: String
    
    var transform: js.Array[Double]
    
    var width: Double
  }
  object TextLayerItemInternal {
    
    inline def apply(
      fontName: String,
      height: Double,
      itemIndex: Double,
      page: PDFPageItem,
      str: String,
      transform: js.Array[Double],
      width: Double
    ): TextLayerItemInternal = {
      val __obj = js.Dynamic.literal(fontName = fontName.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextLayerItemInternal]
    }
    
    extension [Self <: TextLayerItemInternal](x: Self) {
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setPage(value: PDFPageItem): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRotate(value: `0` | `90` | `180` | `270`): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: js.Array[Double]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformVarargs(value: Double*): Self = StObject.set(x, "transform", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

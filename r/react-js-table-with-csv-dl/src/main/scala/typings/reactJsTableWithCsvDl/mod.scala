package typings.reactJsTableWithCsvDl

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-js-table-with-csv-dl", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TableViewerProps, js.Object, Any]
  
  type TableViewer = Component[TableViewerProps, js.Object, Any]
  
  trait TableViewerProps extends StObject {
    
    /**
      * if you want to have a download button
      */
    var activateDownloadButton: js.UndefOr[Boolean] = js.undefined
    
    var activePageBoxStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var bodyCss: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * An array of objects. The key will be used for the table headers.
      */
    var content: js.Array[Any]
    
    var downloadButtonStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var errorColor: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var headerCss: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * An array of strings with the headers you want to display
      */
    var headers: js.Array[String]
    
    /**
      * Max table desired height
      */
    var maxHeight: Double
    
    var maxPagesToDisplay: js.UndefOr[Double] = js.undefined
    
    /**
      * Min table desired height
      */
    var minHeight: Double
    
    var pageBoxStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var pagination: js.UndefOr[Double] = js.undefined
    
    var renderLineNumber: js.UndefOr[Boolean] = js.undefined
    
    var reverseLineNumber: js.UndefOr[Boolean] = js.undefined
    
    var sortColumn: js.UndefOr[String] = js.undefined
    
    var successColor: js.UndefOr[String] = js.undefined
    
    var titleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var topPaginator: js.UndefOr[Boolean] = js.undefined
    
    var warningColor: js.UndefOr[String] = js.undefined
  }
  object TableViewerProps {
    
    inline def apply(content: js.Array[Any], headers: js.Array[String], maxHeight: Double, minHeight: Double): TableViewerProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableViewerProps]
    }
    
    extension [Self <: TableViewerProps](x: Self) {
      
      inline def setActivateDownloadButton(value: Boolean): Self = StObject.set(x, "activateDownloadButton", value.asInstanceOf[js.Any])
      
      inline def setActivateDownloadButtonUndefined: Self = StObject.set(x, "activateDownloadButton", js.undefined)
      
      inline def setActivePageBoxStyle(value: CSSProperties): Self = StObject.set(x, "activePageBoxStyle", value.asInstanceOf[js.Any])
      
      inline def setActivePageBoxStyleUndefined: Self = StObject.set(x, "activePageBoxStyle", js.undefined)
      
      inline def setBodyCss(value: CSSProperties): Self = StObject.set(x, "bodyCss", value.asInstanceOf[js.Any])
      
      inline def setBodyCssUndefined: Self = StObject.set(x, "bodyCss", js.undefined)
      
      inline def setContent(value: js.Array[Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: Any*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDownloadButtonStyle(value: CSSProperties): Self = StObject.set(x, "downloadButtonStyle", value.asInstanceOf[js.Any])
      
      inline def setDownloadButtonStyleUndefined: Self = StObject.set(x, "downloadButtonStyle", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHeaderCss(value: CSSProperties): Self = StObject.set(x, "headerCss", value.asInstanceOf[js.Any])
      
      inline def setHeaderCssUndefined: Self = StObject.set(x, "headerCss", js.undefined)
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxPagesToDisplay(value: Double): Self = StObject.set(x, "maxPagesToDisplay", value.asInstanceOf[js.Any])
      
      inline def setMaxPagesToDisplayUndefined: Self = StObject.set(x, "maxPagesToDisplay", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setPageBoxStyle(value: CSSProperties): Self = StObject.set(x, "pageBoxStyle", value.asInstanceOf[js.Any])
      
      inline def setPageBoxStyleUndefined: Self = StObject.set(x, "pageBoxStyle", js.undefined)
      
      inline def setPagination(value: Double): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setRenderLineNumber(value: Boolean): Self = StObject.set(x, "renderLineNumber", value.asInstanceOf[js.Any])
      
      inline def setRenderLineNumberUndefined: Self = StObject.set(x, "renderLineNumber", js.undefined)
      
      inline def setReverseLineNumber(value: Boolean): Self = StObject.set(x, "reverseLineNumber", value.asInstanceOf[js.Any])
      
      inline def setReverseLineNumberUndefined: Self = StObject.set(x, "reverseLineNumber", js.undefined)
      
      inline def setSortColumn(value: String): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
      
      inline def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
      
      inline def setSuccessColor(value: String): Self = StObject.set(x, "successColor", value.asInstanceOf[js.Any])
      
      inline def setSuccessColorUndefined: Self = StObject.set(x, "successColor", js.undefined)
      
      inline def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTopPaginator(value: Boolean): Self = StObject.set(x, "topPaginator", value.asInstanceOf[js.Any])
      
      inline def setTopPaginatorUndefined: Self = StObject.set(x, "topPaginator", js.undefined)
      
      inline def setWarningColor(value: String): Self = StObject.set(x, "warningColor", value.asInstanceOf[js.Any])
      
      inline def setWarningColorUndefined: Self = StObject.set(x, "warningColor", js.undefined)
    }
  }
}

package typings.reactPdf

import typings.pdfjsDist.typesSrcDisplayApiMod.DocumentInitParameters
import typings.pdfjsDist.typesSrcDisplayApiMod.PDFDocumentLoadingTask
import typings.pdfjsDist.typesSrcDisplayApiMod.TypedArray
import typings.reactPdf.distPageMod.TextItem
import typings.std.CSSStyleDeclaration
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(src: String): PDFDocumentLoadingTask = js.native
    def apply(src: js.typedarray.ArrayBuffer): PDFDocumentLoadingTask = js.native
    def apply(src: DocumentInitParameters): PDFDocumentLoadingTask = js.native
    def apply(src: TypedArray): PDFDocumentLoadingTask = js.native
    def apply(src: URL): PDFDocumentLoadingTask = js.native
  }
  
  trait Items extends StObject {
    
    var items: js.Array[TextItem]
    
    var styles: CSSStyleDeclaration
  }
  object Items {
    
    inline def apply(items: js.Array[TextItem], styles: CSSStyleDeclaration): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[TextItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: TextItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setStyles(value: CSSStyleDeclaration): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageNumber extends StObject {
    
    var pageNumber: String
  }
  object PageNumber {
    
    inline def apply(pageNumber: String): PageNumber = {
      val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageNumber] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: String): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    }
  }
}

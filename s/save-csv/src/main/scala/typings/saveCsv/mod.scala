package typings.saveCsv

import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("save-csv", JSImport.Namespace)
  @js.native
  def apply(array: js.Array[_]): Unit = js.native
  @JSImport("save-csv", JSImport.Namespace)
  @js.native
  def apply(array: js.Array[_], options: SaveCsvProps): Unit = js.native
  
  @js.native
  trait SaveCsvProps extends StObject {
    
    var bom: js.UndefOr[Boolean] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var filename: String = js.native
    
    var formatter: js.UndefOr[js.Function1[/* value */ String | JSON, Unit]] = js.native
    
    var mime: js.UndefOr[String] = js.native
    
    var quote: js.UndefOr[String] = js.native
    
    var sep: js.UndefOr[String] = js.native
  }
  object SaveCsvProps {
    
    @scala.inline
    def apply(filename: String): SaveCsvProps = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[SaveCsvProps]
    }
    
    @scala.inline
    implicit class SaveCsvPropsMutableBuilder[Self <: SaveCsvProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatter(value: /* value */ String | JSON => Unit): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
      
      @scala.inline
      def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
}

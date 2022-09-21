package typings.saveCsv

import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(array: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(array: js.Array[Any], options: SaveCsvProps): Unit = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("save-csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SaveCsvProps extends StObject {
    
    var bom: js.UndefOr[Boolean] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var filename: String
    
    var formatter: js.UndefOr[js.Function1[/* value */ String | JSON, Unit]] = js.undefined
    
    var mime: js.UndefOr[String] = js.undefined
    
    var quote: js.UndefOr[String] = js.undefined
    
    var sep: js.UndefOr[String] = js.undefined
  }
  object SaveCsvProps {
    
    inline def apply(filename: String): SaveCsvProps = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[SaveCsvProps]
    }
    
    extension [Self <: SaveCsvProps](x: Self) {
      
      inline def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFormatter(value: /* value */ String | JSON => Unit): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
}

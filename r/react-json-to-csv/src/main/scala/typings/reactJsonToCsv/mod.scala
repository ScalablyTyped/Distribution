package typings.reactJsonToCsv

import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-json-to-csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CsvDownloadProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CsvDownloadProps
    extends StObject
       with HTMLAttributes[HTMLButtonElement] {
    
    var data: js.Object | js.Array[js.Object]
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object CsvDownloadProps {
    
    inline def apply(data: js.Object | js.Array[js.Object]): CsvDownloadProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CsvDownloadProps]
    }
    
    extension [Self <: CsvDownloadProps](x: Self) {
      
      inline def setData(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}

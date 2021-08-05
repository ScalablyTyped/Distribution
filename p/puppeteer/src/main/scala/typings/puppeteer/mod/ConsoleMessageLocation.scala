package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleMessageLocation extends StObject {
  
  /**
    * Column number in the resource if known.
    */
  var columnNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * Line number in the resource if known
    */
  var lineNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * URL of the resource if known.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ConsoleMessageLocation {
  
  inline def apply(): ConsoleMessageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleMessageLocation]
  }
  
  extension [Self <: ConsoleMessageLocation](x: Self) {
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

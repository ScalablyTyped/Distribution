package typings.puppeteerCore.mod

import typings.puppeteerCore.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEntry extends StObject {
  
  /**
    * The covered range as start and end positions.
    */
  var ranges: js.Array[End]
  
  /**
    * The content of the style sheet or script.
    */
  var text: String
  
  /**
    * The URL of the style sheet or script.
    */
  var url: String
}
object CoverageEntry {
  
  inline def apply(ranges: js.Array[End], text: String, url: String): CoverageEntry = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEntry]
  }
  
  extension [Self <: CoverageEntry](x: Self) {
    
    inline def setRanges(value: js.Array[End]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: End*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

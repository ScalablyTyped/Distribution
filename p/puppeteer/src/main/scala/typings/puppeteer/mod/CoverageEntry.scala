package typings.puppeteer.mod

import typings.puppeteer.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEntry extends StObject {
  
  var ranges: js.Array[End]
  
  var text: String
  
  var url: String
}
object CoverageEntry {
  
  @scala.inline
  def apply(ranges: js.Array[End], text: String, url: String): CoverageEntry = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEntry]
  }
  
  @scala.inline
  implicit class CoverageEntryMutableBuilder[Self <: CoverageEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: js.Array[End]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: End*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

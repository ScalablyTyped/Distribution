package typings.puppeteer.mod

import typings.devtoolsProtocol.mod.Protocol.Profiler.ScriptCoverage
import typings.puppeteer.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSCoverageEntry
  extends StObject
     with CoverageEntry {
  
  /**
    * Raw V8 script coverage entry.
    */
  var rawScriptCoverage: js.UndefOr[ScriptCoverage] = js.undefined
}
object JSCoverageEntry {
  
  inline def apply(ranges: js.Array[End], text: String, url: String): JSCoverageEntry = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSCoverageEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSCoverageEntry] (val x: Self) extends AnyVal {
    
    inline def setRawScriptCoverage(value: ScriptCoverage): Self = StObject.set(x, "rawScriptCoverage", value.asInstanceOf[js.Any])
    
    inline def setRawScriptCoverageUndefined: Self = StObject.set(x, "rawScriptCoverage", js.undefined)
  }
}

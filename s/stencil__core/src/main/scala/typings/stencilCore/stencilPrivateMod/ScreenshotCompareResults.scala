package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Author
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotCompareResults extends StObject {
  
  var a: Author
  
  var appNamespace: String
  
  var b: Author
  
  var diffs: js.Array[ScreenshotDiff]
  
  var id: String
  
  var timestamp: Double
  
  var url: String
}
object ScreenshotCompareResults {
  
  inline def apply(
    a: Author,
    appNamespace: String,
    b: Author,
    diffs: js.Array[ScreenshotDiff],
    id: String,
    timestamp: Double,
    url: String
  ): ScreenshotCompareResults = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], appNamespace = appNamespace.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], diffs = diffs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotCompareResults]
  }
  
  extension [Self <: ScreenshotCompareResults](x: Self) {
    
    inline def setA(value: Author): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAppNamespace(value: String): Self = StObject.set(x, "appNamespace", value.asInstanceOf[js.Any])
    
    inline def setB(value: Author): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setDiffs(value: js.Array[ScreenshotDiff]): Self = StObject.set(x, "diffs", value.asInstanceOf[js.Any])
    
    inline def setDiffsVarargs(value: ScreenshotDiff*): Self = StObject.set(x, "diffs", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

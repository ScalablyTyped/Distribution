package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latest extends StObject {
  
  var latest: String
}
object Latest {
  
  inline def apply(latest: String): Latest = {
    val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latest]
  }
  
  extension [Self <: Latest](x: Self) {
    
    inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
  }
}

package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneData extends StObject {
  
  var style: Any
}
object PaneData {
  
  inline def apply(style: Any): PaneData = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaneData] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}

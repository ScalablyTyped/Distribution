package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rendered extends StObject {
  
  var rendered: Boolean
}
object Rendered {
  
  inline def apply(rendered: Boolean): Rendered = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rendered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rendered] (val x: Self) extends AnyVal {
    
    inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
  }
}

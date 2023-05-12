package typings.remixRunRouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasErrorBoundary extends StObject {
  
  var hasErrorBoundary: Boolean
}
object HasErrorBoundary {
  
  inline def apply(hasErrorBoundary: Boolean): HasErrorBoundary = {
    val __obj = js.Dynamic.literal(hasErrorBoundary = hasErrorBoundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasErrorBoundary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasErrorBoundary] (val x: Self) extends AnyVal {
    
    inline def setHasErrorBoundary(value: Boolean): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])
  }
}

package typings.sass.anon

import typings.sass.sourceSpanMod.SourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deprecation extends StObject {
  
  var deprecation: Boolean
  
  var span: js.UndefOr[SourceSpan] = js.undefined
  
  var stack: js.UndefOr[String] = js.undefined
}
object Deprecation {
  
  inline def apply(deprecation: Boolean): Deprecation = {
    val __obj = js.Dynamic.literal(deprecation = deprecation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deprecation]
  }
  
  extension [Self <: Deprecation](x: Self) {
    
    inline def setDeprecation(value: Boolean): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: SourceSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}

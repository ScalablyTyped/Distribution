package typings.sass.anon

import typings.sass.typesLoggerSourceSpanMod.SourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Span extends StObject {
  
  var span: SourceSpan
}
object Span {
  
  inline def apply(span: SourceSpan): Span = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Span]
  }
  
  extension [Self <: Span](x: Self) {
    
    inline def setSpan(value: SourceSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}

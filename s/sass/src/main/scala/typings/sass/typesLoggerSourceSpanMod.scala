package typings.sass

import typings.sass.typesLoggerSourceLocationMod.SourceLocation
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLoggerSourceSpanMod {
  
  trait SourceSpan extends StObject {
    
    /**
      * Text surrounding the span.
      *
      * If this is set, it must include only whole lines, and it must include at
      * least all line(s) which are partially covered by this span.
      */
    var context: js.UndefOr[String] = js.undefined
    
    /**
      * The end of this span, exclusive.
      *
      * If [[start]] and [[end]] refer to the same location, the span has zero
      * length and refers to the point immediately after [[start]] and before the
      * next character.
      */
    var end: SourceLocation
    
    /** The beginning of this span, inclusive. */
    var start: SourceLocation
    
    /** The text covered by the span. */
    var text: String
    
    /** The canonical URL of the file this span refers to. */
    var url: js.UndefOr[URL] = js.undefined
  }
  object SourceSpan {
    
    inline def apply(end: SourceLocation, start: SourceLocation, text: String): SourceSpan = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceSpan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceSpan] (val x: Self) extends AnyVal {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEnd(value: SourceLocation): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SourceLocation): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}

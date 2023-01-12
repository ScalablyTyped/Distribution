package typings.prosemirrorView.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InclusiveEnd
  extends StObject
     with /**
  Specs may have arbitrary additional properties.
  */
/* key */ StringDictionary[Any] {
  
  /**
    Determines how the right side of the decoration is mapped.
    See
    [`inclusiveStart`](https://prosemirror.net/docs/ref/#view.Decoration^inline^spec.inclusiveStart).
    */
  var inclusiveEnd: js.UndefOr[Boolean] = js.undefined
  
  /**
    Determines how the left side of the decoration is
    [mapped](https://prosemirror.net/docs/ref/#transform.Position_Mapping) when content is
    inserted directly at that position. By default, the decoration
    won't include the new content, but you can set this to `true`
    to make it inclusive.
    */
  var inclusiveStart: js.UndefOr[Boolean] = js.undefined
}
object InclusiveEnd {
  
  inline def apply(): InclusiveEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InclusiveEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InclusiveEnd] (val x: Self) extends AnyVal {
    
    inline def setInclusiveEnd(value: Boolean): Self = StObject.set(x, "inclusiveEnd", value.asInstanceOf[js.Any])
    
    inline def setInclusiveEndUndefined: Self = StObject.set(x, "inclusiveEnd", js.undefined)
    
    inline def setInclusiveStart(value: Boolean): Self = StObject.set(x, "inclusiveStart", value.asInstanceOf[js.Any])
    
    inline def setInclusiveStartUndefined: Self = StObject.set(x, "inclusiveStart", js.undefined)
  }
}

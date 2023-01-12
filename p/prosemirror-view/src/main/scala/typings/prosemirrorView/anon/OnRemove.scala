package typings.prosemirrorView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRemove extends StObject {
  
  /**
    When given, this function will be called for each decoration
    that gets dropped as a result of the mapping, passing the
    spec of that decoration.
    */
  var onRemove: js.UndefOr[js.Function1[/* decorationSpec */ Any, Unit]] = js.undefined
}
object OnRemove {
  
  inline def apply(): OnRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnRemove]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnRemove] (val x: Self) extends AnyVal {
    
    inline def setOnRemove(value: /* decorationSpec */ Any => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
  }
}
